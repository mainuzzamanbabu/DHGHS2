package com.example.dhghs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class userProgramActivity extends AppCompatActivity {
    Button btn,btn3,btn00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_program);

       btn =findViewById(R.id.btn1);
       btn3 = findViewById(R.id.btn2);
       btn00 = findViewById(R.id.btn0);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(userProgramActivity.this,RegisterForProgram.class);
               startActivity(i);
           }
       });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(userProgramActivity.this,MoreDetails.class);
                startActivity(i);
            }
        });
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(userProgramActivity.this,SeeRegisteredStudent.class);
                startActivity(i);
            }
        });




    }
}
