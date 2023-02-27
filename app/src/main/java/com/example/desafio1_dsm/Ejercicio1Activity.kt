package com.example.desafio1_dsm

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


lateinit var txtCod : EditText
lateinit var txtNombre : EditText
lateinit var txtApellido : EditText
lateinit var txtVenta : EditText
lateinit var txtCantidad : EditText
lateinit var btnCrearFicha : Button
lateinit var btnRegresarE1 : Button

class Ejercicio1Activity : AppCompatActivity() {
    //Creando el arreglo para el "Combobox"
    val meses = arrayOf("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)

        //Importando los botones del formulario
        txtCod = findViewById(R.id.txtCod)
        txtNombre = findViewById(R.id.txtNombre)
        txtApellido = findViewById(R.id.txtApellido)
        txtVenta = findViewById(R.id.txtVenta)
        txtCantidad = findViewById(R.id.txtCantidad)
        //Importando el equivalente al combobox
        val spinner = findViewById<Spinner>(R.id.lstSpinner)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,meses)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                var mes : String = meses[position].toString()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                var mes: String = meses[0].toString()
            }

        }
        btnCrearFicha = findViewById(R.id.btnCrearFicha)
        btnRegresarE1 = findViewById(R.id.btnRegresarE1)

        //Guardamos las variables digitales
        var cod : String = txtCod.toString()
        var nombre : String = txtNombre.toString()
        var apellido : String = txtApellido.toString()
        var venta : Double = txtVenta.toString().toDouble()
        var cantidad : Int = txtCantidad.toString().toInt()

        //Acciones de los botones


        btnRegresarE1.setOnClickListener{
            val intent = Intent(this, SelectActivity::class.java)
            startActivity(intent)
        }


    }
}