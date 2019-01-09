package com.example.deepaksharma.welcome;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class DateActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dateactivity);

        Button bt = (Button) findViewById(R.id.buttondate);
        final DatePicker dp = (DatePicker) findViewById(R.id.date);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = dp.getDayOfMonth();
                int month = dp.getMonth()+1;
                int year = dp.getYear();

                Toast.makeText(DateActivity.this, ""+day+"/"+month+"/"+year, Toast.LENGTH_LONG).show();


            }
        });
    }
}
