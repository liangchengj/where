/**
 * Created at 2020/7/13 23:53.
 * 
 * @author Liangcheng Juves
 */
#ifdef __cplusplus
extern "C"
{
#endif

#ifndef c_h
#define c_h
#endif

#ifndef true
#define true 1
#endif

#ifndef false
#define false 0
#endif

#include <stdio.h>
#include <malloc.h>
#include <assert.h>

#ifndef arrlen
#define arrlen(x) sizeof(x) / sizeof(x[0])
#endif

#ifndef twarrlen
#define twarrlen(x) sizeof(x) / sizeof(x[0][0])
#endif

#ifndef print
#define print(s) printf(s)
#endif

#if !defined(cotln) && defined(print)
#define cotln() print("\n")
#endif

    size_t ptrlen(void *x);
    size_t cslen(char *cs);

    void csup(char *src);
    void cslow(char *src);
    void cscrev(char *src);

    void cmvbts(char src, size_t lnum, size_t rnum);

    char *strsub(char const *src, int start, int end);

    size_t strmlen(FILE *f);
    char *strmcs(FILE *f);

    size_t ptrlen(void *x)
    {
        assert(x != NULL);
        // x :: len
        char *cpyptr = x;
        char *tmp = (char *)x;
        for (; *tmp; tmp++)
            ;
        return tmp - cpyptr;
    }

    size_t cslen(char *cs)
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

    void cmvbts(char src, size_t lnum, size_t rnum)
    {
        assert(&src != NULL && &lnum != NULL && &rnum != NULL);
        if (lnum != 0)
        {
            src <<= lnum;
        }
        if (rnum != 0)
        {
            src >>= rnum;
        }
    }

    char *strsub(char const *src, int start, int end)
    {
        assert(src != NULL && &start != NULL && &end != NULL);
        size_t dstlen = end - start;
        // 0 1 2 3 4 5 6 7
        //  a b c d e f g
        char *dst = (char *)malloc(dstlen * sizeof(char));
        for (size_t i = 0; i < dstlen; i++)
        {
            dst[i] = src[start + i];
        }
        return dst;
    }

    size_t strmlen(FILE *f)
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