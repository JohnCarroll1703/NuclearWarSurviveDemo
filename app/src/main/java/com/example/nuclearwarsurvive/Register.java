package com.example.nuclearwarsurvive;

import androidx.annotation.NonNull;
import androidx.appcompat.app.*;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Register extends AppCompatActivity {

    private EditText editTextRegisterPassword, editTextRegisterEmail;
    private FirebaseAuth auth;
    private TextView loginRedirectText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        auth = FirebaseAuth.getInstance();

        editTextRegisterEmail = findViewById(R.id.editTextTextEmailAddress);
        editTextRegisterPassword = findViewById(R.id.editTextTextPassword);
        Button btnReg = findViewById(R.id.register_button);
        loginRedirectText = findViewById(R.id.movetosignup2);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = editTextRegisterEmail.getText().toString().trim();
                String password = editTextRegisterPassword.getText().toString().trim();

                if(user.isEmpty()){
                    editTextRegisterEmail.setError("Username cannot be empty");
                }
                if(password.isEmpty()){
                    editTextRegisterPassword.setError("Password cannot be empty.");
                } else{
                    auth.createUserWithEmailAndPassword(user, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(Register.this, "Registration is successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Register.this, LoginPage.class));
                            } else{
                                Toast.makeText(Register.this, "Register failed" +
                                        task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                }
            }
        });
        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, LoginPage.class));
            }
        });
        }
    }
