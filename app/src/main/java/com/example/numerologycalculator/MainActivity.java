package com.example.numerologycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText emailEditText = (EditText) findViewById(R.id.emailEditText);
                EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
                TextView emailErrorTextView = (TextView) findViewById(R.id.emailErrorTextView);
                TextView passwordErrorTextView = (TextView) findViewById(R.id.passwordErrorTextView);


                String email = String.valueOf(emailEditText.getText());
                String password = String.valueOf(passwordEditText.getText());

                if (email.isEmpty()) {
                    emailErrorTextView.setText("Required");
                } else if (password.isEmpty()) {
                    passwordErrorTextView.setText("Required");
                } else {
                    emailErrorTextView.setText("");
                    passwordErrorTextView.setText("");
                    if (email.equals("uytpv@gmail.com") && password.equals("abc@123")) {
                        Intent startIntent = new Intent(getApplicationContext(), CustomerListActivity.class);
                        startActivity(startIntent);
                    } else {
                        emailEditText.setError("Your email or password is not correct");
                        passwordEditText.setError("Your email or password is not correct");
                    }
                }
            }
        });
    }
}