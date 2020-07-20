/**
 * Created at 2020/7/20 14:40.
 * 
 * In order to use JNI perfectly.
 * 
 * @author Liangcheng Juves
 */
#ifndef _TCHA_H
#define _TCHA_H

// #ifdef __cpluscplus
extern "C"
{
    // #endif

#include "jni/jni.h"
    JNIEnv *tcha_env;

    void envinit(JNIEnv *env);

    jstring cstr_jstr(char const *cs);
    char const *jstr_cstr(jstring jstr);

    void envinit(JNIEnv *env)
    {
        tcha_env = env;
    }

#ifdef JNI_H_ /* Old */

    jstring cstr_jstr(char const *cs)
    {
        // return (*tcha_env)->NewStringUTF(tcha_env, cs);
        // return tcha_env->NewStringUTF(tcha_env,cs);
    }
#elif defined(_JAVASOFT_JNI_H_) /* New */

    jstring cstr_jstr(char const *cs)
    {
        return tcha_env->NewStringUTF(cs);
    }

    char const *jstr_cstr(jstring jstr)
    {
        return tcha_env->GetStringUTFChars(jstr, JNI_FALSE);
    }

#endif /* JNI_H_ */

    // #ifdef __cpluscplus
}
// #endif

#endif /* _TCHA_H */