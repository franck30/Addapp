package com.skysoft.addapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edNom, edPrenom, edNombre1, edNombre2, edNombre3;
    Button btnCalculer;
    TextView tvNomPrenom, tvResultat;
    int nb1, nb2, nb3, somme;

    String nom, prenom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edNom = findViewById(R.id.edNom);
        edPrenom = findViewById(R.id.edPrenom);
        edNombre1 = findViewById(R.id.edNombre1);
        edNombre2 = findViewById(R.id.edNombre2);
        edNombre3 = findViewById(R.id.edNombre3);

        tvNomPrenom = findViewById(R.id.tvNomPrenom);
        tvResultat = findViewById(R.id.tvResultat);

        btnCalculer = findViewById(R.id.btnCalculer);

        btnCalculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (edNombre1.getText().toString().equals("") || edNombre2.getText().toString().equals("") || edNombre3.getText().toString().equals("")){

                    Toast.makeText(MainActivity.this, "les champs nombres doivent etre remplis", Toast.LENGTH_LONG).show();

                } else {
                    somme= nb1 + nb2 + nb3;

                    nb1 = Integer.parseInt(edNombre1.getText().toString());
                    nb2 = Integer.parseInt(edNombre2.getText().toString());
                    nb3 = Integer.parseInt(edNombre3.getText().toString());
                    nom = edNom.getText().toString();
                    prenom = edPrenom.getText().toString();




                    tvNomPrenom.setText(nom+" "+prenom);
                    tvResultat.setText("la somme est "+ String.valueOf(somme));
                }




            }
        });


    }
}