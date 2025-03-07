package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity  {
    EditText nom;
    EditText email ;
    EditText phone;
    EditText add;
    Spinner ville;
    Button btn;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        nom = findViewById(R.id.Nomcomplet);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.Telephone);
        add=findViewById(R.id.adresse);
        ville =findViewById(R.id.spinner);

        btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, nom.getText() + " " + prenom.getText() + " " + num.getText(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("nom", nom.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("phone",phone.getText().toString());
                intent.putExtra("adresse",add.getText().toString());
                intent.putExtra("ville",ville.getSelectedItem().toString());
                startActivity(intent);
            }
        });



    }




}