package com.mars.android20171228;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FourActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }

    public  void  click1(View v)
    {
        EditText ed = findViewById(R.id.editText3);
        Intent it = new Intent();
        it.putExtra("myresult",ed.getText().toString());
        setResult(RESULT_OK , it);//RESULT_OK 是系統內建的常數 他的值是-1,他會回傳給onActivityResult方法 resultcode
        finish();

    }
    public  void  click2(View v)
    {


    }
}
