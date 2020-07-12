#include <stdio.h>
#include <stdarg.h>

void print_int(int args, ...)
{
    va_list ap;         //va_list �������洫������������������
    va_start(ap, args); //˵���ɱ���������￪ʼ
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
