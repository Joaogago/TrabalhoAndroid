package com.app.joaorafael.myapplication;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FistAccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fist_access);

        EditText editTextPW = (EditText) findViewById(R.id.editTextPassword);
        EditText editTextDica = (EditText) findViewById(R.id.editTextDica);

        String pw =editTextPW.getText().toString();
        String dica =editTextDica.getText().toString();

        ContentValues contentValues = new ContentValues();

        contentValues.put(" Password ",pw);
        contentValues.put(" DicaPW ", dica);

        SQLiteDatabase db = new CriarContaSQLite(getApplicationContext()).getWritableDatabase();
        db.insert("user", null, contentValues);
        Toast toast = Toast.makeText(getApplicationContext(), "Conta Criada", Toast.LENGTH_LONG);
        toast.show();
        Intent i = new Intent();
        i.setClass(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }

}
