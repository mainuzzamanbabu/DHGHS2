package com.example.dhghs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AdminDashboard extends AppCompatActivity {
    Button adminbtn1,adminbtn0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Admin");
        setContentView(R.layout.activity_admin_dashboard);
        adminbtn1 = findViewById(R.id.adminbtn);
        adminbtn0 = findViewById(R.id.logoutbtn);
        adminbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdminDashboard.this, AdminRegisterStudent.class);
                startActivity(i);
            }
        });
        adminbtn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdminDashboard.this, AdminLoginActivity.class);
                startActivity(i);
                Toast.makeText(AdminDashboard.this, "Logout Successfull ", Toast.LENGTH_LONG).show();
            }
        });


    }
}
