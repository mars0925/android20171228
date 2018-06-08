package com.mars.android20171228;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//切換畫面教學
public class MainActivity extends AppCompatActivity {
    TextView tv;
    TextView tv2;
    final int request_page3 = 3;
    final int request_page4 = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView5);
        tv2 = findViewById(R.id.textView6);
        //頁看到這樣的畫面，按下+ New repository 來新增一個專案。
    }

    public  void click2 (View v)
    {
        EditText ed = findViewById(R.id.editText);
        Intent it  = new Intent(MainActivity.this, secActivity.class);
        //引數放自己,目標類別
        it.putExtra( "data",ed.getText().toString());//得到目前頁面的資料
        startActivity(it);//開啟一個頁面(intent的一個方法)
        Log.d("AA","AA");
    }


    public  void click3 (View v)
    {
        Intent it  = new Intent(MainActivity.this, thirdActivity.class);
        //引數放自己,目標類別
        startActivityForResult(it,request_page3);//如果你希望跳頁之後要有回傳值,要用這個
        //requestCode可以用來判斷是哪一頁傳回來,雖然他是要求數字類型,但是為了維護需求,不要寫數字,應該要用宣告有意義的文字
        //request_page3 = 3
    }

    public  void click4 (View v)
    {
        Intent it  = new Intent(MainActivity.this, FourActivity.class);
        //引數放自己,目標類別
        startActivityForResult(it,request_page4);//如果你希望跳頁之後要有回傳值,要用這個
        //requestCode可以用來判斷是哪一頁傳回來的,寫成if就可以做多重判斷
    }


    @Override//使用startActivityForResult方法,他回來這頁就會執行這段程式碼
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == request_page3)
        {
            if (resultCode == RESULT_OK)
            {
                tv.setText(data.getStringExtra("myresult"));
            }
        }
        else if (requestCode == request_page4){

            if (resultCode == RESULT_OK)
            {
                tv2.setText(data.getStringExtra("myresult"));
            }
        }

    }
}
