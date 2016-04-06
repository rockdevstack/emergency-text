package com.linfirmware.emergencytext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Toast;

public class CommonEmergencies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_emergencies);
    }

    public void sendText(View view)
    {
        //Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show();

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("6505551212", null, "Test Text Message", null, null);
    }
}
