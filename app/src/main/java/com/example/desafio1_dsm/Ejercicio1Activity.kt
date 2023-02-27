package com.example.desafio1_dsm

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Button

lateinit var txtCod : EditText
lateinit var txtNombre : EditText
lateinit var txtApellido : EditText
lateinit var txtMes : EditText
lateinit var btnCrearFicha : Button
lateinit var btnRegresarE1 : Button

class Ejercicio1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)

        //Importando los componentes del formulario
        txtCod = findViewById(R.id.txtCod)
        txtNombre = findViewById(R.id.txtNombre)
        txtApellido = findViewById(R.id.txtApellido)
        txtMes = findViewById(R.id.txtMes)
        btnCrearFicha= findViewById(R.id.btnCrearFicha)
        btnRegresarE1 = findViewById(R.id.btnRegresarE1)

        //Recolectando los datos en la aplicacion
        var cod : String = txtCod.text.toString()
        var nombre : String = txtNombre.text.toString()
        var apellido : String = txtApellido.text.toString()
        var mes : String = txtMes.text.toString()


        //Acciones de los botones
        btnCrearFicha.setOnClickListener{
            val inten = Intent(this, FichaActivity::class.java)
            inten.putExtra("cod",cod)
            inten.putExtra("nombre",nombre)
            inten.putExtra("apellido",apellido)
            inten.putExtra("mes",mes)
            startActivity(inten)
        }

        btnRegresarE1.setOnClickListener{
            val intent = Intent(this, SelectActivity::class.java)
            startActivity(intent)
        }

    }
}