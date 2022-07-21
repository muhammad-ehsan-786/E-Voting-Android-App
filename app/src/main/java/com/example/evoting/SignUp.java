package com.example.evoting;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {

    EditText name, email,password;
    Button signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("Sign up");
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF6200EE"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

        name = (EditText) findViewById(R.id.editeName);
        email = (EditText) findViewById(R.id.editeEmail);
        password = (EditText) findViewById(R.id.editePassword);

        signUp = (Button) findViewById(R.id.SignUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SignUpValidate(name,email,password);


            }
        });

    }

    public void SignUpValidate(EditText name,EditText email, EditText password ){
        String candidateName = name.getText().toString();
        String candidateEmail = email.getText().toString();
        String candidatePassword = password.getText().toString();
        if(candidateName.isEmpty()){
            Toast.makeText(this,"Name field is Empty",Toast.LENGTH_SHORT).show();
            return ;

        }

        if(candidatePassword.isEmpty()){
            Toast.makeText(this,"Password field is Empty",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(candidateEmail.isEmpty()){
            Toast.makeText(this,"email field is empty",Toast.LENGTH_SHORT).show();
            return;

        }
        else{

            Intent intent=new Intent(SignUp.this, LogIn.class);
            startActivity(intent);
        }

    }
}