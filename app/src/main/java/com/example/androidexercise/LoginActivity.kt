package com.example.androidexercise

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidexercise.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)
        val loginActivity: ActivityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginActivity.root)

        loginActivity.imageButton2.setOnClickListener(){
            //ACTION

        }
    }
}





