package com.marek.guran.scanner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import com.marek.guran.scanner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val historyButton = findViewById<RelativeLayout>(R.id.history_button)
        historyButton.setOnClickListener {
            val Intent = Intent (this, HistoryFragment::class.java)
            startActivity(Intent)
        }

    }

}