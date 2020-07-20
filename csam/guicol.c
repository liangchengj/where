/**
 * Created at 2020/7/21 00:14.
 * 
 * @author Liangcheng Juves
 */
#include "ansicol.h"

int main(int argc, char const *argv[])
{
    acolprnt(ANSI_BG_BLUE, ANSI_NULL, "\b");
    for (size_t i = 0; i < 20; i++)
    {
        acolprnt(ANSI_BG_BLUE, ANSI_NULL, " ");
    }
    acolprnt(ANSI_BG_BLUE, ANSI_NULL, "Main Window");
    for (size_t i = 0; i < 14; i++)
    {
        acolprnt(ANSI_BG_BLUE, ANSI_NULL, " ");
    }
    acolprnt(ANSI_BG_BLUE, ANSI_NULL, "_ o x ");
    return 0;
}
