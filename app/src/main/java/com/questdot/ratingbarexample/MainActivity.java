package com.questdot.ratingbarexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text_v;
    private RatingBar rating_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rating_b = (RatingBar) findViewById(R.id.ratingBar);
        text_v = (TextView)findViewById(R.id.textView);

        rating_b.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        text_v.setText(String.valueOf(rating));
                    }
                }
        );
    }




}
