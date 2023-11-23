package com.example.apptest.DataBase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class GasEtaDB extends SQLiteOpenHelper {

    public static final String  DB_NAME = "gaseta_db";

    public static final int DB_Version = 1;

    Cursor cursor;

    SQLiteDatabase db;

    public GasEtaDB(Context context) {
        super(context, DB_NAME, null, DB_Version);

        db = getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sqlTabela = "CREATE TABLE combustivel(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nomeCombustivel TEXT," +
                "precoCombustivel REAL," +
                "recomendacao TEXT)";

        db.execSQL(sqlTabela);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}