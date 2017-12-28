package com.mars.android20171228;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        TextView tv2 = findViewById(R.id.textView);

        Intent it = getIntent();
        String str = it.getStringExtra("data");
        tv2.setText(str);
    }
}
