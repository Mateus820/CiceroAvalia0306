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

        var buttonLogin = findViewById<Button>(R.id.button)
        var tLogin = findViewById<EditText>(R.id.tLog)
        var tPassword = findViewById<EditText>(R.id.tPass)

        buttonLogin.setOnClickListener {

            var login = tLogin?.text.toString()
            var senha = tPassword?.text.toString()

            if (login.toLowerCase() == "Denilson" && senha == "nave19") {

                val intent = Intent(this, BemVindo::class.java)
                val params = Bundle()
                params.putString("usuario", login)
                intent.putExtras(params)
                startActivity(intent)
            } else {

                Toast.makeText(this, "login e/ou senha incorretos")
            }

        }
    }
    }



