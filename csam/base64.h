/**
 * Created at 2020/7/1 04:06.
 * 
 * 1> String to binary data stream.
 * 2> Every three 8-bit binary is converted into four 6-bit binary.
 * 3> 6-bit binary conversion decimal.
 * 4> According to the decimal value from the Base64 get characters from alphabet table.
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

    uint8_t const *alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    uint8_t *__csb64(uint8_t const *src, bool isurl);
    uint8_t *csb64(uint8_t const *src);
    uint8_t *urlb64(uint8_t const *src);

    char *__b64cs(uint8_t const *src);

    uint8_t *__csb64(uint8_t const *src, bool isurl)
    {
        uint8_t *_alphabet = mlcustr(64);
        cscpy(alphabet, _alphabet);

        if (isurl)
        {
            short _alphabetlen = cslen(_alphabet);
            _alphabet[_alphabetlen - 2] = '-';
            _alphabet[_alphabetlen - 1] = '_';
        }
        size_t srclen = cslen(src);
        size_t dstlen = (srclen / 3 + (srclen % 3 != 0 ? 1 : 0)) * 4;
        uint8_t *dst = mlcustr(dstlen);
        for (size_t srci = 0, dsti = 0; dsti < dstlen; srci += 3, dsti += 4)
        {
            size_t srci1 = srci + 1, srci2 = srci + 2;
            dst[dsti] = _alphabet[src[srci] >> 2];
            dst[dsti + 1] = _alphabet[(src[srci] & 0x3) << 4 | src[srci1] >> 4];
            dst[dsti + 2] = src[srci1] != '\0' && srci1 != srclen
                                ? _alphabet[(src[srci1] & 0xf) << 2 | src[srci2] >> 6]
                                : '=';
            dst[dsti + 3] = src[srci2] != '\0' && srci2 != srclen + 1
                                ? _alphabet[src[srci2] & 0x3f]
                                : '=';
        }
        if (isurl)
        {
            strepch(dst, '-', '+');
            strepch(dst, '_', '/');
        }
        return dst;
    }

    inline uint8_t *csb64(uint8_t const *src)
    {
        __csb64(src, false);
    }

    inline uint8_t *urlb64(uint8_t const *src)
    {
        __csb64(src, true);
    }

    char *__b64cs(uint8_t const *src)
    {
    }

#ifdef __cplusplus
}
#endif
