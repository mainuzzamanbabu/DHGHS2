package com.example.dhghs;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import android.util.Log;
import android.widget.Toast;



public class MyDB extends SQLiteOpenHelper {

    private static final String TAG = "MyDB";

    Context c;
    public static String DBNAME = "DHGHSAA";
    public static int VERSION = 1;

    public MyDB (Context context){
        super(context, DBNAME, null, VERSION );
        c=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        try {
            String qry = "create table DHGHSTab(name TEXT,batch INTEGER, village TEXT, email TEXT PRIMARY KEY, password TEXT)";
            db.execSQL(qry);
            Toast.makeText(c, " Signup Successfully ", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Log.e("MyDB"," Signup Error ",e);
        }
    }
     @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

     }

     //persistance logic for record insertion into darabase table
     public boolean insertData(String name, int batch, String village,String mail,String pass){
        try{
            String qry = "insert into DHGHSTab values('"+name+"',"+batch+",'"+village+"','"+mail+"','"+pass+"')";
            SQLiteDatabase db = getWritableDatabase();
            db.execSQL(qry);
            Toast.makeText(c, name+ " Signup Successfully", Toast.LENGTH_SHORT).show();
            return true;

        }catch (Exception e){
            Log.e("MyDB"," Signup Error in the database ",e);
            return false;
        }

    }
    public Cursor memberLoginCcheck(String email){
        try {
            String qry = "Select name,password from DHGHSTab where email= '"+email+"'";
            SQLiteDatabase db = getWritableDatabase();
            Cursor c=db.rawQuery(qry,null);

            Log.d(TAG, "memberLoginCcheck: "+c.getCount());

            return c;
        }catch (Exception e){
            Log.e("MyDB"," Login Error ",e);
            return null;
        }
    }
}

