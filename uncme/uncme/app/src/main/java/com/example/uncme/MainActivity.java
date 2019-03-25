package com.example.uncme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button button = new Button(R.id.take_video_button);

        Toast.makeText(this, "Welcome to UNCme", Toast.LENGTH_LONG).show();

    }
}
