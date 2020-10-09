package com.ditobakhtiarrifai.modul1;

//class main / demo class
public class objek {
    public static void main(String[] args) {
        //deklarasi objek tanpa parameter
        mahasiswa mahasiswaTanpa = new mahasiswa();

        mahasiswaTanpa.setNama("Bagus");
        mahasiswaTanpa.setNim(18104005);

        System.out.println("Mahasiswa 1 ");
        System.out.println("Nama : " + mahasiswaTanpa.getNama());
        System.out.println("Nim  : " + mahasiswaTanpa.getNim());

        mahasiswa mahasiswa = new mahasiswa("Lucifer",666);

        System.out.println("Mahasiswa 2 ");
        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("Nim  : " + mahasiswa.getNim());
    }
}
