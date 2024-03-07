package com.example.nemo_autofis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.nemo_autofis.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        val signUpButton = findViewById<Button>(R.id.signup_button)
        val loginbtn = findViewById<TextView>(R.id.login_btn1)
        signUpButton.setOnClickListener {
            startActivity(Intent(this,HomeSctivity::class.java))
            finish()
        }
        loginbtn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }

}