package com.mobile.quizaksarajawa

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class frmSoal : AppCompatActivity() {

    var rgJawaban: RadioGroup? = null
    var soal: ImageView? = null
    var btnLanjutSoal: ImageButton? = null
    var radioA: RadioButton? = null
    var radioB: RadioButton? = null
    var radioC: RadioButton? = null
    var radioD: RadioButton? = null
    var skor = 0
    var jawaban: String = ""
    var x: Int = 0
    val soalPG: Pertanyaan = Pertanyaan()
    val soalAcak = soalPG.shuffle()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_soal)


        soal = findViewById(R.id.imgSoal)
        radioA = findViewById(R.id.radioA) as RadioButton?
        radioB = findViewById(R.id.radioB) as RadioButton?
        radioC = findViewById(R.id.radioC) as RadioButton?
        radioD = findViewById(R.id.radioD) as RadioButton?
        btnLanjutSoal = findViewById(R.id.btnLanjutSoal) as ImageButton?
        rgJawaban = findViewById(R.id.rgJawaban)

        setKonten()

        btnLanjutSoal?.setOnClickListener(){
            cekJawaban()
        }
    }


    fun setKonten(){
        rgJawaban?.clearCheck()

        var arr = soalPG.pertanyaan.size
        var totalSkor = arr * 10
        println("Skor"+totalSkor)
        if(x >= arr){
            var jumlahSkor = skor.toString()

            var intResult = Intent(this,frmResult::class.java)
            intResult.putExtra("jumlahSkor",jumlahSkor)
            intResult.putExtra("totalSkor",totalSkor.toString())
            startActivity(intResult)
            finish()
        }else{
                var imgSoal = soalAcak[x][0]
                val id = resources.getIdentifier("com.mobile.quizaksarajawa:drawable/$imgSoal", null, getPackageName())
                soal?.setImageResource(id)
                radioA?.setText(soalAcak[x][1])
                radioB?.setText(soalAcak[x][2])
                radioC?.setText(soalAcak[x][3])
                radioD?.setText(soalAcak[x][4])
                jawaban = soalAcak[x][5].toString()
        }
        x++
    }

    fun cekJawaban(){
        if(radioA?.isChecked() == true){
            if(radioA?.getText().toString().equals(jawaban)) {
                Toast.makeText(this, "Jawabanmu bener", Toast.LENGTH_SHORT).show()
                skor+=10
                setKonten()
            } else {
                Toast.makeText(this, "Jawabanmu kliru", Toast.LENGTH_SHORT).show()
                setKonten()
            }
        } else if(radioB?.isChecked() == true){
            if(radioB?.getText().toString().equals(jawaban)) {
                Toast.makeText(this, "Jawabanmu bener", Toast.LENGTH_SHORT).show()
                skor+=10
                setKonten()
            } else {
                Toast.makeText(this, "Jawabanmu kliru", Toast.LENGTH_SHORT).show()
                setKonten()
            }
        } else if(radioC?.isChecked() == true){
            if(radioC?.getText().toString().equals(jawaban)) {
                Toast.makeText(this, "Jawabanmu bener", Toast.LENGTH_SHORT).show()
                skor+=10
                setKonten()
            } else {
                Toast.makeText(this, "Jawabanmu kliru", Toast.LENGTH_SHORT).show()
                setKonten()
            }
        } else if(radioD?.isChecked() == true){
            if(radioD?.getText().toString().equals(jawaban)) {
                Toast.makeText(this, "Jawabanmu bener", Toast.LENGTH_SHORT).show()
                skor+=10
                setKonten()
            } else {
                Toast.makeText(this, "Jawabanmu kliru", Toast.LENGTH_SHORT).show()
                setKonten()
            }
        } else {
            Toast.makeText(this,"Jawabane dipilih sik ya!",Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        Toast.makeText(this, "Teruske sampek akhir nggih!", Toast.LENGTH_SHORT).show()
    }
}