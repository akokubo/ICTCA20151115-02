package com.android_lesson.aomori.hello2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btn = new Button(getApplicationContext());
        btn.setText("HELLO");
        setContentView(btn);
    }
}
