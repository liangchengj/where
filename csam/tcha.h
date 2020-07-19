/**
 * Created at 2020/7/14 07:14.
 * 
 * In order to use JNI perfectly.
 * 
 * @author Liangcheng Juves
 */
#ifdef __cplusplus
extern "C"
{
#endif

#ifndef _TCHA_H
#define _TCHA_H
#endif

#include <jni.h>

    JNIEnv *__jnienv;
    jclass jclz_this;

    void jnienvof(JNIEnv *env);

    void jnienvof(JNIEnv *env, jobject thiz)
    {
       
    }

#ifdef __cplusplus
}
#endif