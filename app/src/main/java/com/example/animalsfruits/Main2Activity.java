package com.example.animalsfruits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Main2Activity extends AppCompatActivity {
GridView j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        j=(GridView)findViewById(R.id.g);
        Intent k=getIntent();
        final int pos=k.getIntExtra("pos",0);
        int ani[]={R.drawable.cat,R.drawable.cow,R.drawable.dog,R.drawable.duck,R.drawable.elephant,R.drawable.horse,R.drawable.rabbit,R.drawable.snake};
        String ans[]={"Cat","Cow","Dog","Duck","Elephant","Horse","Rabbit","Snake"};
        int fri[]={R.drawable.apple,
                R.drawable.apricot,
                R.drawable.banana,
                R.drawable.grapes,
                R.drawable.litchi,R.drawable.mmango};
        String fs[]={"Apple","Apricot","Banana","Grapes","Litchi","Mango"};
        holder h = null;
        if(pos==0)
        {
            h=new holder(this,fri,fs);
        }
        else if(pos==1)
        {
            h=new holder(this,ani,ans);
        }
        j.setAdapter(h);
    }
}
