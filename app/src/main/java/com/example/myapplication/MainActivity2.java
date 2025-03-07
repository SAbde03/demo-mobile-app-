package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
   TextView nomText;
   TextView emailText;
   TextView phoneText;
   TextView adresseText ;
   TextView villeText ;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Intent i= getIntent();

        nomText = findViewById(R.id.nom);
        emailText = findViewById(R.id.email);
        phoneText = findViewById(R.id.phone);
        adresseText = findViewById(R.id.adresse);
        villeText = findViewById(R.id.ville);

        String nom = i.getStringExtra("nom");
        String email = i.getStringExtra("email");
        String phone = i.getStringExtra("phone");
        String adresse =i.getStringExtra("adresse");
        String ville = i.getStringExtra("ville");

        nomText.setText("Nom:  "+nom);
        emailText.setText("Email:  "+email);
        phoneText.setText("Phone:  "+phone);
        adresseText.setText("Adresse:  "+adresse);
        villeText.setText("Ville:  "+ville);


    }
}
