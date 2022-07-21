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

public class LogIn extends AppCompatActivity {

    EditText editeOne,editeTwo;
    Button buttonOne,buttonTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        getSupportActionBar().setTitle("Log In");
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF6200EE"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

        editeOne = (EditText)  findViewById(R.id.editeTextOne);
        editeTwo =(EditText) findViewById(R.id.editeTextTwo);
        buttonOne =(Button) findViewById(R.id.buttonSignIn);
        buttonTwo = (Button)findViewById(R.id.buttonSignup);


        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validate(editeOne,editeTwo);


            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signUpIntent = new Intent(LogIn.this,SignUp.class);
                startActivity(signUpIntent);
            }
        });



    }
    public void validate(EditText e1,EditText e2){

        String email = e1.getText().toString();
        String password =e2.getText().toString();
        String Expn =
                "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                        +"((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                        +"([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                        +"([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";

        if(email.isEmpty() ||!(Pattern.matches(Expn,email))){
            Toast.makeText(this,"Enter valid email",Toast.LENGTH_SHORT).show();
            return ;

        }

        if(password.isEmpty()){
            Toast.makeText(this,"Enter password",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(email.isEmpty()&& password.isEmpty()){
            Toast.makeText(this,"Please enter email and password",Toast.LENGTH_SHORT).show();
            return;

        }
        else{

            Intent intent=new Intent(LogIn.this, Candidate.class);
            startActivity(intent);
        }




    }

}