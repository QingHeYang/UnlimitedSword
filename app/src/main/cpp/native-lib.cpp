#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_qhy_com_unlimitedsword_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
