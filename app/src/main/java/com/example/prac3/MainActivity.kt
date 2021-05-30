package com.example.prac3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext,"on create", Toast.LENGTH_SHORT).show()
        Log.i(tag,"On Create")

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"on start", Toast.LENGTH_SHORT).show()
        Log.i(tag,"On Start")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"on resume", Toast.LENGTH_SHORT).show()
        Log.i(tag,"On resume")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"on Restart", Toast.LENGTH_SHORT).show()
        Log.i(tag,"On restart")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"on pause", Toast.LENGTH_SHORT).show()
        Log.i(tag,"On pause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"on stop", Toast.LENGTH_SHORT).show()
        Log.i(tag,"On stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"on destroy", Toast.LENGTH_SHORT).show()
        Log.i(tag,"On Destroy")
    }
}
