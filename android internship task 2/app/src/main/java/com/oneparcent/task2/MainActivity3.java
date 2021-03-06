package com.oneparcent.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    EditText editText_name,editText_email,editText_password;
    TextView login;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editText_name = findViewById(R.id.editTextTextPersonName1);
        editText_email = findViewById(R.id.editTextTextPersonName2);
        editText_password = findViewById(R.id.editTextTextPersonName3);
        signUp = findViewById(R.id.button1);
        login = findViewById(R.id.textView3);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(i2);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editText_name.getText().toString();
                String email = editText_email.getText().toString();
                String password = editText_password.getText().toString();

                SharedPreferences auth = getSharedPreferences("logid",MODE_PRIVATE);
                SharedPreferences.Editor editor = auth.edit();

                editor.putString("str_name", name);
                editor.putString("str_email", email);
                editor.putString("str_password", password);
                editor.apply();

                Intent i = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(i);

            }
        });

    }
}