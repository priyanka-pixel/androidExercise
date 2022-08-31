package com.example.androidexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i( "Lifecycle", "Inside onscreen")
      val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgbutton.setOnClickListener(){
            val intent = Intent(application,LoginActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i( "Lifecycle", "Inside OnStart")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.i( "Lifecycle", "Inside onPostResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i( "Lifecycle", " onPause")
    }
}

