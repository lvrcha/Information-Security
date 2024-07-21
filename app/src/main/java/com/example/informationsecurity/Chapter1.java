package com.example.informationsecurity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Chapter1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter1);

        Intent intent = getIntent();
        String Chapter = intent.getStringExtra("chapter");
        if (Chapter.equals("1"))
        {
            TextView mText = (TextView)findViewById(R.id.ch1text);
            mText.setText(getString(R.string.ch1text));
            TextView mHead = (TextView)findViewById(R.id.ch1header);
            mHead.setText(getString(R.string.ch1title));
        }
        if (Chapter.equals("2"))
        {
            TextView mText = (TextView)findViewById(R.id.ch1text);
            mText.setText(getString(R.string.ch2text));
            TextView mHead = (TextView)findViewById(R.id.ch1header);
            mHead.setText(getString(R.string.ch2title));
        }
        if (Chapter.equals("3"))
        {
            TextView mText = (TextView)findViewById(R.id.ch1text);
            mText.setText(getString(R.string.ch3text));
            TextView mHead = (TextView)findViewById(R.id.ch1header);
            mHead.setText(getString(R.string.ch3title));
        }


        Button buttonback = (Button)findViewById(R.id.buttonback);

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(Chapter1.this, Modules.class);
                    startActivity(intent);finish();
                } catch (Exception e) {

                }
            }
        });

        Button buttonnext1 = (Button)findViewById(R.id.buttonnext1);

        buttonnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent thisIntent = getIntent();
                    String Chapter = thisIntent.getStringExtra("chapter");

                    Intent intent = new Intent(Chapter1.this, Tasks.class);
                    intent.putExtra("chapter", Chapter.toString());
                    startActivity(intent);finish();
                } catch (Exception e) {

                }
            }
        });

    }
}