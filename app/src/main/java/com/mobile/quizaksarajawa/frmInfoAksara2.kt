package com.mobile.quizaksarajawa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class frmInfoAksara2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_info_aksara2)

        var btnBalen: ImageButton = findViewById(R.id.btnBalen4)
        btnBalen.setOnClickListener(){
            var intBalen1 = Intent(this,frmInfoAksara::class.java)
            startActivity(intBalen1)
            finish()
        }

        var btnRampung: ImageButton = findViewById(R.id.btnRampung)
        btnRampung.setOnClickListener(){
            var intHome = Intent(this,MainActivity::class.java)
            startActivity(intHome)
            finish()
        }
    }
}