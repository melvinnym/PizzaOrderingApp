package com.example.melspizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    private lateinit var radioGroup: RadioGroup;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioGroup = findViewById(R.id.radioGroup)
        val orderButton = findViewById<Button>(R.id.order)
        orderButton.setOnClickListener {
            onPlaceOrderButtonClicked(radioGroup)
        }
    }

    fun onPlaceOrderButtonClicked(view: View) {
        var pizzaSizePrice = 0.0
        var toppingsTotal = 0.0
        when {
            radioGroup.smallpizza.isChecked -> pizzaSizePrice = 5.0
            radioGroup.mediumpizza.isChecked -> pizzaSizePrice = 7.0
            radioGroup.largepizza.isChecked -> pizzaSizePrice = 9.0
        }

    if (onions.isChecked) { toppingsTotal += 1 }
    if (olives.isChecked) { toppingsTotal += 2 }
    if (tomatoes.isChecked) { toppingsTotal += 3 }
    textView4.text = "Total Order Price=$"+(pizzaSizePrice+toppingsTotal)
        }
    }
     //       findViewById<CheckBox>(R.id.onions).isChecked -> toppingsTotal += 1.0
     //      findViewById<CheckBox>(R.id.olives).isChecked -> toppingsTotal += 2.0
     //       findViewById<CheckBox>(R.id.tomatoes).isChecked -> toppingsTotal += 3.0
     //   }
     //   findViewById<TextView>(R.id.textView4).text = "Total Order Price= $${pizzaSizePrice + toppingsTotal}"

    //}
//}