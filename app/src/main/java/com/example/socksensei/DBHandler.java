package com.example.socksensei;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DBName = "Database";
    private static final int DBVersion = 1;
    private static final String TableName = "StoreData";
    private static final String SockName = "SockName";
    private static final String SockDescription = "SockDescription";

    public DBHandler(Context context) {
        super(context, DBName, null, DBVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // on below line we are creating
        // an sqlite query and we are
        // setting our column names
        // along with their data types.
        String query = "CREATE TABLE " + TableName + " ("
                + SockName + " TEXT,"
                + SockDescription + " TEXT)";

        db.execSQL(query);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this method is called to check if the table exists already.
        db.execSQL("DROP TABLE IF EXISTS " + TableName);
        onCreate(db);
    }

}
