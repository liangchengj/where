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
#define arrlen(x) sizeof(x) / sizeof(x[0])
#define twarrlen(x) sizeof(x) / sizeof(x[0][0])
#endif /* _LCJC_H */

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
#endif /* _STDBOOL */

#if !defined(_STDINT_H) && !defined(_STDINT)
#include <stdint.h>
#endif /* _STDINT_H  _STDINT */

#ifndef forever
#define forever for (;;)
#endif

    /* Allocate memory for a string of characters. */
    char *mlcstr(size_t len);
    /* Allocate memory for a string of unsigned characters. */
    uint8_t *mlcustr(size_t len);
    /* Allocate memory for the file input byte stream. */
    char *mlcstrm(size_t len);

    /* Get the length of the address pointed to by the pointer. */
    size_t ptrlen(void *x);
    /* Get the length of the string. */
    size_t cslen(char const *cs);

    void csup(char *src);
    void cslow(char *src);
    void cscrev(char *src);

    void cscpy(char const *src, char *dst);

    char *strsub(char const *src, int start, int end);
    void strepch(char *src, char const old, char const new);
    void strepall(char *src, char const *old, char const *new);

    /* Get the length of the file input stream. */
    size_t strmlen(FILE *f);
    /* Get the byte stream of the file input stream. */
    char *strmcs(FILE *f);

    inline char *mlcstr(size_t len)
    {
        char *dst = (char *)malloc((len + 1) * sizeof(char));
        dst[len] = '\0';
        return dst;
    }

    inline uint8_t *mlcustr(size_t len)
    {
        uint8_t *dst = (uint8_t *)malloc((len + 1) * sizeof(uint8_t));
        dst[len] = '\0';
        return dst;
    }

    inline char *mlcstrm(size_t len)
    {
        char *dst = (char *)malloc((len + 1) * sizeof(char));
        dst[len] = EOF;
        return dst;
    }

    size_t ptrlen(void *x)
    {
        assert(x != NULL);
        // x :: len
        char *cpyptr = (char *)x;
        char *tmp = cpyptr;
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
        for (size_t i = 0; i < ptrlen(src); src[i] ^= 32,
                    i++)
            ;
    }

    void cscpy(char const *src, char *dst)
    {
        assert(src != NULL && dst != NULL);
        for (size_t i = 0; i < cslen(src); dst[i] = src[i],
                    i++)
            ;
    }

    char *strsub(char const *src, int start, int end)
    {
        assert(src != NULL && &start != NULL && &end != NULL);
        size_t dstlen = end - start;
        // 0 1 2 3 4 5 6 7
        //  a b c d e f g
        char *dst = mlcstr(dstlen);
        for (size_t i = 0; i < dstlen; dst[i] = src[start + i],
                    i++)
            ;
        return dst;
    }

    inline void strepch(char *src, char const old, char const new)
    {
        assert(src != NULL && &old != NULL && &new != NULL);
        for (size_t i = 0; i < cslen(src); i++)
        {
            if (src[i] == old)
            {
                src[i] = new;
            }
        }
    }

    void strepall(char *src, char const *old, char const *new)
    {
        size_t oldlen = cslen(old);
        char *dst = mlcstr(cslen(old));
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
        // Define the function pointer.
        size_t (*callstrmlen)(FILE *) = strmlen;
        // Use the function pointer to call the function.
        size_t strmlen = callstrmlen(f);
        // Allocate memory.
        char *strmcs = mlcstrm(strmlen);
        fseek(f, 0, SEEK_SET);
        {
            /* Perform the read file input byte stream operation. */
            char c;
            for (size_t i = 0, c; (c = getc(f)) != EOF; strmcs[i] = c,
                        i++)
                ;
        }
        return strmcs;
    }

#ifdef __cplusplus
}
#endif