package com.example.dhghs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";

    EditText et1,et2,et3,et4,et5;
    static MyDB myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et1 = (EditText)findViewById(R.id.name);
        et2 = (EditText)findViewById(R.id.Batch);
        et3 = (EditText)findViewById(R.id.village);
        et4 = (EditText)findViewById(R.id.email1);
        et5 = (EditText)findViewById(R.id.password1);

    }


    //logic to call the insetData of MyDB class
    public void saveData(View v){
        String name=et1.getText().toString().trim();//trim() remove the space before the text and after the text
        int batch=Integer.parseInt(et2.getText().toString().trim());
        String vill = et3.getText().toString().trim();
        String mail=et4.getText().toString().trim();
        String pass = et5.getText().toString().trim();
        boolean result= MainActivity.myDB.insertData(name,batch,vill,mail,pass);
        if(result){
            Toast.makeText(RegisterActivity.this,name+ " Registered ",Toast.LENGTH_LONG).show();
            et1.setText("");
            et2.setText("");
            et3.setText("");
            et4.setText("");

            Log.d(TAG, "saveData: "+"Saved");
        }
        else{
            AlertDialog.Builder ad = new AlertDialog.Builder(this);
            ad.setMessage("Wrong Input for fields");
            ad.show();
        }
        et5.setText("");

    }



    public void goBack(View v){
        Intent i = new Intent(RegisterActivity.this,MainActivity.class);
        startActivity(i);

    }
}
