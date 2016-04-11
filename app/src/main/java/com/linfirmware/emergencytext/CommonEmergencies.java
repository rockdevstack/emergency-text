package com.linfirmware.emergencytext;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CommonEmergencies extends AppCompatActivity {

    private EditText customMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_emergencies);

        customMessage = (EditText)findViewById(R.id.customMessage);
    }

    public void sendText(View view)
    {
        String message;

        if (view.getId() == R.id.fab)
        {
            message = customMessage.getText().toString();
        }
        else
        {
            Button sender = (Button)view;
            message = sender.getText().toString();
        }

        //Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("6505551212", null, message + " (Location Here)", null, null);
    }
}
