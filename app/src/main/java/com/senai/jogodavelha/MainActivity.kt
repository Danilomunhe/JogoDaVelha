package com.senai.jogodavelha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val posicao1 = findViewById<Button>(R.id.posicao1)
        val posicao2 = findViewById<Button>(R.id.posicao2)


            posicao1.setOnClickListener(){
                posicao1.background = getDrawable(R.drawable.icone)
                //Descobrir como desabilitar o botão
            }



        posicao2.setOnClickListener(){
            posicao2.background = getDrawable(R.drawable.circulo)
        }

    }
}