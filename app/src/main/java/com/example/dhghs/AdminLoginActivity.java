package com.example.dhghs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLoginActivity extends AppCompatActivity {
    Button lbtn,bbtn;
    EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        lbtn = findViewById(R.id.btn);
        user=findViewById(R.id.username);
        pass = findViewById(R.id.password);
        bbtn = findViewById(R.id.btn2);





        lbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email1 = user.getText().toString().trim();
                String pass1 = pass.getText().toString().trim();
           //     email1 = "DHGHSADMIN";
             //   pass1 = "adminlogin";
                String check1 = "mainuzzamanbabu";
                String check2 = "123456";

                if (email1.equals(check1) && pass1.equals(check2)){
                    Intent i = new Intent(AdminLoginActivity.this, AdminDashboard.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(AdminLoginActivity.this, "Incorrect Username or password", Toast.LENGTH_LONG).show();
                }
            }
        });
        bbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdminLoginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
