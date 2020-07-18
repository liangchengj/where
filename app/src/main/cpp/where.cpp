
#include <jni.h>

extern "C"{
JNIEXPORT jstring JNICALL
Java_com_meyou_where_Home_httpUrl(JNIEnv *env,jclass type){
    return env->NewStringUTF("https://bydengjie.com/Where");
}


JNIEXPORT jstring JNICALL
Java_com_meyou_where_Home_downloadUrl(JNIEnv *env,jclass type){
    return env->NewStringUTF("https://bydengjie.com/APKS/Where.apk");
}


JNIEXPORT jstring JNICALL
Java_com_meyou_where_Home_proName(JNIEnv *env,jclass type){
    return env->NewStringUTF("InstallFileProvider");
}

}


