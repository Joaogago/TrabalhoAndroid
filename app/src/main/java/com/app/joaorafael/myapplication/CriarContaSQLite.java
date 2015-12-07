package com.app.joaorafael.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by JOAORAFAEL on 06/12/2015.
 */
public class CriarContaSQLite extends SQLiteOpenHelper {

        public static final int DATABASE_VERSION = 1;
        public static final String DATABASE_NAME = " aplication_db ";
        public static final String TABLE_CONTA = "user";

        public static final String KEY_PW = " Password ";
        public static final String KEY_DICA = " DicaPw ";

        public CriarContaSQLite(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String CREATE_CONTATS_TABLE = "CREATE TABLE " + TABLE_CONTA +
                    "("+ KEY_PW + " TEXT, "
                    + KEY_DICA + " TEXT " + ");";
            db.execSQL(CREATE_CONTATS_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS" + "TABLE_CONTAS");
        }
    }

