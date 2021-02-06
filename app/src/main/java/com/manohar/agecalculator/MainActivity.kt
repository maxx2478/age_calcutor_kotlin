package com.manohar.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText:EditText = findViewById(R.id.edittext) as EditText
        val result:TextView = findViewById(R.id.result) as TextView

        val currentyear = Calendar.getInstance().get(Calendar.YEAR)

        val button:Button = findViewById(R.id.calcuate) as Button
        button.setOnClickListener(View.OnClickListener {
            if(editText.text.toString().length>4)
            {
                Toast.makeText(applicationContext, "Enter Value of 4 digits only", Toast.LENGTH_SHORT).show()
            }
            else
            {
                val int:Int = editText.text.toString().toInt()
                result.setText("Your age is: "+(currentyear-int))
            }

        })


    }
}