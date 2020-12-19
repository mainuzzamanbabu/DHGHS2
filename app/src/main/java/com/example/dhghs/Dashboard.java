package com.example.dhghs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {
    TextView name123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        name123 =(TextView)findViewById(R.id.name);
        Bundle b=getIntent().getExtras();
        String name=b.getString("name");
        name123.setText(" Hi "+name);

    }
    public void Logout(View v){
        Intent i = new Intent(Dashboard.this, MainActivity.class);
        startActivity(i);
        Toast.makeText(Dashboard.this, "Logout Successfull ", Toast.LENGTH_LONG).show();
    }

    public void Details(View view) {
        Intent i = new Intent(Dashboard.this, userProgramActivity.class);
        startActivity(i);
    }
}
