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

#ifndef _BASE64_H
#define _BASE64_H
#endif

#ifndef _LCJC_H
#include "lcjc.h"
#endif

    uint8_t *base64enc(uint8_t const *src);
    char *base64dec(uint8_t const *src);

    uint8_t *base64enc(uint8_t const *src)
    {
        uint8_t const *alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        size_t srclen = cslen(src);
        size_t rder = srclen % 3;

        size_t dstlen = (srclen / 3 + (rder != 0 ? 1 : 0)) * 4;
        uint8_t *dst = mlcustr(dstlen);
        size_t srci, dsti;
        for (srci = 0, dsti = 0; dsti < dstlen; srci += 3, dsti += 4)
        {
            dst[dsti] = alphabet[src[srci] >> 2];
            dst[dsti + 1] = alphabet[(src[srci] & 0x3) << 4 | (src[srci + 1] >> 4)];
            dst[dsti + 2] = alphabet[(src[srci + 1] & 0xf) << 2 | (src[srci + 2] >> 6)];
            dst[dsti + 3] = alphabet[src[srci + 2] & 0x3f];
        }

        if (rder == 1)
        {
            dst[dsti - 2] = '=';
        }

        if (rder == 1 || rder == 2)
        {
            dst[dsti - 1] = '=';
        }

        return dst;
    }

    char *base64dec(uint8_t const *src)
    {
    }

#ifdef __cplusplus
}
#endif
