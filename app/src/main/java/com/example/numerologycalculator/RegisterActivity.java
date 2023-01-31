package com.example.numerologycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

// Create link to Login Activity (MainActivity)
        TextView loginLink = (TextView) findViewById(R.id.loginLink);
        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }
        });

//
        Button registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText emailEditText = (EditText) findViewById(R.id.emailEditText);
                EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
                EditText passwordRepeatEditText = (EditText) findViewById(R.id.passwordRepeatEditText);

                TextView emailErrorTextView = (TextView) findViewById(R.id.emailErrorTextView);
                TextView passwordErrorTextView = (TextView) findViewById(R.id.passwordErrorTextView);
                TextView passwordRepeatErrorTextView = (TextView) findViewById(R.id.passwordRepeatErrorTextView);


                String email = String.valueOf(emailEditText.getText());
                String password = String.valueOf(passwordEditText.getText());
                String passwordRepeat = String.valueOf(passwordRepeatEditText.getText());

                if (email.isEmpty()) {
                    emailErrorTextView.setText("Required");
                } else if (password.isEmpty()) {
                    passwordErrorTextView.setText("Required");
                } else if (passwordRepeat.isEmpty()) {
                    passwordRepeatErrorTextView.setText("Required");
                } else {
                    emailErrorTextView.setText("");
                    passwordErrorTextView.setText("");
                    passwordRepeatErrorTextView.setText("");
                    if (password.equals(passwordRepeat)) {
                        Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(startIntent);
                    } else {
                        passwordRepeatErrorTextView.setText("Repeat password does not match!");
                    }
                }
            }
        });
    }
}