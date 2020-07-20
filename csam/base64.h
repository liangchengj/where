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
#ifndef _BASE64_H
#define _BASE64_H

#ifdef __cplusplus
extern "C"
{
#endif

#include "lcjc.h"
#include "mesty.h"

    uint8_t const *alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    uint8_t *__csb64(uint8_t const *src, bool isurl);
    uint8_t *csb64(uint8_t const *src);
    uint8_t *urlb64(uint8_t const *src);
    uint8_t *mimeb64(uint8_t const *src, void *fname);
    uint8_t *fb64(void *fpath);

    char *__b64cs(uint8_t const *src);

    uint8_t *__csb64(uint8_t const *src, bool isurl)
    {

        uint8_t *_alphabet = mlcustr(64);
        cscpy(alphabet, _alphabet);

        if (isurl)
        {
            short _alphabetlen = cslen(alphabet);
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

            if (isurl)
            {
                dst[dsti] = dst[dsti] == '-' ? '+' : dst[dsti];
                dst[dsti] = dst[dsti] == '_' ? '/' : dst[dsti];

                dst[dsti + 1] = dst[dsti + 1] == '-' ? '+' : dst[dsti + 1];
                dst[dsti + 1] = dst[dsti + 1] == '_' ? '/' : dst[dsti + 1];

                dst[dsti + 2] = dst[dsti + 2] == '-' ? '+' : dst[dsti + 2];
                dst[dsti + 2] = dst[dsti + 2] == '_' ? '/' : dst[dsti + 2];

                dst[dsti + 3] = dst[dsti + 3] == '-' ? '+' : dst[dsti + 3];
                dst[dsti + 3] = dst[dsti + 3] == '_' ? '/' : dst[dsti + 3];
            }
        }

        free(_alphabet);
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

    uint8_t *mimeb64(uint8_t const *src, void *fname)
    {
        uint8_t *const begin = "data:";
        uint8_t *mesty = mestyof(fname);
        uint8_t *withmes = ";base64,";
        uint8_t *end = urlb64(src);

        size_t beginlen = cslen(begin);
        size_t mestylen = cslen(mesty);
        size_t withmeslen = cslen(withmes);
        size_t endlen = cslen(end);

        uint8_t *dst = mlcustr(beginlen + mestylen + endlen);
        for (size_t i = 0; i < beginlen; i++)
        {
            dst[i] = begin[i];
        }

        for (size_t i = 0; i < mestylen; i++)
        {
            dst[beginlen + i] = mesty[i];
        }
        for (size_t i = 0; i < withmeslen; i++)
        {
            dst[beginlen + mestylen + i] = withmes[i];
        }
        for (size_t i = 0; i < endlen; i++)
        {
            dst[beginlen + mestylen + withmeslen + i] = end[i];
        }

        return dst;
    }

    uint8_t *fb64(void *fpath)
    {
        return mimeb64(strmcs(fopen(fpath, "rb")), fpath);
    }

    char *__b64cs(uint8_t const *src)
    {
        int from_alphabat[256];
        for (size_t i = 0; i < arrlen(from_alphabat); i++)
        {
            from_alphabat[i] = -1;
        }
    }

#ifdef __cplusplus
}
#endif

#endif /* _BASE64_H */
