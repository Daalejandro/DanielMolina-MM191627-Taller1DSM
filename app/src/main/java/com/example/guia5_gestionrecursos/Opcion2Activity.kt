package com.example.guia5_gestionrecursos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Opcion2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opcion2)

         val nombre = findViewById<EditText>(R.id.edtnombre)
        val salario = findViewById<EditText>(R.id.edtsalario)
        val calculo = findViewById<Button>(R.id.btncalcular)
        val resultado =findViewById<TextView>(R.id.textView)


        calculo.setOnClickListener {

            val dato1 = nombre.text.toString()
            val dato2 = salario.text.toString().toInt()

            val operacion=(dato2)*(0.12)
            val salariodescuento=dato2-operacion

            resultado.text="Estimad@ ${dato1.toString()}  su salario total con deducciones de ISS,AFP Y RENTA es de: ${salariodescuento.toString()}"


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