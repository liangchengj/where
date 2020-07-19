// #define __OCV_DEBUG__

#include <opencv2/core.hpp>
#include <opencv2/highgui.hpp>
#include "ocv.h"


int main(int argc, char const *argv[])
{
    cv::Mat img = cv::imread("C:\\Users\\LiangchengJ\\OneDrive\\imgs\\logo.png", -1);
    cv::imshow("logo", img);
    cv::waitKey(0);

    return 0;
}
