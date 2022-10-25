package com.example.myparcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.res.Configuration;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerV);


        List<Producto>productoList = new ArrayList<>();
        productoList.add(new Producto("Mazorca","Sabrosa para el paladar","69"));
        productoList.add(new Producto("Habichuela Negra","Rica en proteinas","420"));
        productoList.add(new Producto("Habichuela Blanca","Rica en algo","777"));

        productoAdapter productoAdapter = new productoAdapter(this,productoList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(productoAdapter);



    }
}