package com.example.sms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText etnum,ettext;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnum=findViewById(R.id.etnum);
        ettext=findViewById(R.id.ettext);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num= etnum.getText().toString();
                String text= ettext.getText().toString();
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(num,null,text,null,null);

            }
        });
    }
}