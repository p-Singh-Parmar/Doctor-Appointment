package com.example.doctordoctor

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.doctordoctor.userdetails
import java.util.regex.Pattern

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)
val createaccount=findViewById<ImageView>(R.id.createfreeaccount)
        val nameobject=findViewById<EditText>(R.id.name)
        val emailobject=findViewById<EditText>(R.id.emailsignup)
        val phonenumberobject=findViewById<EditText>(R.id.phonenumber)
        val passwordobject=findViewById<EditText>(R.id.passwordsignup)

        var name=nameobject.text.toString()
        var email=emailobject.text.toString()
        var phonenumber=phonenumberobject.text.toString()
        var password=passwordobject.text.toString()
        var length:Int=password.length






        createaccount.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {

                    userdetails.emailauth = email
                    userdetails.passwordauth = password

                    val intent = Intent(this@Signup, Login::class.java)
                    intent.putExtra("Decision", "UserLogin")
                    startActivity(intent)

                }
            })
        }




    }
