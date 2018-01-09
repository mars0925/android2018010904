package com.mars.android2018010904;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        ////參數1:群組id, 參數2:itemId, 參數3:item順序, 參數4:item名稱
        menu.add(0,1,1,"ADD");
        menu.add(0,2,0,"edit");
        //menu.add("ADD");//比較簡單的寫法
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //使用switch來抓是哪一個
        switch (item.getItemId())//找出item的id
        {
            case 1:
                Toast.makeText(MainActivity.this,"按下ADD",Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MainActivity.this,"按下edit",Toast.LENGTH_SHORT).show();
                break;

        }

        /*比較不好的寫法
        if (item.getTitle().equals("ADD"))
        {
            Toast.makeText(MainActivity.this,"按下ADD",Toast.LENGTH_SHORT).show();
        }*/
        return super.onOptionsItemSelected(item);
    }
}
