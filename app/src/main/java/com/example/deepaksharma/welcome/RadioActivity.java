package com.example.deepaksharma.welcome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RadioActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radioactivity);

        Button bt = (Button) findViewById(R.id.selectbutton);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(RadioActivity.this, MainActivity.class);
                Toast.makeText(RadioActivity.this, "You have selected!", Toast.LENGTH_SHORT).show();
                startActivity(in);
            }
        });
    }
}
