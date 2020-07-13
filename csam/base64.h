/**
 * Created at 2020/7/1 04:06.
 * 
 * 1> String to binary data stream.
 * 2> Every three 8-bit binary is converted into four 6-bit binary.
 * 3> 6-bit binary conversion Decimal.
 * 4> According to the decimal value from The Base64 Get characters from Alphabet table.
 * 
 * @author Liangcheng Juves
 */

#ifdef __cplusplus
extern "C"
{
#endif

#ifndef base64_h
#define base64_h
#endif

#include <stdint.h>
#include <stdio.h>
#include "c.h"

    void b64enc(char const *src, char *dst);
    void b64dec(char const *src, char *dst);

    char b64_alphabet[] = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    void b64enc(char const *src, char *dst)
    {
        char *const out = (char *)malloc(strlen(src) * 8 * sizeof(char));
        printf("%sb\n", src);
    }

    void b64dec(char const *src, char *dst)
    {
    }

#ifdef __cplusplus
}
#endif
