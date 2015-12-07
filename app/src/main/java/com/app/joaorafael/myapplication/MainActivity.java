package com.app.joaorafael.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private boolean fistAccess=false;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(fistAccess=false){
            setFistAcesses();
        }else{
            login();
        }

    }

    public void setFistAcesses() {
        fistAccess =true;
        Intent i = new Intent();
        i.setClass(getApplicationContext(), FistAccessActivity.class);
        startActivity(i);
    }
    public void login(){

        button = (Button) findViewById(R.id.btn_confima);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                String pw = editText.getText().toString();
            }
        });
}
}