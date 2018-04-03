package com.example.ibrahim.a355assignment4pt2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by ibrahim on 4/3/18.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "contacts.db";
    private static final String TABLE_NAME = "contacts";
    private static final String COLUMN_ID = "syn";
    private static final String COLUMN_NAME = "ant;
    private static final String COLUMN_EMAIL = "word";


    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table contacts (word text primary key not null ," +
            " + synonym text not null," +
            " antonym not null,";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);


    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        db.execSQL(TABLE_CREATE);
        this.db =db;


    }

    public void insertContact(Contact c){

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from" + TABLE_NAME; //????
        Cursor cursor = db.rawQuery(query, null);

        String hold;

        values.put(COLUMN_ID, count);

        values.put(COLUMN_NAME, c.getName());
        values.put(COLUMN_EMAIL, c.getEmail());
        values.put(COLUMN_PASS, c.getPass());
        values.put(COLUMN_UNAME, c.getUname());

        db.insert(TABLE_NAME, null, values);

        db.close();

    }

    public String searchPass(String uname){

        db = this.getReadableDatabase();
        String query = "select * from " +TABLE_NAME;
        Cursor cursor = db.rawQuery(query,null);

            String a, b;
            b = "not found";

        if(cursor.moveToFirst()){
            do{

                a = cursor.getString(2);

                if (a.equals(uname)){
                    b = cursor.getString(3);
                    break;

                }
            }
            while (cursor.moveToNext());
        }
        return b;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }
}
