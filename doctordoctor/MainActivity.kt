package com.example.doctordoctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.startpage)
        val signup= findViewById<ImageView>(R.id.signup)
        signup.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {

                startActivity(Intent(this@MainActivity, Signup::class.java))


        } })
        val loginuser=findViewById<ImageView>(R.id.login)
            loginuser.setOnClickListener(object : View.OnClickListener {
        override fun onClick(v: View)
        {
            val intent=Intent(this@MainActivity, Login::class.java)
            intent.putExtra("Decision", "UserLogin")
            startActivity(intent)
        }
}
)
        val loginadmin=findViewById<ImageView>(R.id.loginadmin)
        loginadmin.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View)
            {
                val intent=Intent(this@MainActivity, Login::class.java)
                intent.putExtra("Decision", "AdminLogin")
                startActivity(intent)
            }
        }
        )
    }
}