package com.example.nemo_autofis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nemo_autofis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            loginBtn.setOnClickListener {
                startActivity(Intent(this@MainActivity,HomeSctivity::class.java))
            }
            signupBtn.setOnClickListener {
                startActivity(Intent(this@MainActivity,SignUpActivity::class.java))
            }
        }
    }
}