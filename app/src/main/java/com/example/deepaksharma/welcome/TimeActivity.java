package com.example.deepaksharma.welcome;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimeActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timeactivity);

        final TextView tx = (TextView) findViewById(R.id.text);

        Button bt = (Button) findViewById(R.id.btntime);
        TimePicker tp = (TimePicker) findViewById(R.id.time1);

        tp.setIs24HourView(true);

        final String time="current time :"+tp.getCurrentHour()+":"+tp.getCurrentMinute();

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(time);
            }
        });

    }
}
