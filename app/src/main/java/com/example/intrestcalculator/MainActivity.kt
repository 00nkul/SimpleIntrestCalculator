package com.example.intrestcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val amount:TextInputEditText = findViewById(R.id.textInputEditText)
        val time:TextInputEditText = findViewById(R.id.textInputEditText1)
        val rate:TextInputEditText = findViewById(R.id.textInputEditText2)
        val calculateBtn:Button = findViewById(R.id.button)
        val tvInt:TextView = findViewById(R.id.tvInt)
        val tvAmt:TextView = findViewById(R.id.tvAmt)

        calculateBtn.setOnClickListener{
            val f_amount:Double = amount.text.toString().toDouble()
            val f_time:Double = time.text.toString().toDouble()
            val f_rate:Double = rate.text.toString().toDouble()

            val finalIntrest:Double = (f_amount * f_rate * f_time) /100
            val finalAmount:Double = finalIntrest+f_amount

            tvInt.setText("Total Interest is $finalIntrest")
            tvAmt.setText("Total Amount is $finalAmount ")

        }

    }
}