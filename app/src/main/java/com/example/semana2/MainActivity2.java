package com.example.semana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView nombre;
        TextView fecha;
        TextView telefono;
        TextView email;
        TextView desc;
        Button editar;

        nombre = (TextView)findViewById(R.id.txtNombre);
        fecha = (TextView)findViewById(R.id.txtFecha);
        telefono = (TextView)findViewById(R.id.txtTelefono);
        email = (TextView)findViewById(R.id.txtEmail);
        desc = (TextView)findViewById(R.id.txtDesc);
        editar = (Button)findViewById((R.id.buttonEditar));
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent2);
            }
        });

        Intent intent = getIntent();
        nombre.setText(intent.getStringExtra("NOMBRE"));
        fecha.setText(intent.getStringExtra("FECHA"));
        telefono.setText((intent.getStringExtra("TELEFONO")));
        email.setText(intent.getStringExtra("EMAIL"));
        desc.setText(intent.getStringExtra("DESC"));
    }
}