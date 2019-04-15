package com.example.login_page;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
    }

    public void onclick(View v) {
        Intent i = new Intent(Secondactivity.this, thirdactivity.class);
        startActivity(i);

    }

    public void clickEvent(View v) {
        Intent i = new Intent(Secondactivity.this, fourthactivity.class);
        startActivity(i);

    }
    public void clickMe (View v) {
        Intent i = new Intent(Secondactivity.this,fifth_activity.class);
        startActivity(i);

    }
}