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

#ifndef tcha_h
#define tcha_h
#endif

#include <jni.h>

    JNIEnv *__jnienv;
    jclass jclz_this;

    void jnienvof(JNIEnv *env);

    void jnienvof(JNIEnv *env, jobject thiz)
    {
        __jnienv = env;
        jclz_this = (jclass)(__jnienv)->GetObjectClass(env, thiz);
    }

#ifdef __cplusplus
}
#endif