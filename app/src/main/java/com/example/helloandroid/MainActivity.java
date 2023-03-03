package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton radioButton1 = findViewById(R.id.maleButton);
        RadioButton radioButton2 = findViewById(R.id.femaleButton);
        Button submitButton = findViewById(R.id.hiButton);
        EditText name =  findViewById(R.id.editTextTextPersonName);




        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editTextValue = name.getText().toString();
                if (radioButton1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Hello Sir " + editTextValue +"! ", Toast.LENGTH_SHORT).show();
                } else if (radioButton2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Hello Miss " + editTextValue +"! ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Hello " + editTextValue +"! ", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}