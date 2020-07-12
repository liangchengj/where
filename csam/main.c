#include <stdio.h>
#include <stdarg.h>

void read_char(int i, ...)
{
    char c;
    va_list ap;
    va_start(ap, i);
    while ((c = va_arg(ap, char)) != 0)
    {
        printf("%c", c);
    }
    va_end(ap);
}

int main()
{
    read_char(0, 'a', 'b', 'c', '\0');
}
