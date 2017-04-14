package com.gionee.powercomsumptiontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.gionee.powercomsumptiontest.service.baiduTestThread;
import com.gionee.powercomsumptiontest.service.cameraTestThread;
import com.gionee.powercomsumptiontest.service.gameTestThread;
import com.gionee.powercomsumptiontest.service.iReaderTestThread;
import com.gionee.powercomsumptiontest.service.musicPlayerTestThread;
import com.gionee.powercomsumptiontest.service.qqTestThread;
import com.gionee.powercomsumptiontest.service.videoPlayerTestThread;
import com.gionee.powercomsumptiontest.service.voicecallTestThread;
import com.gionee.powercomsumptiontest.service.wechatTestThread;
import com.gionee.powercomsumptiontest.service.weiboTestThread;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "RunnerMainActivity";
    Button runCameraTestBtn;
    Button runBaiduTestBtn;
    Button runGameTestBtn;
    Button runIReaderTestBtn;
    Button runMusicPlayerTestBtn;
    Button runQQTestBtn;
    Button runVideoPlayerTestBtn;
    Button runVoiceCallTestBtn;
    Button runWechatTestBtn;
    Button runWeiboTestBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        runCameraTestBtn = (Button) findViewById(R.id.camera_test);
        runBaiduTestBtn = (Button) findViewById(R.id.baidu_test);
        runGameTestBtn  = (Button) findViewById(R.id.game_test);
        runIReaderTestBtn = (Button) findViewById(R.id.ireader_test);
        runMusicPlayerTestBtn = (Button) findViewById(R.id.musicplayer_test);
        runQQTestBtn = (Button) findViewById(R.id.qq_test);
        runVideoPlayerTestBtn = (Button) findViewById(R.id.videoplayer_test);
        runVoiceCallTestBtn = (Button) findViewById(R.id.voicecall_test);
        runWechatTestBtn = (Button) findViewById(R.id.wechat_test);
        runWeiboTestBtn = (Button) findViewById(R.id.weibo_test);
    }

    /**
     * 点击按钮对应的方法
     * @param v
     */

    public void runCameraTest(View v){
        Log.i(TAG, "Run Camera Test: ");
        new cameraTestThread().start();
    }

    public void runBaiduTest(View v){
        Log.i(TAG, "Run Baidu Test: ");
        new baiduTestThread().start();
    }

    public void runGameTest(View v){
        Log.i(TAG, "Run Game Test: ");
        new gameTestThread().start();
    }

    public void runiReaderTest(View v){
        Log.i(TAG, "Run iReader Test: ");
        new iReaderTestThread().start();
    }

    public void runmusicPlayerTest(View v){
        Log.i(TAG, "Run Music Player Test: ");
        new musicPlayerTestThread().start();
    }

    public void runqqTest(View v){
        Log.i(TAG, "Run QQ Test: ");
        new qqTestThread().start();
    }

    public void runvideoPlayerTest(View v){
        Log.i(TAG, "Run Video Player Test: ");
        new videoPlayerTestThread().start();
    }

    public void runvoicecallTest(View v){
        Log.i(TAG, "Run Voice Call Test: ");
        new voicecallTestThread().start();
    }

    public void runwechatTest(View v){
        Log.i(TAG, "Run Wechat Test: ");
        new wechatTestThread().start();
    }

    public void runweiboTest(View v){
        Log.i(TAG, "Run Weibo Test: ");
        new weiboTestThread().start();
    }

}