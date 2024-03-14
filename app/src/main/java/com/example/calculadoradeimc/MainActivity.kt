package com.example.calculadoradeimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btCalcular = findViewById<Button>(R.id.btncalcular)
        btCalcular.setOnClickListener{
            val pesoid = findViewById<EditText>(R.id.peso)
            val alturaid = findViewById<EditText>(R.id.lblAltura)
            val lblresultado = findViewById<TextView>(R.id.lblResultado)
            val lblClasseid = findViewById<TextView>(R.id.lblClasse)
            val npeso = pesoid?.text.toString().toDouble()
            val naltura = alturaid?.text.toString().toDouble()
            val imc: Double = npeso / (naltura*naltura)
            var classe:String=""

            if (imc <= 18.5 ){
                classe = "Abaixo do peso"

            }
            else if (imc <= 25){
                classe = "Normal"
            }
            else if (imc <= 30){
                classe = "Sobre peso"
            }
            else if (imc <= 35){
                classe = "Obesidade I"
            }
            else if (imc <= 40){
                classe = "Obesidade II"
            }
            else {
                classe = "Obesidade III"
            }
            lblresultado.text = imc.toString()
            lblClasseid.text = classe

            Toast.makeText(this,"IMC = $imc CLassificação=$classe", LENGTH_SHORT).show()

        }
    }

}