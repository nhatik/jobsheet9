package com.example.jobsheet9

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMahasiswa: Button = findViewById(R.id.btnMahasiswa)
        val btnKampus: Button = findViewById(R.id.btnKampus)

        btnMahasiswa.setOnClickListener{
            val intent = Intent(this, MahasiswaActivity::class.java)
            startActivity(intent)
        }
        btnKampus.setOnClickListener {
            val intent = Intent(this, KampusActivity::class.java)
            startActivity(intent)
        }
    }
}
