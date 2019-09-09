package com.example.aluno.takumi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bloc;
    private Button bped;
    private Button bcard;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elementos);

        bloc = (Button) findViewById(R.id.bloc);
        bped = (Button) findViewById(R.id.bped);
        bcard = (Button) findViewById(R.id.bcard);

        bloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Comando para chamar outra tela
                // o new Intent precisa de dois parâmetros: a tela atual.this e a tela que será chamada.class
                startActivity( new Intent(MainActivity.this, Localizacao.class) );
            }
        });


        bped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Pedido.class));
            }
        });

        bcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(MainActivity.this, Cardapio.class));
            }
        });




    }

}
