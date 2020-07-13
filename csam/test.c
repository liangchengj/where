
#include "hexcvet.h"
// #include "c.h"
#include "base64.h"

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

int main(int argc, char const *argv[])
{
    char const *src = "hello";
    char *dst;
    b64enc(src, dst);
    printf("%s\n", dst);
    return 0;
}
