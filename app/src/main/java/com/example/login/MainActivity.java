package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button clear;
    private Button login;
    private EditText name;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button)findViewById(R.id.btnlog);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ((EditText) findViewById(R.id.txtuser)).getText().toString();
                String password = ((EditText)findViewById(R.id.txtpass)).getText().toString();

                if(name.equals("18-0465") && password.equals("helloworld")){
                    Intent nuevoform = new Intent(MainActivity.this, SecondActivity.class);
                    startActivityForResult(nuevoform, 0);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Matricula o Clave erronea", Toast.LENGTH_SHORT).show();
                }
            }
        });

        clear = (Button)findViewById(R.id.btnclear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = (EditText)findViewById(R.id.txtuser);
                password = (EditText)findViewById(R.id.txtpass);

                name.getText().clear();
                password.getText().clear();
            }
        });


    }
}
