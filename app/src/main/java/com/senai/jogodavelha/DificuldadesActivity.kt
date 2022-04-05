package com.senai.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DificuldadesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dificuldades)

        val facil = findViewById<Button>(R.id.facil)
        val medio = findViewById<Button>(R.id.medio)
        val dificil = findViewById<Button>(R.id.dificil)
        val intent = Intent(this, ModoFacil::class.java)

        facil.setOnClickListener(){
            startActivity(intent)
            finish()
        }

        medio.setOnClickListener(){
            startActivity(intent)
            finish()
        }

        dificil.setOnClickListener(){
            startActivity(intent)
            finish()
        }
    }
}