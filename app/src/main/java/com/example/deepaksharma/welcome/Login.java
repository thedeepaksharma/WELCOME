package com.example.deepaksharma.welcome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button bt1 = (Button) findViewById(R.id.login);
        Button bt2 = (Button) findViewById(R.id.signup);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Login.this, MainActivity.class);
                Toast.makeText(Login.this, "Proceed for main activity", Toast.LENGTH_SHORT).show();
                startActivity(in);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Login.this, Signup.class);
                Toast.makeText(getApplicationContext(),"clicked on Signup",Toast.LENGTH_SHORT).show();
                startActivity(in);
            }
        });
    }
}
