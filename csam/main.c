#include <stdio.h>
// #include <string.h>
// #include <malloc.h>

// #include <stdarg.h>
#include "base64.h"
#include "ansicol.h"

// void print_int(int args, ...)
// {
//     va_list ap;         //va_list 用来保存传给函数的其他参数。
//     va_start(ap, args); //说明可变参数从哪里开始
//     for (int i = 0; i < args; i++)
//     {
//         printf("argument: %s\n", va_arg(ap, char const *));
//     }
//     va_end(ap);
// }

// int main(int argc, char const *argv[])
// {
//     print_int(argc, &argv);

//     return 0;
// }

char *base64_encode(char *binData, char *base64, int binLength)
{
    int i = 0;
    int j = 0;
    int current = 0;
    for (i = 0; i < binLength; i += 3)
    {

        //获取第一个6位
        current = (*(binData + i) >> 2) & 0x3F;
        *(base64 + j++) = base64_alphabet[current];

        //获取第二个6位的前两位
        current = (*(binData + i) << 4) & 0x30;

        //如果只有一个字符，那么需要做特殊处理
        if (binLength <= (i + 1))
        {
            *(base64 + j++) = base64_alphabet[current];
            *(base64 + j++) = '=';
            *(base64 + j++) = '=';
            break;
        }

        //获取第二个6位的后四位
        current |= (*(binData + i + 1) >> 4) & 0xf;
        *(base64 + j++) = base64_alphabet[current];
        //获取第三个6位的前四位
        current = (*(binData + i + 1) << 2) & 0x3c;
        if (binLength <= (i + 2))
        {
            *(base64 + j++) = base64_alphabet[current];
            *(base64 + j++) = '=';
            break;
        }

        //获取第三个6位的后两位
        current |= (*(binData + i + 2) >> 6) & 0x03;
        *(base64 + j++) = base64_alphabet[current];

        //获取第四个6位
        current = *(binData + i + 2) & 0x3F;
        *(base64 + j++) = base64_alphabet[current];
    }
    *(base64 + j) = '\0';

    return base64;
}

char *base64_decode(char const *base64Str, char *debase64Str, int encodeStrLen)
{
    int i = 0;
    int j = 0;
    int k = 0;
    char temp[4] = "";

    for (i = 0; i < encodeStrLen; i += 4)
    {
        for (j = 0; j < 64; j++)
        {
            if (*(base64Str + i) == base64_alphabet[j])
            {
                temp[0] = j;
            }
        }

        for (j = 0; j < 64; j++)
        {
            if (*(base64Str + i + 1) == base64_alphabet[j])
            {
                temp[1] = j;
            }
        }

        for (j = 0; j < 64; j++)
        {
            if (*(base64Str + i + 2) == base64_alphabet[j])
            {
                temp[2] = j;
            }
        }

        for (j = 0; j < 64; j++)
        {
            if (*(base64Str + i + 3) == base64_alphabet[j])
            {
                temp[3] = j;
            }
        }

        *(debase64Str + k++) = ((temp[0] << 2) & 0xFC) | ((temp[1] >> 4) & 0x03);
        if (*(base64Str + i + 2) == '=')
            break;

        *(debase64Str + k++) = ((temp[1] << 4) & 0xF0) | ((temp[2] >> 2) & 0x0F);
        if (*(base64Str + i + 3) == '=')
            break;

        *(debase64Str + k++) = ((temp[2] << 6) & 0xF0) | (temp[3] & 0x3F);
    }
    return debase64Str;
}

int main(int argc, char const *argv[])
{
    // char const *msg = "hello,world\n";
    // char const *ansi = ANSI_FG_GREEN;
    // char *toprnt = (char *)malloc(strlen(ansi) + strlen(msg));
    // strcpy(toprnt, ansi);
    // strcat(toprnt, ANSI_SHOW_CURSOR);
    // strcat(toprnt, msg);
    // strcat(toprnt, ANSI_NONE);
    // printf("%s", toprnt);
    // printf("%s", ANSI_MOVE_CURSOR_POSTION(1, 10));

    char const *msg = "hello,world\n";
    acolprnt(ANSI_FG_RED, msg);
    blackprnt(msg);
    redprnt(msg);
    
}
