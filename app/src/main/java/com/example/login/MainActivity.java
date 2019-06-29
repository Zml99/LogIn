package com.example.login;

import android.app.ProgressDialog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button clear;
    private Button login;
    private Button registrarse;
    private EditText TextEmail;
    private EditText TextPassword;
    private FirebaseAuth mAuth;
    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        TextEmail = (EditText) findViewById(R.id.txtuser);
        TextPassword = (EditText) findViewById(R.id.txtpass);
        registrarse = (Button)findViewById(R.id.btn_registrarse);
        login = (Button)findViewById(R.id.btnlog);

        clear = (Button)findViewById(R.id.btnclear);

        progressDialog = new ProgressDialog(this);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextEmail.getText().clear();
                TextPassword.getText().clear();
            }
        });
        registrarse.setOnClickListener(this);
    }

    private void registrarUsuarios() {
        String email = TextEmail.getText().toString().trim();
        String password = TextPassword.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Se debe ingresar un correo", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Se debe ingresar un correo", Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("Realizando registro en linea...");
        progressDialog.show();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            Toast.makeText(MainActivity.this, "Se ha registrado el correo", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "No pudo registrse el usuario", Toast.LENGTH_SHORT).show();
                        }

                        progressDialog.dismiss();

                        // ...
                    }
                });
    }

    @Override
    public void onClick(View v){
        registrarUsuarios();
    }
}
