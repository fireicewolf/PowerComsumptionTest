package com.gionee.powercomsumptiontest.service;

import android.util.Log;

import com.gionee.powercomsumptiontest.CMDUtils;

import static android.content.ContentValues.TAG;
import static com.gionee.powercomsumptiontest.CMDUtils.generateCommand;

public class voicecallTestThread extends Thread {

    @Override
    public void run() {
        super.run();
        String command = generateCommand("com.gionee.powercomsumption.testcases", "voicecallTest");
        CMDUtils.CMD_Result rs = CMDUtils.runCMD(command, true, true);
        Log.e(TAG, "run: " + rs.error + "-------" + rs.success);
    }
}
