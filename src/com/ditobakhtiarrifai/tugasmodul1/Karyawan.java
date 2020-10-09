package com.ditobakhtiarrifai.tugasmodul1;

public class Karyawan {

        private static String Nama = "Lucifer";
        private static int setUmur(){
            int Umur = 33;
            return Umur;
        }
        private static String Alamat = "Lux";
        private static int setGaji() {
            int gaji = 999999999;
            return gaji;
        }
        private static double setTinggi(){
            double Tinggi = 200;
            return Tinggi;
        }
        private static String Warga = "Warga Asing";

        private static String Personal = "IMMORTALITY";
        public static void main (String[] args){
            System.out.println("\t\tData Karyawan");
            System.out.println("Nama            : " + Nama);
            System.out.println("Umur            : " + setUmur());
            System.out.println("Alamat          : " + Alamat);
            System.out.println("Gaji per Bulan  : " + setGaji());
            System.out.println("Tinggi Badan    : " + setTinggi());
            System.out.println("Kewarganegaraan : " + Warga);
            System.out.println("Keahlian        : " + Personal);
        }


}
