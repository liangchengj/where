cmake_minimum_required(VERSION 3.4.1)


add_library(meyou SHARED src/main/cpp/meyou.cpp)

#target_link_libraries(meyou)

find_library(log-lib log)

target_link_libraries(meyou ${log-lib})


#add_library(app-glue STATIC ${ANDROID_NDK}/sources/android/native_app_glue/android_native_app_glue.c)

#target_link_libraries(meyou app-glue ${log-lib})