package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import com.example.newproject.model.Cachorro;

public class MainActivity extends AppCompatActivity {
    private EditText id;
    private EditText nome;
    private EditText raca;
    private EditText cor;
    private EditText genero;

    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mapeamentoXML();
        super.onCreate(savedInstanceState);

    }

    private void mapeamentoXML(){
        setContentView(R.layout.activity_main);
        nome = findViewById(R.id.etNome);
        raca = findViewById(R.id.etRaca);
        cor = findViewById(R.id.etCor);
        genero = findViewById(R.id.etGenero);
    }

    public void salvar(){
        Cachorro c = new Cachorro();
        c.setNome(nome.getText().toString());
        c.setRaca(raca.getText().toString());
        c.setCor(raca.getText().toString());
        c.setGenero(genero.getText().toString());
        DatabaseReference cachorros = databaseReference.child("cachorros");
        cachorros.push().setValue(c);


    }



}