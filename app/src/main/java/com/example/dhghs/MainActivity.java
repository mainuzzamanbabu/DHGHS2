package com.example.dhghs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.FontsContract;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    EditText name, pass;
    static MyDB myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        myDB = new MyDB(this);

    }

    //logic for login
    public void loginCheck(View v) {
        String email1 = name.getText().toString().trim();
        String pass1 = pass.getText().toString().trim();

        if (!email1.isEmpty() && !pass1.isEmpty()) {
            Cursor c = MainActivity.myDB.memberLoginCcheck(email1);

            Log.d(TAG, "loginCheck: " + String.valueOf(c.getCount()));

            if (c.getCount() <= 0) {
                Toast.makeText(MainActivity.this, "Invalid Credentials for " + email1, Toast.LENGTH_LONG).show();
            } else {
                c.moveToFirst();

                String name2 = c.getString(0);
                String pass2 = c.getString(1);
                if (pass1.equals(pass2)) {
                    Intent i = new Intent(MainActivity.this, Dashboard.class);
                    i.putExtra("name", name2);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid Credentetials for user " + email1, Toast.LENGTH_LONG).show();
                }
                name.setText("");
                pass.setText("");

            }

            c.close();
        }
    }

    //logic for member's registration
    public void register(View v) {
        Intent i = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(i);

    }
    public void AdminLogin(View v){
        Intent i = new Intent(MainActivity.this, AdminLoginActivity.class);
        startActivity(i);

    }
    public void exitbutton(View v){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

}
