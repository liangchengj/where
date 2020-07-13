/**
 * Created at 2020/7/1 06:48.
 * 
 * @author Liangcheng Juves
 */
#ifndef ansicol_h
#define ansicol_h
#endif

#ifdef __cplusplus
extern "C"
{
#endif

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define ANSI_FG_BLACK "\033[30m"
#define ANSI_FG_RED "\033[31m"
#define ANSI_FG_GREEN "\033[32m"
#define ANSI_FG_YELLOW "\033[33m"
#define ANSI_FG_BLUE "\033[34m"
#define ANSI_FG_FUCHSIA "\033[35m"
#define ANSI_FG_CYAN "\033[36m"
#define ANSI_FG_WHITE "\033[37m"

#define ANSI_BG_BLACK "\033[40m"
#define ANSI_BG_RED "\033[41m"
#define ANSI_BG_GREEN "\033[42m"
#define ANSI_BG_YELLOW "\033[43m"
#define ANSI_BG_BLUE "\033[44m"
#define ANSI_BG_FUCHSIA "\033[45m"
#define ANSI_BG_CYAN "\033[46m"
#define ANSI_BG_WHITE "\033[47m"

#define ANSI_NONE "\033[0m"
#define ANSI_HIGH_LIGHT "\033[1m"
#define ANSI_UNDER_LINE "\033[4m"
#define ANSI_FLASHING "\033[5m"
#define ANSI_REVERSE "\033[7m"
#define ANSI_BLANKING "\033[8m"

#define ANSI_CLEAR_SCREEN "\033[2J"
#define ANSI_CLEAR_CONTENT_FROM_CURSOR_OF_EOL "\033[K"
#define char const *ANSI_MOVE_CURSOR_POSTION(int y, int x);

#define ANSI_MOVE_CURSOR_UP(n) "\033[" + n + "A"
#define ANSI_MOVE_CURSOR_DOWN(n) "\033[" + n + "B"
#define ANSI_MOVE_CURSOR_RIGHT(n) "\033[" + n + "C"
#define ANSI_MOVE_CURSOR_LEFT(n) "\033[" + n + "D"

    /**
     * * Set cursor position (y column x row).
 * \033[y;xH
 *
 * @param {column} y
 * @param {row} x
 */
    inline char const *ANSI_MOVE_CURSOR_POSTION(int y, int x)
    {
        char const *begin = "\033[";
        char const *str_y;
        char const *middle = ";";
        char const *str_x;
        char const *end = "H";

        itoa(y, str_y, 10);
        itoa(x, str_x, 10);
        char *result = (char *)malloc(strlen(begin) + strlen(str_y) + strlen(middle) + strlen(str_x) + strlen(end));
        strcpy(result, begin);
        strcat(result, str_y);
        strcat(result, middle);
        strcat(result, str_x);
        strcat(result, end);
        return result;
    }

#ifdef __cplusplus
}
#endif