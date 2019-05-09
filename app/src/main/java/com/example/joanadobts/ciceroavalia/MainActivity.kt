package com.example.joanadobts.ciceroavalia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.logintest.DebugActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtAge = findViewById<EditText>(R.id.editText12)
        var btnLogin = findViewById<Button>(R.id.button)

        btnLogin.setOnClickListener {
            if (txtAge.text.toString().toInt() > 18) {
                Toast.makeText(this, "Você tem mais de 18 anos!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Você tem menos de 18 anos!", Toast.LENGTH_LONG).show()
            }

        }
    }
    }



