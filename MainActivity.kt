package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    val i=100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton: Button=findViewById(R.id.premer)
        boton.setOnClickListener() {
            Toast.makeText(applicationContext, "Siga clicando", Toast.LENGTH_SHORT).show()
        }
    }
    val secuencia = GlobalScope.launch(Dispatchers.Main) {
        cuenta()
    }


    suspend fun cuenta() {
        while(i !=0){
        val contador: TextView = findViewById(R.id.contador)
        contador.text = ("CONTADOR: "+(i-1))
            delay(1000L)
        }
    }
}