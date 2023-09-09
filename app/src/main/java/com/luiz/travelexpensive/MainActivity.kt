package com.luiz.travelexpensive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luiz.travelexpensive.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    private fun calculate(){

    }
}