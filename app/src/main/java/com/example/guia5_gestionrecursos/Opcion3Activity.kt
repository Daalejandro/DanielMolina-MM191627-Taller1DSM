package com.example.guia5_gestionrecursos;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText

import android.widget.TextView
import android.widget.RadioButton
import android.widget.Toast

class Opcion3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opcion3)

        val dato1 = findViewById<EditText>(R.id.et1)
        val dato2= findViewById<EditText>(R.id.et2)
        val res=findViewById<TextView>(R.id.tv1)
        val cal=findViewById<Button>(R.id.btn1)
        val suma=findViewById<RadioButton>(R.id.rb1)
        val resta=findViewById<RadioButton>(R.id.rb2)
        val multiplicacion=findViewById<RadioButton>(R.id.rb3)
        val divicion=findViewById<RadioButton>(R.id.rb4)

        cal.setOnClickListener{

            val nro1 = dato1.text.toString().toInt()
            val nro2 = dato2.text.toString().toInt()

            if (suma.isChecked){
                val operacion= (nro1) + (nro2);
                res.text="El resultado es ${operacion}"

            }
            if (resta.isChecked){
                val operacion= (nro1) - (nro2);
                res.text="El resultado es ${operacion}"

            }
            if (multiplicacion.isChecked){
                val operacion= (nro1) * (nro2);
                res.text="El resultado es ${operacion}"

            }
            if (divicion.isChecked){
                val operacion= (nro1) / (nro2);
                res.text="El resultado es ${operacion}"

            }
        }




    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_muestra, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.opcion1) {
            Toast.makeText(this, "Se seleccionó la primer opción", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Opcion1Activity::class.java)
            startActivity(intent)
        }
        if (id == R.id.opcion2) {
            Toast.makeText(this, "Se seleccionó la segunda opción", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Opcion2Activity::class.java)
            startActivity(intent)
        }
        if (id == R.id.opcion3) {
            Toast.makeText(this, "Se seleccionó la tercer opción", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Opcion3Activity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}