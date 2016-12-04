package com.example.ashiquechowdhury.notifications;

import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;

/**
 * Created by ashiquechowdhury on 12/4/16.
 */

public class MyNotificationService extends IntentService {
    private static final String SERVICE_NAME = "notification service";
    private static final int NOTIFICATION_ID = 555;

    public MyNotificationService() {
        super(SERVICE_NAME);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        int requestID = (int) System.currentTimeMillis();
        int flags = PendingIntent.FLAG_CANCEL_CURRENT;
        Intent myIntent = new Intent(this, SecondActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, requestID, myIntent, flags);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_face_black_24dp)
                .setContentTitle("Work 4 mah money")
                .setContentIntent(pendingIntent)
                .setContentText("You have to work for your money")
                .setAutoCancel(true);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICATION_ID, builder.build());
    }
}
