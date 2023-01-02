package com.mobile.quizaksarajawa

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class frmResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_result)

        var btnGasneh: ImageButton = findViewById(R.id.btnGasneh)
        var btnExit2: ImageButton = findViewById(R.id.btnExit2)
        var jumlahSkor = intent.getStringExtra("jumlahSkor")
        var totalSkor = intent.getStringExtra("totalSkor")

        var tvTotalSkor: TextView = findViewById(R.id.tvTotalSkor)
        tvTotalSkor.setText(jumlahSkor + "/" + totalSkor)

        btnExit2.setOnClickListener(){
            var intHome = Intent(this,MainActivity::class.java)
            startActivity(intHome)
            finish()
        }

        btnGasneh.setOnClickListener(){
            var intSoal = Intent(this,frmSoal::class.java)
            startActivity(intSoal)
            finish()
        }
    }
    override fun onBackPressed() {
        Toast.makeText(this, "Ora iso balik. Pijet tombole!", Toast.LENGTH_SHORT).show()
    }
}