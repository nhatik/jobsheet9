package com.example.jobsheet9

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KampusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kampus)

        val s1informatika: TextView = findViewById(R.id.s1informatika)
        val s1informasi: TextView = findViewById(R.id.s1informasi)
        val d3informatika: TextView = findViewById(R.id.d3informatika)
        val d3akuntan: TextView = findViewById(R.id.d3akuntan)

        s1informatika.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Hallo saya ingin join ke S1 Teknik Informatika")
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to :"))
        }

        s1informasi.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Hallo saya ingin join ke S1 Sistem Informasi")
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to :"))
        }

        d3informatika.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Hallo saya ingin join ke D3 Teknik Informatika")
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to :"))
        }

        d3akuntan.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Hallo saya ingin join ke D3 Komputerisasi Akuntansi")
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to :"))
        }
    }

}