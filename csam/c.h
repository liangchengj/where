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

#include <string.h>

#ifndef arrlen
#define arrlen(x) sizeof(x) / sizeof(x[0])
#endif

#ifndef outln
#define outln() printf("\n")
#endif

    void csup(char *src);
    void cslow(char *src);
    void cscrev(char *src);

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

#ifdef __cplusplus
}
#endif