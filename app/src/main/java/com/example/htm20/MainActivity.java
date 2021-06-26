package com.example.htm20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sawolabs.androidsdk.Sawo;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        loginButton = findViewById(R.id.loginbutton);
    }

    public void OnClickLogin(View view) {
        new Sawo(
                this,
                "f73b6210-506b-414a-b5af-c4c4d08f0adb" ,
                "60d6da117696dba9ecff45e6r8BcDJOhK1oSN7RMmk7Xu6HB" // your api key secret
        ).login(
                "email", // can be one of 'email' or 'phone_number_sms'
                Menu.class.getName()  // Callback class name
        );
    }
}