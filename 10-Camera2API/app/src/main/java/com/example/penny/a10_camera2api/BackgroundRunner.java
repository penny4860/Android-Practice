package com.example.penny.a10_camera2api;

import android.os.Handler;
import android.os.HandlerThread;


public class BackgroundRunner {
    private Handler mBackgroundHandler;
    private HandlerThread mBackgroundThread;

    public Handler getBackgroundHandler() {
        return mBackgroundHandler;
    }

    public void startBackgroundThread() {
        mBackgroundThread = new HandlerThread("Camera Background");
        mBackgroundThread.start();
        mBackgroundHandler = new Handler(mBackgroundThread.getLooper());
    }
    public void stopBackgroundThread() {
        mBackgroundThread.quitSafely();
        try {
            mBackgroundThread.join();
            mBackgroundThread = null;
            mBackgroundHandler = null;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
