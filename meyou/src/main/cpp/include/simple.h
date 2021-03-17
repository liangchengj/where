#include <jni.h>
#include <string>

using namespace std;

char *jStrToChars(JNIEnv *env, jstring jstr)
{

	//    char *flag=NULL;
	//
	//    jclass jCl=env->FindClass("java/lang/String");
	//    jstring strEncode=env->NewStringUTF("GB2312");
	//    jmethodID jMId=env->GetMethodID(jCl,"getBytes","(Ljava/lang/String;)[B");
	//    jbyteArray jByteArray=(jbyteArray) env->CallObjectMethod(jstr,jMId,strEncode);
	//    jsize jSize=env->GetArrayLength(jByteArray);
	//    jbyte *jBytes=env->GetByteArrayElements(jByteArray,JNI_FALSE);
	//    if(jSize>0){
	//        flag=(char *) malloc(jSize+1);
	//        memcpy(flag,jBytes,jSize);
	//        flag[jSize]=0;
	//    }
	//
	//    env->ReleaseByteArrayElements(jByteArray,jBytes,0);

	return (char *)(env->GetStringUTFChars(jstr, JNI_FALSE));
}

string jStrToCStr(JNIEnv *env, jstring jstr)
{
	return string(jStrToChars(env, jstr));
}

jstring cStrToJStr(JNIEnv *env, string str)
{
	return env->NewStringUTF(str.c_str());
}

string subWithLastIndex(string str, string ch, int moveRight)
{

	int sign;

	if (str.find(ch) != string::npos)
	{
		for (int i = 0; i < str.length(); i++)
		{
			if (str.substr(i, 1).compare(ch) == 0)
				sign = i;
		}

		return str.substr(sign + moveRight);
	}
	else
		return NULL;
}

string subWithLastIndex(string str, string ch)
{
	return subWithLastIndex(str, ch, 1);
}
