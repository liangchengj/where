/**
 * Created at 2020/7/13 23:53.
 * 
 * @author Liangcheng Juves
 */
#ifdef __cplusplus
extern "C"
{
#endif

#ifndef _LCJC_H
#define _LCJC_H
#endif

#if !defined(_STDIO_H) && !defined(_INC_STDIO)
#include <stdio.h>
#endif

#if !defined(_MALLOC_H) && !defined(_INC_MALLOC)
#include <malloc.h>
#endif

#if !defined(_ASSERT_H)
#include <assert.h>
#endif

#ifndef _STDBOOL
#include <stdbool.h>
#endif

#if !defined(_STDINT_H) && !defined(_STDINT)
#include <stdint.h>
#endif

#ifndef arrlen
#define arrlen(x) sizeof(x) / sizeof(x[0])
#endif

#ifndef twarrlen
#define twarrlen(x) sizeof(x) / sizeof(x[0][0])
#endif

    /* Allocate memory for a string of characters. */
    char *mlcstr(size_t len);
    /* Allocate memory for a string of unsigned characters. */
    uint8_t *mlcustr(size_t len);

    /* Get the length of the address pointed to by the pointer. */
    size_t ptrlen(void *x);
    /* Get the length of the string. */
    size_t cslen(char const *cs);

    void csup(char *src);
    void cslow(char *src);
    void cscrev(char *src);

    char *strsub(char const *src, int start, int end);

    /* Get the length of the file input stream. */
    size_t strmlen(FILE *f);
    /* Get the byte stream of the file input stream. */
    char *strmcs(FILE *f);

    inline char *mlcstr(size_t len)
    {
        char *dst = (char *)malloc(len * sizeof(char) + 1);
        dst[len] = '\0';
        return dst;
    }

    inline uint8_t *mlcustr(size_t len)
    {
        uint8_t *dst = (uint8_t *)malloc(len * sizeof(uint8_t) + 1);
        dst[len] = '\0';
        return dst;
    }

    size_t ptrlen(void *x)
    {
        assert(x != NULL);
        // x :: len
        char *cpyptr = (char *)x;
        char *tmp = (char *)x;
        for (; *tmp; tmp++)
            ;
        return tmp - cpyptr;
    }

    size_t cslen(char const *cs)
    {
        assert(cs != NULL);
        size_t len = 0;
        for (; cs[len] != '\0'; len++)
            ;
        return len;
    }

    void csup(char *src)
    {
        assert(src != NULL);
        for (size_t i = 0; i < ptrlen(src); i++)
        {
            if (src[i] >= 'a' && src[i] <= 'z')
            {
                src[i] -= 32;
            }
        }
    }

    void cslow(char *src)
    {
        assert(src != NULL);
        for (size_t i = 0; i < ptrlen(src); i++)
        {
            if (src[i] >= 'A' && src[i] <= 'Z')
            {
                src[i] += 32;
            }
        }
    }

    void cscrev(char *src)
    {
        assert(src != NULL);
        for (size_t i = 0; i < ptrlen(src); i++)
        {
            src[i] ^= 32;
        }
    }

    char *strsub(char const *src, int start, int end)
    {
        assert(src != NULL && &start != NULL && &end != NULL);
        size_t dstlen = end - start;
        // 0 1 2 3 4 5 6 7
        //  a b c d e f g
        char *dst = mlcstr(dstlen);
        for (size_t i = 0; i < dstlen; i++)
        {
            dst[i] = src[start + i];
        }
        return dst;
    }

    inline size_t strmlen(FILE *f)
    {
        assert(f != NULL);
        fseek(f, 0, SEEK_END);
        return ftell(f);
    }

    char *strmcs(FILE *f)
    {
        assert(f != NULL);
        size_t (*callstrmlen)(FILE *) = strmlen;
        size_t strmlen = callstrmlen(f);
        char *strmcs = (char *)malloc(strmlen);
        fseek(f, 0, SEEK_SET);
        size_t i = 0;
        char c;
        do
        {
            c = getc(f);
            strmcs[i] = c;
            i++;
        } while (c != EOF);
        return strmcs;
    }

#ifdef __cplusplus
}
#endif