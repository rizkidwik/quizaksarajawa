package com.mobile.quizaksarajawa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class frmInfoAksara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_info_aksara)

        var btnBalen: ImageButton = findViewById(R.id.btnBalen)
        var btnLanjut: ImageButton = findViewById(R.id.btnLanjut)
        btnBalen.setOnClickListener(){
            var intHome = Intent(this,MainActivity::class.java)
            startActivity(intHome)
            finish()
        }

        btnLanjut.setOnClickListener(){
            var intInfo2 = Intent(this,frmInfoAksara2::class.java)
            startActivity(intInfo2)
            finish()
        }


    }
}