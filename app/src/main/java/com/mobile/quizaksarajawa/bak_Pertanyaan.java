package com.mobile.quizaksarajawa;

public class bak_Pertanyaan {

    public String pertanyaan[] = {
            "gambar1_atiku",
            "gambar2_ngelih",
            "gambar3_wetengku",
    };

    private String pilihanJawaban[][] = {
            {"atiku","nalika","padamu","kediri"},
            {"ngelih","letih","batih","patih"},
            {"bangku","kotaku","wetengku","tungku"}
    };

    private String jawabanBenar[] = {
            "atiku",
            "ngelih",
            "wetengku",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }

}
