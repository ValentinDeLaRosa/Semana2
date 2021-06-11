package com.example.semana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton;
        EditText nombre;
        DatePicker fecha;
        EditText telefono;
        EditText email;
        EditText desc;

        nombre = (EditText)findViewById(R.id.txtNombre);
        fecha = (DatePicker)findViewById(R.id.datePicker);
        telefono = (EditText)findViewById(R.id.txtTelefono);
        email = (EditText)findViewById(R.id.txtEmail);
        desc = (EditText)findViewById(R.id.txtDescripcion);


        boton = (Button)findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                int day = fecha.getDayOfMonth();
                int month = fecha.getMonth();
                int year =  fecha.getYear();
                Calendar calendar = Calendar.getInstance();
                calendar.set(day, month, year);

                intent.putExtra("NOMBRE", nombre.getText().toString());
                intent.putExtra("FECHA", calendar.getTime().toString());
                System.out.println(calendar.getTime().toString());
                intent.putExtra("TELEFONO", telefono.getText().toString());
                intent.putExtra("EMAIL", email.getText().toString());
                intent.putExtra("DESC", desc.getText().toString());

                startActivity(intent);
            }
        });
    }
}