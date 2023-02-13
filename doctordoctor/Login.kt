package com.example.doctordoctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.doctordoctor.R
import com.example.doctordoctor.userdetails


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val useroradmin = intent.getStringExtra("Decision")
        //check if login by admin was clicked or login by usern 3wz

        val loginbutton = findViewById<ImageView>(R.id.secureloginbutton)
        val emailobject=findViewById<EditText>(R.id.emaillogin)
        val passwordobject=findViewById<EditText>(R.id.passwordlogin)
        val emaillogin= emailobject.text.toString()
        val passwordlogin=passwordobject.text.toString()
        if (useroradmin.equals("UserLogin")) {
            loginbutton.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View) {
                    var email:String=emailobject.text.toString()
                    var password:String=passwordobject.text.toString()
                    if(email.isEmpty()||password.isEmpty()||!emaillogin.equals(userdetails.emailauth)||!passwordlogin.equals(
                           userdetails.passwordauth))
                    {
                        Toast.makeText(applicationContext,"Please Enter Email And Password",Toast.LENGTH_SHORT).show()
                    }
                    else
                    {

                    //put logic for user authentication if user is authentic then move to homescreen
                    startActivity(Intent(this@Login, HomeScreen::class.java))}


            }
        })}

        else {
            loginbutton.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View) {
                    //put logic for admin authentication if admin is authentic then move to admin homescreen
                    startActivity(Intent(this@Login, AdminHomescreen::class.java))
                }
            })
        }
    }



    }

