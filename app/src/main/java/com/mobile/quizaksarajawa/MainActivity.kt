package com.mobile.quizaksarajawa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnGas: ImageButton = findViewById(R.id.btnGas)
        btnGas.setOnClickListener(){
            var intSoal = Intent(this, frmSoal::class.java)
            startActivity(intSoal)
            finish()
        }

        var btnInfo: ImageButton = findViewById(R.id.btnInfo)
        btnInfo.setOnClickListener(){
            var intInpo = Intent(this,frmInfoAksara::class.java)
            startActivity(intInpo)
            finish()
        }

        var btnExit: ImageButton = findViewById(R.id.btnExit)
        btnExit.setOnClickListener(){
            finish()
            exitProcess(0)
        }

    }
}