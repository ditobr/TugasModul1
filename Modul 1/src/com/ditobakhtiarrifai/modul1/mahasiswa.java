package com.ditobakhtiarrifai.modul1;

//kelas yg di panggil
public class mahasiswa {
    String nama;
    int nim;

    //constructor
    public mahasiswa() {}

    public mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }
    //getter and setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }
}
