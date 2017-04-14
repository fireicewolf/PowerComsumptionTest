package com.gionee.powercomsumption.testcases;

import android.os.RemoteException;
import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;
import com.dukeg.easyuiautomator.BasicEvent;
import com.dukeg.easyuiautomator.KeyEvent;
import com.dukeg.easyuiautomator.TouchEvent;
import com.dukeg.easyuiautomator.CheckEvent;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SdkSuppress(minSdkVersion = 19)
@RunWith(AndroidJUnit4.class)
public class iReaderTest {

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
        touch.clickByObjectResourceID("com.android.systemui:id/recent_app_clear",5000);
        basic.wait(1000);
    }

    @Test
    public void iReader() throws Exception {
        basic.launch("com.chaozh.iReaderGionee",5000);
        basic.wait(5000);
        if (check.isObjectExistByRes("com.chaozh.iReaderGionee:id/iv_advtise",5000)) {
            touch.click(195,1000);
        }
        else {
            touch.click(195,470);
        }
        basic.wait(2000);
        for (int i = 0;i < 2;i++) {
            basic.wait(10000);
            touch.click(975,1735);
            basic.wait(20000);
        }
        key.pressBack();
        basic.wait(2000);
        key.pressHome();
        basic.wait(2000);
    }
}
