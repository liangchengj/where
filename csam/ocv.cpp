// #define __OCV_DEBUG__

#include <opencv2/core.hpp>
#include <opencv2/highgui.hpp>
#include <opencv2/imgcodecs.hpp>
#include <opencv2/imgproc.hpp>
#include <opencv2/imgproc/types_c.h>
#include <opencv2/opencv.hpp>
#include "ocv.h"

// using namespace cv;

int main(int argc, char const *argv[])
{
    cv::Mat img = cv::imread("C:/Users/LiangchengJ/Desktop/Plate/00000000.jpg", -1);
    cv::imshow("logo", img);
    cv::waitKey(0);

    cv::Mat hsv;
    cv::cvtColor(img, hsv, CV_BGR2HSV);
    cv::imshow("logo", hsv);
    cv::waitKey(0);

    cv::Mat gray;
    cv::cvtColor(hsv, gray, CV_BGR2GRAY);

    cv::Mat binray;
    cv::threshold(gray, binray, 0, 255, CV_THRESH_OTSU);
    cv::imshow("logo", binray);
    cv::waitKey(0);

    return 0;
}
