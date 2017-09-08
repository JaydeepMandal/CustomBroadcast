package com.example.ee.custombroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastRecever extends BroadcastReceiver {
    static final String CUSTOM_BROADCAST = "com.example.ee.custombroadcast.CUSTOM_BROADCAST";
    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction = intent.getAction();
        switch (intentAction){
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Toast.makeText(context, "AIRPLANE MODE", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_BATTERY_LOW:
                Toast.makeText(context, "BATTERY LOW", Toast.LENGTH_SHORT).show();
                break;
            case CUSTOM_BROADCAST :
                Toast.makeText(context, "CUSTOM_BROADCAST", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
