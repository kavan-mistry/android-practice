package com.oneparcent.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    String user_name;
    String pass_word;
    TextView signup;
    Button logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences getAuth = getSharedPreferences("logid",MODE_PRIVATE);
        String username = getAuth.getString("str_name",null);
        String password = getAuth.getString("str_password",null);

        user_name = findViewById(R.id.editTextTextPersonName1).toString();
        pass_word = findViewById(R.id.editTextTextPersonName).toString();
        signup = findViewById(R.id.textView3);
        logIn = findViewById(R.id.button1);

        Context context = getApplicationContext();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);
            }
        });

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, username, Toast.LENGTH_SHORT).show();
                Toast.makeText(context, password, Toast.LENGTH_SHORT).show();

                if (user_name==username) {
                    if (pass_word==password){
                        Toast i = Toast.makeText(context,"right ID passwor", Toast.LENGTH_LONG);
                        i.show();
                    }
                } else {
                    Toast t = Toast.makeText(context,"you are wrong",Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}