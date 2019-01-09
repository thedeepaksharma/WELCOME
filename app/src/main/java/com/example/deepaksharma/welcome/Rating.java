package com.example.deepaksharma.welcome;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Rating extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratingbar);

        final RatingBar rate = (RatingBar) findViewById(R.id.rat);

        Button bt = (Button) findViewById(R.id.rate);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int star = rate.getNumStars();
                float r = rate.getRating();

                Toast.makeText(Rating.this, "Rate is : "+r+" Star is :"+star, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
