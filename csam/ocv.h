/**
 * Created at 2020/7/19 16:35.
 * 
 * @author Liangcheng Juves
 */
#ifdef __cplusplus
extern "C"
{
#endif

#ifndef _OCV_H
#define _OCV_H
#endif

#ifndef _PLATF_H
#include "platf.h"
#endif

#ifdef __PLATF_WINDOWS
#ifndef __OCV_DEBUG__
#pragma comment(lib, "opencv_world430.lib")
#else
#pragma comment(lib, "opencv_world430d.lib")
#endif /* __OCV_DEBUG__ */
#endif /* __PLATF_WINDOWS */

#ifdef __cplusplus
}
#endif