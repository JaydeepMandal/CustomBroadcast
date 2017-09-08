package com.example.ee.custombroadcast;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static final String CUSTOM_BROADCAST = "com.example.ee.custombroadcast.CUSTOM_BROADCAST";

    /*BroadcastReceiver receiver = new MyBroadcastRecever();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        filter.addAction(Intent.ACTION_BATTERY_LOW);
        filter.addAction(CUSTOM_BROADCAST);
        registerReceiver(receiver,filter);*/

    }

    public void sendBroadcast(View v){
        Intent intent = new Intent(CUSTOM_BROADCAST);
        sendBroadcast(intent);
    }

   /* @Override
    protected void onDestroy() {
        unregisterReceiver(receiver);
        super.onDestroy();
    }*/


}
