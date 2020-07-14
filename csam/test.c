
// #include "hexcvet.h"
#include "c.h"
// #include "base64.h"

// #include <stdio.h>

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

int main(int argc, char const *argv[])
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
        fseek(f, 0, SEEK_END);
        long flen = ftell(f);
        printf("%ld\n", flen);
        printf("%f\n", (float)flen / 1024);
        printf("%ld\n", ptrlen("hello,world\n"));
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printf("%ld\n", ptrlen(a));
        int b = 300;
        printf("%ld\n", ptrlen(&b));
    }
    return 0;
}
