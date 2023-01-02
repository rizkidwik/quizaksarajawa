package com.mobile.quizaksarajawa

import kotlin.random.Random

class Pertanyaan {
    var pertanyaan =arrayOf(
        //soal,pilA,pilB,pilC,pilD,jawabBenar
        arrayOf("gambar1_atiku","atiku", "nalika", "padamu", "kediri","atiku"),
        arrayOf("gambar2_ngelih","ngelih", "letih", "batih", "patih","ngelih"),
        arrayOf("gambar3_wetengku","bangku", "kotaku", "wetengku", "tungku","wetengku"),
        arrayOf("gambar4_ibu","aku", "ibu", "sapu", "buku","ibu"),
        arrayOf("gambar5_goreng","gobes", "gareng", "maneh", "goreng","goreng"),
    )


    //fisher yates shuffle
    fun shuffle(): Array<Array<String>> {
        var last_index =  pertanyaan.size - 1
        while(last_index > 0){
            var rand_index = Random.nextInt(last_index)
            var temp = pertanyaan[last_index]
            pertanyaan[last_index] = pertanyaan[rand_index]
            pertanyaan[rand_index] = temp
            last_index -=1
        }
        return pertanyaan
    }
}