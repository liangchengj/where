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

#include <string.h>
#include <malloc.h>
#include <assert.h>

#ifndef arrlen
#define arrlen(x) sizeof(x) / sizeof(x[0])
#endif

#ifndef print
#include <stdio.h>
#define print(s) printf(s)
#endif

#if !defined(outln) && defined(print)
#define outln() print("\n")
#endif

    void csup(char *src);
    void cslow(char *src);
    void cscrev(char *src);
    void cmvbts(char src, size_t lnum, size_t rnum);

    size_t ptrlen(void *x);

    size_t flen(FILE *f);

    char *strsub(char const *src, int start, int end);

    void csup(char *src)
    {
        assert(src != NULL);
        for (size_t i = 0; i < strlen(src); i++)
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
        for (size_t i = 0; i < strlen(src); i++)
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
        for (size_t i = 0; i < strlen(src); i++)
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
        char *dst = (char *)malloc(dstlen * sizeof(char));
        for (size_t i = 0; i < dstlen; i++)
        {
            dst[i] = src[start + i];
        }
        return dst;
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

    size_t flen(FILE *f)
    {
        assert(f != NULL);
        fseek(f, 0, SEEK_END);
        return ftell(f);
    }

    size_t ptrlen(void *x)
    {
        if (false)
        {
            return -1;
        }
        else
        {
            printf("%ld\n", sizeof(x));
            printf("%d\n", (char **)x == NULL);
            printf(" ==> %ld\n", sizeof(((char *)x)[0]));
            char *slen = x;
            char *tmp = (char *)x;
            for (; *tmp; tmp++)
                ;
            return tmp - slen;
        }
        return 0;
    }

#ifdef __cplusplus
}
#endif