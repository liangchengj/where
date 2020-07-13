
#include "hexcvet.h"

int main(int argc, char const *argv[])
{
    char *dst = strhex(argv[1]);
    printf("%s\n", dst);
    char *ascii = prshex(dst);
    printf("%s\n", ascii);
    char *colhex = "#90EAE4";
    col *col = prscolhex(colhex);
    printf("%d\n", col->r);
    printf("%d\n", col->g);
    printf("%d\n", col->b);
    return 0;
}
