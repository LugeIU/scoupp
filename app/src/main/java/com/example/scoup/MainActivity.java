package com.example.scoup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        EditText editTextCurrentPassword = findViewById(R.id.editTextCurrentPassword);
        EditText editTextNewPassword = findViewById(R.id.editTextNewPassword);
        Button buttonCancel = findViewById(R.id.buttonCancel);
        Button buttonSave = findViewById(R.id.buttonSave);


        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String newPassword = editTextNewPassword.getText().toString();

                Toast.makeText(MainActivity.this, "Password changed successfully!", Toast.LENGTH_SHORT).show();
            }
        });


        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editTextCurrentPassword.setText("");
                editTextNewPassword.setText("");

                Toast.makeText(MainActivity.this, "Changes canceled!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}