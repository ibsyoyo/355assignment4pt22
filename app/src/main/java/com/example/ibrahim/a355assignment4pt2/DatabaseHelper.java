package com.example.ibrahim.a355assignment4pt2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by ibrahim on 4/3/18.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "contacts.db";
    private static final String TABLE_NAME = "contacts";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "contacts.db";
    private static final String COLUMN_EMAIL = "contacts.db";
    private static final String COLUMN_UNAME = "uname";
    private static final String COLUMN_PASS = "pass";

    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table contacts (id integer primary key not null auto increment ," +
            " + name text not null," +
            " email not null," +
            " name text not null," +
            " uname text not null" +
            " pass text not null):";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        db.execSQL(TABLE_CREATE);
        this.db =db;


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        String query = "DROP TABLE IF EXISTS" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }
}
