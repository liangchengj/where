#include <stdio.h>

int main(int argc, char const *argv[])
{
    int a[] = {1, 2, 3};
    printf("%d", arrlen(a));
    return 0;
}

inline void print(char const *str)
{
    printf("%s", str);
}
