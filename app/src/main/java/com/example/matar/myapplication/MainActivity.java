package com.example.matar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

//import com.getkeepsafe.relinker.ReLinker;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ReLinker.Logger logger = new ReLinker.Logger() {
//            @Override
//            public void log(String message) {
//                Log.v("HODOR", "(hold the door) " + message);
//            }
//        };
        System.loadLibrary("avcodec");
        System.loadLibrary("avdevice");
        System.loadLibrary("avfilter");
        System.loadLibrary("avformat");
        System.loadLibrary("avutil");
        System.loadLibrary("jniavcodec");
        System.loadLibrary("jniavdevice");
        System.loadLibrary("jniavfilter");
        System.loadLibrary("jniavformat");
        System.loadLibrary("jniavutil");
        System.loadLibrary("jnicvkernels");
        System.loadLibrary("jniopencv_calib3d");
        System.loadLibrary("jniopencv_core");
        System.loadLibrary("jniopencv_face");
        System.loadLibrary("jniopencv_features2d");
        System.loadLibrary("jniopencv_flann");
        System.loadLibrary("jniopencv_highgui");
        System.loadLibrary("jniopencv_imgcodecs");
        System.loadLibrary("jniopencv_imgproc");
        System.loadLibrary("jniopencv_ml");
        System.loadLibrary("jniopencv_objdetect");
        System.loadLibrary("jniopencv_optflow");
        System.loadLibrary("jniopencv_photo");
        System.loadLibrary("jniopencv_shape");
        System.loadLibrary("jniopencv_stitching");
        System.loadLibrary("jniopencv_superres");
        System.loadLibrary("jniopencv_video");
        System.loadLibrary("jniopencv_videoio");
        System.loadLibrary("jniopencv_videostab");
        System.loadLibrary("jniopencv_xfeatures2d");
        System.loadLibrary("jnipostproc");
        System.loadLibrary("jniswresample");
        System.loadLibrary("jniswscale");
        System.loadLibrary("opencv_calib3d");
        System.loadLibrary("opencv_core");
        System.loadLibrary("opencv_face");
        System.loadLibrary("opencv_features2d");
        System.loadLibrary("opencv_flann");
        System.loadLibrary("opencv_highgui");
        System.loadLibrary("opencv_imgcodecs");
        System.loadLibrary("opencv_imgproc");
        System.loadLibrary("opencv_ml");
        System.loadLibrary("opencv_objdetect");
        System.loadLibrary("opencv_optflow");
        System.loadLibrary("opencv_photo");
        System.loadLibrary("opencv_shape");
        System.loadLibrary("opencv_stitching");
        System.loadLibrary("opencv_superres");
        System.loadLibrary("opencv_video");
        System.loadLibrary("opencv_videoio");
        System.loadLibrary("opencv_videostab");
        System.loadLibrary("opencv_xfeatures2d");
        System.loadLibrary("postproc");
        System.loadLibrary("swresample");
        System.loadLibrary("swscale");

    }
    public void onClick(View view){

        Intent intent = new Intent(this, com.example.matar.testapplication.FFmpegRecordActivity.class);
        intent.addFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
