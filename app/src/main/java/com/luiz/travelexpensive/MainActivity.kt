package com.luiz.travelexpensive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.luiz.travelexpensive.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalcular.setOnClickListener(this)
    }


    override fun onClick(view: View) {
        if (view.id == R.id.button_calcular) {
            calculate()
        }
    }

    private fun calculate() {
        Toast.makeText(this,"Calculado",Toast.LENGTH_SHORT).show()
    }
}