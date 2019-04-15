package com.example.login_page;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button login;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etpassword);
        Info = (TextView) findViewById(R.id.tvInfo);
        login = (Button) findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }


    private void validate(String userName, String userPassword) {


        if ((userName.equals("admin")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, Secondactivity.class);
            startActivity(intent);
        }



        else {
            counter--;
            Info.setText("No. of attempt remaining: " + String.valueOf(counter));

            if (counter == 0) {
                login.setEnabled(false);
            }
        }


    }


    public void onclick(View v) {
        Intent i = new Intent(MainActivity.this,fourthactivity.class);
        startActivity(i);

    }

}




