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

#include <stdio.h>
#include <string.h>

#ifndef arrlen
#define arrlen(x) sizeof(x) / sizeof(x[0])
#endif

    // #ifndef print
    // #define print(i) printf("%d", i)
    // #define print(s) printf("%s", s)
    // #define print(l) printf("%ld", l)
    // #endif

#if !defined(outln) /* && defined(print) */
#define outln() printf("\n")
#endif

    void csup(char *src);
    void cslow(char *src);
    void cscrev(char *src);
    void cmvbts(char src, size_t lnum, size_t rnum);

    char *strsub(char const *src, int start, int end);

    void csup(char *src)
    {
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
        for (size_t i = 0; i < strlen(src); i++)
        {
            src[i] ^= 32;
        }
    }

    char *strsub(char const *src, int start, int end)
    {
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
        if (lnum != 0)
        {
            src <<= lnum;
        }
        if (rnum != 0)
        {
            src >>= rnum;
        }
    }

#ifdef __cplusplus
}
#endif