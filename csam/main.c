#include <stdio.h>
#include <stdarg.h>

void print_int(int args, ...)
{
    va_list ap;         //va_list 用来保存传给函数的其他参数。
    va_start(ap, args); //说明可变参数从哪里开始
    for (int i = 0; i < args; i++)
    {
        printf("argument: %s\n", va_arg(ap, char const *));
    }
    va_end(ap);
}

int main(int argc, char const *argv[])
{
    print_int(argc, &argv);
    return 0;
}
