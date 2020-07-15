/**
 * Created at 2020/7/1 06:48.
 * 
 * @author Liangcheng Juves
 */

#ifdef __cplusplus
extern "C"
{
#endif

#ifndef _ANSICOL_H
#define _ANSICOL_H
#endif

#include <string.h>

#ifndef _LCJC_H
#include "lcjc.h"
#endif

/* Black text. */
#define ANSI_FG_BLACK "\033[30m"
/* Red text. */
#define ANSI_FG_RED "\033[31m"
/* Green text. */
#define ANSI_FG_GREEN "\033[32m"
/* Yellow text. */
#define ANSI_FG_YELLOW "\033[33m"
/* Blue text. */
#define ANSI_FG_BLUE "\033[34m"
/* Fuchsia text. */
#define ANSI_FG_FUCHSIA "\033[35m"
/* Cyan text. */
#define ANSI_FG_CYAN "\033[36m"
/* White text. */
#define ANSI_FG_WHITE "\033[37m"

/* The background color of the console is black. */
#define ANSI_BG_BLACK "\033[40m"
/* The background color of the console is red. */
#define ANSI_BG_RED "\033[41m"
/* The background color of the console is green. */
#define ANSI_BG_GREEN "\033[42m"
/* The background color of the console is yellow. */
#define ANSI_BG_YELLOW "\033[43m"
/* The background color of the console is blue. */
#define ANSI_BG_BLUE "\033[44m"
/* The background color of the console is fuchsia. */
#define ANSI_BG_FUCHSIA "\033[45m"
/* The background color of the console is cyan. */
#define ANSI_BG_CYAN "\033[46m"
/* The background color of the console is white. */
#define ANSI_BG_WHITE "\033[47m"

/* The console is displayed in the default state. */
#define ANSI_NONE "\033[0m"
/* The text is highlighted. */
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
        assert(ansicol != NULL && str != NULL);
        char *toprnt = mlcstr(cslen(ansicol) + cslen(str));
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