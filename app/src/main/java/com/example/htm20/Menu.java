package com.example.htm20;

import androidx.appcompat.app.AppCompatActivity;
import com.sawolabs.androidsdk.ConstantsKt;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class Menu extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Objects.requireNonNull(getSupportActionBar()).hide();
        text = findViewById(R.id.text);



        Intent intent = getIntent();
        String message = intent.getStringExtra(ConstantsKt.LOGIN_SUCCESS_MESSAGE);
        JSONObject json = null;
        try {
            json = new JSONObject(message);
            String identifier = json.getString("identifier");
            String identifier_type = json.getString("identifier_type");
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}