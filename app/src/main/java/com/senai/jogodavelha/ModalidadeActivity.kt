package com.senai.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ModalidadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modalidade)

        val player = findViewById<Button>(R.id.playerPlayer)
        val maquina = findViewById<Button>(R.id.playerMaquina)
        val intent = Intent (this, DificuldadesActivity::class.java)
        val intent2 = Intent (this, MainActivity::class.java)

        player.setOnClickListener(){
            startActivity(intent2)
            finish()
        }
        maquina.setOnClickListener(){
            startActivity(intent)
            finish()
        }
    }
}