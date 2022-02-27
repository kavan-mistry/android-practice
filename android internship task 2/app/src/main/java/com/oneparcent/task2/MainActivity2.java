package com.oneparcent.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText user_name,pass_word;
    Button logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences getAuth = getSharedPreferences("logid",MODE_PRIVATE);
        String username = getAuth.getString("str_name",null);
        String password = getAuth.getString("str_password",null);

        user_name = findViewById(R.id.editTextTextPersonName1);
        pass_word = findViewById(R.id.editTextTextPersonName);
        logIn = findViewById(R.id.button1);

        Context context = getApplicationContext();

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( user_name==username && pass_word==password ) {
                    Toast i = Toast.makeText(context,"right ID passwor", Toast.LENGTH_LONG);
                    i.show();
                } else {
                    Toast t = Toast.makeText(context,"you are wrong",Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}