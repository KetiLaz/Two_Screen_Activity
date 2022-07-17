package com.example.askisi32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edTxtName = findViewById(R.id.edTxtName);
        EditText edTxtLastName = findViewById(R.id.edTxtLastName);
        EditText edTxtCity = findViewById(R.id.edTxtCity);
        EditText edTxtAddress = findViewById(R.id.edTxtAddress);
        EditText edTxtPhone = findViewById(R.id.edTxtPhone);
        EditText edTxtEmail = findViewById(R.id.edTxtEmail);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edTxtName.getText().toString();
                String lastName = edTxtLastName.getText().toString();
                String city = edTxtCity.getText().toString();
                String address = edTxtAddress.getText().toString();
                String phone = edTxtPhone.getText().toString();
                String email = edTxtEmail.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("lastName", lastName);
                intent.putExtra("city", city);
                intent.putExtra("address", address);
                intent.putExtra("phone", phone);
                intent.putExtra("email", email);

                startActivity(intent);
            }
        });

    }
}