package com.example.ashiquechowdhury.notifications;

import android.content.Context;
import android.content.Intent;

/**
 * Created by ashiquechowdhury on 12/4/16.
 */

public class MyAlarmReceiver extends BroadCastReciever{
    public static final int REQUEST_CODE = 12345;
    public static final String ACTION = "nyc.c4q.notificationdemo.alarm";

    @Override
    public void onReceive(Context context, Intent intent){
        Intent i = new Intent(context, MyNotificationService.class);
        context.startService(i);
    }
}
