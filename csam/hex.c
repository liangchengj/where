#include "c.h"
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int chexint(char hex);
int strhexint(char *hex);

char *strhex(char const *src);
char *prshex(char const *hex);

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

int main(int argc, char const *argv[])
{
    char *dst = strhex(argv[1]);
    printf("%s\n", dst);
    char *ascii = prshex(dst);
    printf("%s\n", ascii);
    return 0;
}
