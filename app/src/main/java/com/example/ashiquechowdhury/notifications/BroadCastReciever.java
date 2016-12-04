package com.example.ashiquechowdhury.notifications;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

/**
 * Created by ashiquechowdhury on 12/4/16.
 */

public class BroadCastReciever extends WakefulBroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent startServiceIntent = new Intent(context, MyNotificationService.class);
        startWakefulService(context, startServiceIntent);
    }
}
