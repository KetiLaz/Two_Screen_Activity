package com.example.askisi32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Bundle extras = getIntent().getExtras();
        TextView txtName = findViewById(R.id.txtName);
        TextView txtLastName =  findViewById(R.id.txtLastName);
        TextView txtCity = findViewById(R.id.txtCity);
        TextView txtAddress = findViewById(R.id.txtAddress);
        TextView txtPhone = findViewById(R.id.txtPhone);
        TextView txtEmail = findViewById(R.id.txtEmail);

        if (extras != null) {
            String name = extras.getString("name");
            String lastName = extras.getString("lastName");
            String city = extras.getString("city");
            String address = extras.getString("address");
            String phone = extras.getString("phone");
            String email = extras.getString("email");

            txtName.setText(name);
            txtLastName.setText(lastName);
            txtCity.setText(city);
            txtAddress.setText(address);
            txtPhone.setText(phone);
            txtEmail.setText(email);
        }






    }
}