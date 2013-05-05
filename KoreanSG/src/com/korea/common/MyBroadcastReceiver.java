package com.korea.common;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class MyBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		MyIntentService.runIntentInService(context, intent);
        setResult(Activity.RESULT_OK, null, null);
	}

}
