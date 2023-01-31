package com.example.numerologycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        Button sendButton = (Button) findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText emailEditText = (EditText) findViewById(R.id.emailEditText);
                TextView emailErrorTextView = (TextView) findViewById(R.id.emailErrorTextView);
                String email = String.valueOf(emailEditText.getText());
                if (email.isEmpty()) {
                    emailErrorTextView.setText("Required");
                } else {
                    emailErrorTextView.setText("");
                    if (email.equals("uytpv@gmail.com")) {
                        Toast.makeText(getApplicationContext(), "Your request was sent, check your email!", Toast.LENGTH_LONG).show();
                    } else {
                        emailEditText.setError("Your email is not exists on the system!");
                    }
                }
            }
        });
    }
}