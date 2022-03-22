package com.senai.jogodavelha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Console

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val posicao1 = findViewById<Button>(R.id.posicao1)
        val posicao2 = findViewById<Button>(R.id.posicao2)
        val posicao3 = findViewById<Button>(R.id.posicao3)
        val posicao4 = findViewById<Button>(R.id.posicao4)
        val posicao5 = findViewById<Button>(R.id.posicao5)
        val posicao6 = findViewById<Button>(R.id.posicao6)
        val posicao7 = findViewById<Button>(R.id.posicao7)
        val posicao8 = findViewById<Button>(R.id.posicao8)
        val posicao9 = findViewById<Button>(R.id.posicao9)
        var teste = findViewById<TextView>(R.id.teste)
        var valorJogadaO = ""
        var contadorJogadas: Int = 0
        var valorJogadaX = ""


        posicao1.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao1.background = getDrawable(R.drawable.circulo)
                valorJogadaX += contadorJogadas.toString()
            } else if (contadorJogadas % 2 != 0) {
                posicao1.background = getDrawable(R.drawable.icone)
                valorJogadaO += contadorJogadas.toString()
            }
            posicao1.setEnabled(false)
            contadorJogadas++
        }

        posicao2.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao2.background = getDrawable(R.drawable.circulo)
                valorJogadaX += contadorJogadas.toString()
            } else if (contadorJogadas % 2 != 0) {
                posicao2.background = getDrawable(R.drawable.icone)
                valorJogadaO += contadorJogadas.toString()
            }
            posicao2.setEnabled(false)
            contadorJogadas++
        }

        posicao3.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao3.background = getDrawable(R.drawable.circulo)
                valorJogadaX += contadorJogadas.toString()
            } else if (contadorJogadas % 2 != 0) {
                posicao3.background = getDrawable(R.drawable.icone)
                valorJogadaO += contadorJogadas.toString()

            }
            posicao3.setEnabled(false)
            teste.text = valorJogadaX
            contadorJogadas++

            valorJogadaX.toSortedSet()
            if(valorJogadaX =="024"){
                Toast.makeText(this, "Você ganhou!", Toast.LENGTH_SHORT).show()
            }
        }

        posicao4.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao4.background = getDrawable(R.drawable.circulo)
                valorJogadaX += contadorJogadas.toString()
            } else if (contadorJogadas % 2 != 0) {
                posicao4.background = getDrawable(R.drawable.icone)
                valorJogadaO += contadorJogadas.toString()

            }
            posicao4.setEnabled(false)
            teste.text = valorJogadaX
            contadorJogadas++

        }

        posicao5.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao5.background = getDrawable(R.drawable.circulo)
                valorJogadaX += contadorJogadas.toString()
            } else if (contadorJogadas % 2 != 0) {
                posicao5.background = getDrawable(R.drawable.icone)
                valorJogadaO += contadorJogadas.toString()

            }
            posicao5.setEnabled(false)
            teste.text = valorJogadaX
            contadorJogadas++
        }

        posicao6.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao6.background = getDrawable(R.drawable.circulo)
                valorJogadaX += contadorJogadas.toString()
            } else if (contadorJogadas % 2 != 0) {
                posicao6.background = getDrawable(R.drawable.icone)
                valorJogadaO += contadorJogadas.toString()
            }
            posicao6.setEnabled(false)
            teste.text = valorJogadaX
            contadorJogadas++
        }

        posicao7.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao7.background = getDrawable(R.drawable.circulo)
                valorJogadaX += contadorJogadas.toString()
            } else if (contadorJogadas % 2 != 0) {
                posicao7.background = getDrawable(R.drawable.icone)
                valorJogadaO += contadorJogadas.toString()
            }
            posicao7.setEnabled(false)
            teste.text = valorJogadaX
            contadorJogadas++
        }

        posicao8.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao8.background = getDrawable(R.drawable.circulo)
                valorJogadaX += contadorJogadas.toString()
            } else if (contadorJogadas % 2 != 0) {
                posicao8.background = getDrawable(R.drawable.icone)
                valorJogadaO += contadorJogadas.toString()
            }
            posicao8.setEnabled(false)
            teste.text = valorJogadaX
            contadorJogadas++
        }

        posicao9.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao9.background = getDrawable(R.drawable.circulo)
                valorJogadaX += contadorJogadas.toString()
            } else if (contadorJogadas % 2 != 0) {
                posicao9.background = getDrawable(R.drawable.icone)
                valorJogadaO += contadorJogadas.toString()
            }
            posicao9.setEnabled(false)
            teste.text = valorJogadaX
            contadorJogadas++
        }


   teste.text = valorJogadaX
    }
}