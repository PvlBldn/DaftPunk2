package com.example.daftpunk2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.daftpunk2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var n = 0
        val arr = resources.getStringArray(R.array.Daft_Punk)
      //  val textView: TextView = binding.textView
      //  val button: Button = binding.button
        for (i in arr)
            binding.button.setOnClickListener {
            binding.textView.text = arr[n].toString()
            n++
            if (n >arr.size - 1) n = 0
        }

    }
}