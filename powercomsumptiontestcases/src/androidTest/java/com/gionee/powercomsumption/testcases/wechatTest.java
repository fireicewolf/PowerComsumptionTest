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
public class wechatTest {

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
    public void wechat() {
        basic.launch("com.tencent.mm",5000);
        basic.wait(5000);
        touch.clickByObjectText("名字头像不要动",5000);
        if (check.isObjectExistByDesc("切换到按住说话",5000)) {
            touch.clickByObjectDesc("切换到按住说话",5000);
            basic.wait(2000);
        }
        else {
            basic.wait(2000);
        }
        for (int i = 0;i < 60;i++) {
            touch.longClick(540,1850,5000);
            basic.wait(10000);
        }
        key.pressBack();
        basic.wait(2000);
        key.pressHome();
    }
}
