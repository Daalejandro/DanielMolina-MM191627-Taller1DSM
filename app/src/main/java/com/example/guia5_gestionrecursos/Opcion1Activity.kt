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

class Opcion1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opcion1)



        val nota1 = findViewById<EditText>(R.id.et1)
        val nota2 = findViewById<EditText>(R.id.et2)
        val nota3 =findViewById<EditText>(R.id.et3)
        val nota4=findViewById<EditText>(R.id.et4)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val et1=findViewById<EditText>(R.id.et1)
            val nro1 = nota1.text.toString().toInt()
            val nro2 = nota2.text.toString().toInt()
            val nro3 = nota3.text.toString().toInt()
            val nro4 = nota4.text.toString().toInt()
            val calcular = (nro1 + nro2 + nro3 +nro4)/4


            if (calcular>=6){
                tv1.text = "Usted aprobo con la nota de : ${calcular.toString()}"
            }
            else
            {
                tv1.text = "Usted reprobo con la nota de : ${calcular.toString()}"
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
