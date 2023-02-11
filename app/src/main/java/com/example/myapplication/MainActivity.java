package com.example.myapplication;

import static android.widget.Toast.*;

import android.content.Intent;
import android.os.Bundle;
//import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
//import android.widget.TextView;
//import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.database.SQLException;
import java.sql.Connection;
import java.util.Random;


public class MainActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnLogin(View view)
    {
        EditText edtTxtFirstname = findViewById(R.id.edtTxtFirstname);
        EditText password = findViewById(R.id.edtTxtPassword);

        password.setText(generateString( 8));

        Toast.makeText(this, "WELCOME! Looks like you dont have account, click down below", LENGTH_SHORT).show();


    }

    private String generateString(int length)
    {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++)
        {
            char c = chars[r.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }
    public void btnOnRegistration (View view)
    {
        Intent intent = new Intent(this, MainActivityNewWindow.class);
        startActivity(intent);
    }


}