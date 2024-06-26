package com.example.mycoinsv1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tabungan : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tabungan)
        supportActionBar?.hide()

        btn_back3()

        Terkumpul = findViewById(R.id.terkumpul)
        Nominal = findViewById(R.id.nominal)
        btnTabung = findViewById<ImageButton>(R.id.btnTambahkanTabungan)

        btnTabung.setOnClickListener {
            val nominalStr = Nominal.text.toString()
            if (nominalStr.isNotEmpty()) {
                val nominal = nominalStr.toInt()
                var totalTerkumpul = nominal
                Terkumpul.setText(totalTerkumpul.toString())
                Nominal.text.clear()
            }
        }
    }

    private fun btn_back3() {
        val btnBack3 = findViewById<ImageButton>(R.id.btn_back3)
        btnBack3.setOnClickListener {
            val intent = Intent(this, TambahTabungan::class.java)
            startActivity(intent)
        }
    }
}
}


