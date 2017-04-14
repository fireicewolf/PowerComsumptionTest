package com.gionee.powercomsumption.testcases;

import android.os.RemoteException;
import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;

import com.dukeg.easyuiautomator.BasicEvent;
import com.dukeg.easyuiautomator.CheckEvent;
import com.dukeg.easyuiautomator.KeyEvent;
import com.dukeg.easyuiautomator.TouchEvent;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SdkSuppress(minSdkVersion = 19)
@RunWith(AndroidJUnit4.class)
public class voicecallTest {

    private BasicEvent basic = new BasicEvent();
    private KeyEvent key = new KeyEvent();
    private TouchEvent touch = new TouchEvent();
    private CheckEvent check = new CheckEvent();

    @Before
    public void clearUp() throws RemoteException {
        key.pressBack();
        basic.wait(1000);
        key.pressHome();
        basic.wait(1000);
        key.pressRecentApps();
        basic.wait(2000);
        touch.clickByObjectResourceID("com.android.systemui:id/recent_app_clear", 5000);
        basic.wait(1000);
    }

    @Test
    public void voicecall() {
        basic.launch("com.android.contacts",5000);
        basic.wait(5000);
        touch.clickByObjectText("拨号",5000);
        basic.wait(1000);
        for (int i = 0;i < 15;i++) {
            touch.clickByObjectResourceID("com.android.contacts:id/one",5000);
            basic.wait(1000);
            touch.clickByObjectResourceID("com.android.contacts:id/zero",5000);
            basic.wait(1000);
            touch.clickByObjectResourceID("com.android.contacts:id/zero",5000);
            basic.wait(1000);
            touch.clickByObjectResourceID("com.android.contacts:id/eight",5000);
            basic.wait(1000);
            touch.clickByObjectResourceID("com.android.contacts:id/six",5000);
            basic.wait(1000);
            touch.clickByObjectResourceID("com.android.contacts:id/gn_button_dial",5000);
            basic.wait(3000);
            key.pressPower();
            basic.wait(30000);
            key.pressPower();
            basic.wait(3000);
            touch.clickByObjectResourceID("com.android.incallui:id/endButton",5000);
            basic.wait(10000);
        }
        key.pressHome();
    }
}