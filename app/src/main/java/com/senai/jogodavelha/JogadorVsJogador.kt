package com.senai.jogodavelha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_jogador_vs_jogador.*


class JogadorVsJogador : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogador_vs_jogador)

        val posicao1 = findViewById<Button>(R.id.posicao1)
        val posicao2 = findViewById<Button>(R.id.posicao2)
        val posicao3 = findViewById<Button>(R.id.posicao3)
        val posicao4 = findViewById<Button>(R.id.posicao4)
        val posicao5 = findViewById<Button>(R.id.posicao5)
        val posicao6 = findViewById<Button>(R.id.posicao6)
        val posicao7 = findViewById<Button>(R.id.posicao7)
        val posicao8 = findViewById<Button>(R.id.posicao8)
        val posicao9 = findViewById<Button>(R.id.posicao9)
        var contadorJogadas: Int = 0
        val arrayJogadasX = IntArray(9)
        val arrayJogadasO = IntArray(9)


        posicao1.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao1.background = getDrawable(R.drawable.marca)
                arrayJogadasX[0] = 1
            } else if (contadorJogadas % 2 != 0) {
                posicao1.background = getDrawable(R.drawable.circulo)
                arrayJogadasO[0] = 1
            }
            posicao1.setEnabled(false)
            contadorJogadas++

            resultadoX(arrayJogadasX)
            resultadoO(arrayJogadasO)
        }
        posicao2.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao2.background = getDrawable(R.drawable.marca)
                arrayJogadasX[1] = 2
            } else if (contadorJogadas % 2 != 0) {
                posicao2.background = getDrawable(R.drawable.circulo)
                arrayJogadasO[1] = 2
            }
            posicao2.setEnabled(false)
            contadorJogadas++

            resultadoX(arrayJogadasX)
            resultadoO(arrayJogadasO)
        }

        posicao3.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao3.background = getDrawable(R.drawable.marca)
                arrayJogadasX[2] = 3
            } else if (contadorJogadas % 2 != 0) {
                posicao3.background = getDrawable(R.drawable.circulo)
                arrayJogadasO[2] = 3

            }
            posicao3.setEnabled(false)
            contadorJogadas++

            resultadoX(arrayJogadasX)
            resultadoO(arrayJogadasO)
        }

        posicao4.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao4.background = getDrawable(R.drawable.marca)
                arrayJogadasX[3] = 4
            } else if (contadorJogadas % 2 != 0) {
                posicao4.background = getDrawable(R.drawable.circulo)
                arrayJogadasO[3] = 4

            }
            posicao4.setEnabled(false)
            contadorJogadas++

            resultadoX(arrayJogadasX)
            resultadoO(arrayJogadasO)

        }

        posicao5.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao5.background = getDrawable(R.drawable.marca)
                arrayJogadasX[4] = 5
            } else if (contadorJogadas % 2 != 0) {
                posicao5.background = getDrawable(R.drawable.circulo)
                arrayJogadasO[4] = 5

            }
            posicao5.setEnabled(false)
            contadorJogadas++

            resultadoX(arrayJogadasX)
            resultadoO(arrayJogadasO)
        }

        posicao6.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao6.background = getDrawable(R.drawable.marca)
                arrayJogadasX[5] = 6
            } else if (contadorJogadas % 2 != 0) {
                posicao6.background = getDrawable(R.drawable.circulo)
                arrayJogadasO[5] = 6
            }
            posicao6.setEnabled(false)
            contadorJogadas++

            resultadoX(arrayJogadasX)
            resultadoO(arrayJogadasO)
        }

        posicao7.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao7.background = getDrawable(R.drawable.marca)
                arrayJogadasX[6] = 7
            } else if (contadorJogadas % 2 != 0) {
                posicao7.background = getDrawable(R.drawable.circulo)
                arrayJogadasO[6] = 7
            }
            posicao7.setEnabled(false)
            contadorJogadas++

            resultadoX(arrayJogadasX)
            resultadoO(arrayJogadasO)
        }

        posicao8.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao8.background = getDrawable(R.drawable.marca)
                arrayJogadasX[7] = 8
            } else if (contadorJogadas % 2 != 0) {
                posicao8.background = getDrawable(R.drawable.circulo)
                arrayJogadasO[7] = 8
            }
            posicao8.setEnabled(false)
            contadorJogadas++

            resultadoX(arrayJogadasX)
            resultadoO(arrayJogadasO)
        }

        posicao9.setOnClickListener() {
            if (contadorJogadas % 2 == 0) {
                posicao9.background = getDrawable(R.drawable.marca)
                arrayJogadasX[8] = 9
            } else if (contadorJogadas % 2 != 0) {
                posicao9.background = getDrawable(R.drawable.circulo)
                arrayJogadasO[8] = 9
            }
            posicao9.setEnabled(false)
            contadorJogadas++

            resultadoX(arrayJogadasX)
            resultadoO(arrayJogadasO)

        }


    }

    private fun desativarBotoes() {
        posicao1.setEnabled(false)
        posicao2.setEnabled(false)
        posicao3.setEnabled(false)
        posicao4.setEnabled(false)
        posicao5.setEnabled(false)
        posicao6.setEnabled(false)
        posicao7.setEnabled(false)
        posicao8.setEnabled(false)
        posicao9.setEnabled(false)
    }

    private fun resultadoX(arrayJogadasX: IntArray) {
        if (arrayJogadasX[0] == 1 && arrayJogadasX[1] == 2 && arrayJogadasX[2] == 3) {
            desativarBotoes()
            return Toast.makeText(this, "X ganhou!", Toast.LENGTH_LONG).show()
        } else if (arrayJogadasX[3] == 4 && arrayJogadasX[4] == 5 && arrayJogadasX[5] == 6) {
            desativarBotoes()
            return Toast.makeText(this, "X ganhou!", Toast.LENGTH_LONG).show()
        } else if (arrayJogadasX[6] == 7 && arrayJogadasX[7] == 8 && arrayJogadasX[8] == 9) {
            desativarBotoes()
            return Toast.makeText(this, "X ganhou!", Toast.LENGTH_LONG).show()
        } else if (arrayJogadasX[2] == 3 && arrayJogadasX[5] == 6 && arrayJogadasX[8] == 9) {
            desativarBotoes()
            return Toast.makeText(this, "X ganhou!", Toast.LENGTH_LONG).show()
        } else if (arrayJogadasX[1] == 2 && arrayJogadasX[4] == 5 && arrayJogadasX[7] == 8) {
            desativarBotoes()
            return Toast.makeText(this, "X ganhou!", Toast.LENGTH_LONG).show()
        } else if (arrayJogadasX[6] == 7 && arrayJogadasX[4] == 5 && arrayJogadasX[2] == 3) {
            desativarBotoes()
            return Toast.makeText(this, "X ganhou!", Toast.LENGTH_LONG).show()
        } else if (arrayJogadasX[0] == 1 && arrayJogadasX[4] == 5 && arrayJogadasX[8] == 9) {
            desativarBotoes()
            return Toast.makeText(this, "X ganhou!", Toast.LENGTH_LONG).show()
        }
    }

    private fun resultadoO(arrayJogadasO: IntArray) {
        if (arrayJogadasO[0] == 1 && arrayJogadasO[1] == 2 && arrayJogadasO[2] == 3) {
            desativarBotoes()
            return Toast.makeText(this, "bolinha ganhou!", Toast.LENGTH_LONG).show()
        } else if (arrayJogadasO[3] == 4 && arrayJogadasO[4] == 5 && arrayJogadasO[5] == 6) {
            desativarBotoes()
            return Toast.makeText(this, "bolinha ganhou!", Toast.LENGTH_LONG).show()
        } else if (arrayJogadasO[6] == 7 && arrayJogadasO[7] == 8 && arrayJogadasO[8] == 9) {
            desativarBotoes()
            return Toast.makeText(this, "bolinha ganhou!", Toast.LENGTH_LONG).show()
        } else if (arrayJogadasO[2] == 3 && arrayJogadasO[5] == 6 && arrayJogadasO[8] == 9) {
            desativarBotoes()
            return Toast.makeText(this, "bolinha ganhou!", Toast.LENGTH_LONG).show()
        } else if (arrayJogadasO[1] == 2 && arrayJogadasO[4] == 5 && arrayJogadasO[7] == 8) {
            desativarBotoes()
            return Toast.makeText(this, "bolinha ganhou!", Toast.LENGTH_LONG).show()
        } else if (arrayJogadasO[6] == 7 && arrayJogadasO[4] == 5 && arrayJogadasO[2] == 3) {
            desativarBotoes()
            return Toast.makeText(this, "bolinha ganhou!", Toast.LENGTH_LONG).show()
        } else if (arrayJogadasO[0] == 1 && arrayJogadasO[4] == 5 && arrayJogadasO[8] == 9) {
            desativarBotoes()
            return Toast.makeText(this, "bolinha ganhou!", Toast.LENGTH_LONG).show()
        }
    }


}
