package com.senai.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.senai.jogodavelha.databinding.ActivityTelaInicialBinding

class TelaInicialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        val jogar = findViewById<Button>(R.id.jogar)
        val intent = Intent(this, ModalidadeActivity::class.java)

        jogar.setOnClickListener(){
            startActivity(intent)
            finish()
        }
    }
}