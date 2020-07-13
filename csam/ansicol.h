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
#include <malloc.h>

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

#define ANSI_MOVE_CURSOR_UP(n) "\033[%dA"
#define ANSI_MOVE_CURSOR_DOWN(n) "\033[%dB"
#define ANSI_MOVE_CURSOR_RIGHT(n) "\033[%dC"
#define ANSI_MOVE_CURSOR_LEFT(n) "\033[%dD"
#define ANSI_MOVE_CURSOR_POSITION "\033[%d;%dH"

#define ANSI_SAVE_CURSOR_POSITION "\033[s"
#define ANSI_SAVE_RESTORE_POSITION "\033[u"

#define ANSI_HIDE_CURSOR "\033[?25l"
#define ANSI_SHOW_CURSOR "\033[?25h"

    void acolprnt(char const *ansicol, char const *str);
    void blackprnt(char const *str);
    void redprnt(char const *str);
    void greenprnt(char const *str);
    void yellowprnt(char const *str);
    void blueprnt(char const *str);
    void fuchsiaprnt(char const *str);
    void cyanprnt(char const *str);
    void whiteprnt(char const *str);

    inline void acolprnt(char const *ansicol, char const *str)
    {
        char *toprnt = (char *)malloc(strlen(ansicol) + strlen(str));
        strcpy(toprnt, ansicol);
        strcat(toprnt, str);
        strcat(toprnt, ANSI_NONE);
        printf("%s", toprnt);
    }

    inline void blackprnt(char const *str)
    {
        acolprnt(ANSI_FG_BLACK, str);
    }

    inline void redprnt(char const *str)
    {
        acolprnt(ANSI_FG_RED, str);
    }

    inline void greenprnt(char const *str)
    {
        acolprnt(ANSI_FG_GREEN, str);
    }

    inline void yellowprnt(char const *str)
    {
        acolprnt(ANSI_FG_YELLOW, str);
    }

    inline void blueprnt(char const *str)
    {
        acolprnt(ANSI_FG_BLUE, str);
    }

    inline void fuchsiaprnt(char const *str)
    {
        acolprnt(ANSI_FG_FUCHSIA, str);
    }

    inline void cyanprnt(char const *str)
    {
        acolprnt(ANSI_FG_CYAN, str);
    }

    inline void whiteprnt(char const *str)
    {
        acolprnt(ANSI_FG_WHITE, str);
    }

#ifdef __cplusplus
}
#endif