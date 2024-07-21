package com.example.informationsecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tasks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasks);

        Button buttonansw = (Button)findViewById(R.id.buttonansw);
        EditText answ1 = (EditText)findViewById(R.id.answ1);

        buttonansw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = getIntent();
                String Chapter = intent.getStringExtra("chapter");
                String Answer = answ1.getText().toString().trim();

                String strToast = "";

                if (Chapter.equals("1"))
                {
                    if(Answer.equals(getString(R.string.cansw1)))
                        strToast = "Correct";
                    else
                        strToast = "Incorrect";
                }
                if (Chapter.equals("2"))
                {
                    if(Answer.equals(getString(R.string.cansw2)))
                        strToast = "Correct";
                    else
                        strToast = "Incorrect";
                }
                if (Chapter.equals("3"))
                {
                    if(Answer.equals(getString(R.string.cansw3)))
                        strToast = "Correct";
                    else
                        strToast = "Incorrect";
                }
                Toast toast = Toast.makeText(Tasks.this, strToast.toString(), Toast.LENGTH_LONG);
                toast.show();
            }
        });

        Intent intent = getIntent();
        String Chapter = intent.getStringExtra("chapter");
        if (Chapter.equals("1"))
        {
            TextView mText = (TextView)findViewById(R.id.qt1);
            mText.setText(getString(R.string.qt1));
            TextView mHead = (TextView)findViewById(R.id.q1);
            mHead.setText(getString(R.string.q1));
        }
        if (Chapter.equals("2"))
        {
            TextView mText = (TextView)findViewById(R.id.qt1);
            mText.setText(getString(R.string.qt2));
            TextView mHead = (TextView)findViewById(R.id.q1);
            mHead.setText(getString(R.string.q2));
        }
        if (Chapter.equals("3"))
        {
            TextView mText = (TextView)findViewById(R.id.qt1);
            mText.setText(getString(R.string.qt3));
            TextView mHead = (TextView)findViewById(R.id.q1);
            mHead.setText(getString(R.string.q3));
        }

        Button buttonbacktasks = (Button)findViewById(R.id.buttonbacktasks);

        buttonbacktasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(Tasks.this, Modules.class);
                    startActivity(intent);finish();
                } catch (Exception e) {

                }
            }
        });
    }
}