package com.example.mathgame

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.addTextChangedListener
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit var edt_text:EditText
    lateinit var tvdisplay:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
      edt_text = findViewById(R.id.edt_text)
        tvdisplay = findViewById(R.id .tv_display)
randomaniqla()
        edt_text.addTextChangedListener {
            if (edt_text.text.toString().length == togrijavob.toString().length){
                if (edt_text.text.toString().toInt() == togrijavob) {
                    Toast.makeText(this, "togrijavob", Toast.LENGTH_SHORT).show()

                }else{
                    Toast.makeText(this,"Notogrijavob",Toast.LENGTH_SHORT).show()

                }
                randomaniqla()
                edt_text.text.clear()
            }
        }

        }
    var number1 = 0
    var number2 = 0
    var amal  = 0

    fun randomaniqla(){
        number1 = Random().nextInt(20)
        number2 = Random().nextInt(20)
        amal = Random().nextInt(4)
        misolyoz()

    }
    var togrijavob = 0
    fun misolyoz(){
        when(amal){
            0->{
                tvdisplay.text = "$number1 + $number2 = "
                togrijavob = number1 + number2
            }
            1->{
                if (number1 > number2) {


                    tvdisplay.text = "$number1 - $number2 = "
                    togrijavob = number1 - number2

                }else randomaniqla()
            }
            2-> {



                    tvdisplay.text = "$number1 * $number2 = "
                    togrijavob = number1 * number2


            }
            3-> {
            if (number1 >= number2 && number1%number2 == 0) {
                tvdisplay.text = "$number1 / $number2 = "
                togrijavob = number1 / number2
            }else randomaniqla()
            }
        }
    }
    }
