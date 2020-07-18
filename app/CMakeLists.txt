cmake_minimum_required(VERSION 3.4.1)

add_library(where SHARED src/main/cpp/where.cpp)

target_link_libraries(where)