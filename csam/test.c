
// #include "hexcvet.h"
// #include "c.h"
// #include <string.h>
// #include "base64.h"
// #include "mesty.h"
// #include "hexcvet.h"

// #include "base64.h"

// #include <string.h>

// #include <stdio.h>
// #include <malloc.h>

// unsigned char *base64_encode(unsigned char *str);

// #include "base64.h"

// int main(int argc, char const *argv[])
// {
//     char *dst = strhex(argv[1]);
//     printf("%s\n", dst);
//     char *ascii = prshex("E98293");
//     printf("%s\n", ascii);
//     char *colhex = "#90EAE4";
//     col *color = prscolhex(colhex);
//     printf("%d\n", color->r);
//     printf("%d\n", color->g);
//     printf("%d\n", color->b);

//     printf("%s", strsub("hello", 1, 4));

//     return 0;
// }

// int main(int argc, char const *argv[])
// {
//     char const *src = "hello";
//     char *dst;
//     b64enc(src, dst);
//     printf("%s\n", dst);
//     return 0;
// }

/* int main(int argc, char const *argv[])
{
    FILE *f = fopen(__FILE__, "r");
    if (f != NULL)
    {
        // char ch;
        // do
        // {
        //     ch = getc(f);
        //     putchar(ch);
        // } while (ch != EOF);
        // fseek(f, 0, SEEK_END);
        // long flen = ftell(f);
        // printf("%ld\n", flen);
        // printf("%f\n", (float)flen / 1024);
        // printf("%ld\n", ptrlen("hello,world\n"));
        // int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        // printf("%ld\n", ptrlen(a));
        // int b = 300;
        // printf("%ld\n", ptrlen(&b));

        // cotln();

        // printf("%ld\n", strmlen(f));

        // strmcs(f);
        printf("%s\n", strmcs(f));
    }
    return 0;
} */

// int main(int argc, char const *argv[])
// {
//     printf("%s\n", (char *)mestyof("a.txt"));
//     printf("%s\n", (char *)fextof("application/vnd.lotus-1-2-3"));
//     return 0;
// }

// int main(int argc, char const *argv[])
// {

//     int in = 100;

//     int s, y;

//     while ((s = in / 16) != 0)
//     {
//         y = in % 16;
//         s = in;
//     }

//     // E98293E68DB7
//     printf("%s\n", strhex("C#敏捷开发实践"));
//     printf("%ld\n", cslen("hello"));
//     printf("%s\n", "hello");
//     return 0;
// }

/* int main(int argc, char const *argv[])
{
    // char *a = "A";
    // printf("%ld\n", strlen(a));

    // printf("==> %d\n",a[0]);
    // printf("==> %d\n",a[1]);
    // printf("==> %d\n",a[2]);
    // printf("==> %d\n",a[3]);
    // printf("==> %d\n",a[4]);
    // printf("==> %d\n",a[5]);
    // printf("==> %d\n",a[6]);
    // printf("==> %d\n",a[7]);

    printf("%s\n", base64_encode("ABCDC"));

    return 0;
} */

// unsigned char *base64_encode(unsigned char *str) // "A"
// {
//     long len;
//     long str_len;
//     unsigned char *res;
//     int i, j;
//     //定义base64编码表
//     unsigned char *base64_table = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

//     //计算经过base64编码后的字符串长度
//     str_len = strlen(str); // 1

//     printf("( str_len ) %ld\n", str_len);

//     if (str_len % 3 == 0)
//         len = str_len / 3 * 4;
//     else
//         len = (str_len / 3 + 1) * 4; // 4

//     printf("( len ) %ld\n", len);

//     res = malloc(sizeof(unsigned char) * len + 1);
//     res[len] = '\0';

//     //以3个8位字符为一组进行编码
// loop:
//     for (i = 0, j = 0; i < len - 2; j += 3, i += 4)
//     {
//         printf("( str[j] ) %d\n", str[j]);
//         printf("( str[j] ) %c\n", (char)str[j]);
//         printf("( str[j + 1] ) %d\n", str[j + 1]);
//         printf("( str[j + 1] ) %c\n", (char)str[j + 1]);
//         printf("( str[j + 2] ) %d\n", str[j + 2]);
//         printf("( str[j + 2] ) %c\n", (char)str[j + 2]);

//         res[i] = base64_table[str[j] >> 2];                                     //取出第一个字符的前6位并找出对应的结果字符
//         res[i + 1] = base64_table[(str[j] & 0x3) << 4 | (str[j + 1] >> 4)];     //将第一个字符的后位与第二个字符的前4位进行组合并找到对应的结果字符
//         res[i + 2] = base64_table[(str[j + 1] & 0xf) << 2 | (str[j + 2] >> 6)]; //将第二个字符的后4位与第三个字符的前2位组合并找出对应的结果字符
//         res[i + 3] = base64_table[str[j + 2] & 0x3f];                           //取出第三个字符的后6位并找出结果字符
//     }

//     switch (str_len % 3)
//     {
//     case 1:
//         res[i - 2] = '=';
//         res[i - 1] = '=';
//         break;
//     case 2:
//         res[i - 1] = '=';
//         break;
//     }

//     printf("( res ) %s\n", res);

//     return res;
// }

// #include <stdio.h>

#include "base64.h"
#include "ansicol.h"
#include "mesty.h"
#include "hexcvet.h"

int main(int argc, char const *argv[])
{
    printf("%s\n", base64enc(argv[1]));
    // printf("%s\n", (char *)mestyof(".txt"));
    // printf("%s\n", strhex(".txt"));
    // redprnt(base64enc("JSON在线编辑"));
    // printf("%s\n", base64_encode("JSON在线编辑"));
    // printf("%s\n", "===================================>");
    // printf("%s\n", strmcs(fopen(__FILE__, "r")));
    return 0;
}
