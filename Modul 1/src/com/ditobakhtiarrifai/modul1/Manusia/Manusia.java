package com.ditobakhtiarrifai.modul1.Manusia;

public class Manusia {
    private String nama;
    private int umur;

    //Constructor first
    public Manusia(){}

    //Constructor second
    public Manusia(String nama) {
        this.nama = nama;
    }
    //Comstructor third
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    //getter and setter

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
