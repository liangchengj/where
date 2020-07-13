/**
 * Created at 2020/7/14 02:17.
 * 
 * @author Liangcheng Juves
 */
#ifdef __cplusplus
extern "C"
{
#endif

#ifndef hexcvet_h
#define hexcvet_h
#endif

#include <stdlib.h>
#include <string.h>
#include <stdio.h>

    /* Color structure. */
    typedef struct
    {
        int r;
        int g;
        int b;
    } col;
    /* Parse hexadecimal characters into corresponding int values. */
    int chexint(char hex);
    /* Parse the hexadecimal string into the corresponding int value. */
    int strhexint(char *hex);

    /* Convert explicit strings to hexadecimal strings. */
    char *strhex(char const *src);

    /* Parse the hexadecimal string into the corresponding explicit string. */
    char *prshex(char const *hex);
    /* Parse the hexadecimal color string into the corresponding color structure. */
    col *prscolhex(char const *hex);

    int chexint(char hex)
    {
        if (hex >= '0' && hex <= '9')
        {
            return hex - '0';
        }
        if (hex >= 'A' && hex <= 'F')
        {
            return hex - 'A' + 10;
        }
        if (hex >= 'a' && hex <= 'f')
        {
            return hex - 'a' + 10;
        }
        return -1;
    }

    int strhexint(char *hex)
    {
        return chexint(hex[0]) * 16 /* radix */ + chexint(hex[1]);
    }

    char *strhex(char const *src)
    {
        size_t srclen = strlen(src);
        size_t dstlen = (srclen * 2) * sizeof(char);
        char *dst = (char *)malloc(dstlen);
        for (size_t i = 0; i < srclen; i++)
        {
            char hex[] = {'\0', '\0'};
            sprintf(hex, "%X", (src[i] & 0xff));
            if (hex[1] == '\0')
            {
                char tmp = hex[0];
                hex[0] = '0';
                hex[1] = tmp;
            }
            dst[i * 2] = hex[0];
            dst[i * 2 + 1] = hex[1];
        }
        return dst;
    }

    char *prshex(char const *hex)
    {
        size_t hexlen = strlen(hex);
        char *ascii = (char *)malloc((hexlen / 2) * sizeof(char));
        for (size_t i = 0; i < hexlen; i += 2)
        {
            char sub[] = {hex[i], hex[i + 1]};
            ascii[i / 2] = (char)strhexint(sub);
        }
        return ascii;
    }

    col *prscolhex(char const *hex)
    {
        int count = 1;
        col *dst = (col *)malloc(sizeof(col));
        for (size_t i = hex[0] == '#' ? 1 : 0;
             i < strlen(hex); i += 2)
        {
            char sub[] = {hex[i], hex[i + 1]};
            int val = strhexint(sub);
            if (count <= 3)
            {
                if (count == 1)
                {
                    dst->r = val;
                }
                else if (count == 2)
                {
                    dst->g = val;
                }
                else if (count == 3)
                {
                    dst->b = val;
                }
            }
            else
            {
                /* Skip the detection if it does not conform to the hexadecimal string. */
                break;
            }
            count++;
        }
        return dst;
    }

#ifdef __cplusplus
}
#endif