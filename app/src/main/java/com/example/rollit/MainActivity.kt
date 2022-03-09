package com.example.rollit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(localClassName, "onCreate")
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
        super.onStart()
        Log.i(localClassName, "onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.i(localClassName, "onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.i(localClassName, "onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.i(localClassName, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(localClassName, "onDestroy")
    }
}