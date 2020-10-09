package com.ditobakhtiarrifai.tugasmodul1;

    import java.io.IOException;
    import java.util.Scanner;

    public class Pendaftaran {
        public static String bacaString(){
            int karakter;
            String string = "";
            boolean done = false;
            while(!done){
                try {
                    karakter = System.in.read();
                    if(karakter<0 ||(char)karakter == '\n')
                        done = true;
                    else
                    if(karakter != '\r')
                        string = string+(char)karakter; //mengeksekusi hasil char
                }catch(IOException ioe){ //eksekusi jika ada kesalahan
                    System.err.println("Ada Kesalahan Input Data!"); //menampilkan output kesalahan
                    done = true;
                }
            } return string; //keluar dari fungsi string
        }
    }
    class registrasi{ //nama constructor = nama class
        String nama, asal, prodi;
        int umur;

        registrasi(String a,int b, String c, String d){ //constructor dengan parameter
            nama  = a;
            umur  = b;
            asal  = c;
            prodi = d;
        }
        void pritntData(){
            System.out.println("=====KONFIRMASI REGISTRASI=====");
            System.out.println();
            System.out.println("Nama           :" + nama);
            System.out.println("Umur           : " + umur);
            System.out.println("Asal Sekolah   : " + asal);
            System.out.println("Pilihan Prodi  : " + prodi);
            System.out.println( nama + ", kamu berhasil melakukan registrasi. Tunggu pengumuman selanjutnya !");
        }
        public static void main(String[] args) {

            char lagi='y';
            String inputnama,inputasal,inputprodi;  //variable nama dengan type data string
            int inputumur;




            while (lagi=='y'){
                Scanner a = new Scanner(System.in);
                try{
                    System.out.println("\t\t\t\t\t\tPENDAFTARAN  MAHASISWA BARU");
                    System.out.println();
                    System.out.println("\t=====Selamat Datang di Institut Teknologi Telkom Purwokerto=====");
                    System.out.println("\t Silahkan Isi Formulir Pendaftaran di Bawah ini untuk Mendaftar");
                    System.out.println();
                    System.out.print("Nama         : ");
                    inputnama = a.nextLine();
                    System.out.print("Asal Sekolah : ");
                    inputasal = a.nextLine();
                    System.out.print("Umur         : ");
                    inputumur = a.nextInt();
                    System.out.print("Pilihan Prodi: ");
                    inputprodi = a.next();

                    registrasi demoConstructor = new registrasi (inputnama, inputumur,inputasal,inputprodi);
                    //isialisasi dan memanggil nama konstruktor dan membaca parameter
                    demoConstructor.pritntData();
                }catch(NumberFormatException nfe){
                    System.err.println("\nAda Kesalahan Input Data");
                }
                System.out.println("\n Apakah Anda Ingin Melakukan Pendaftaran Lagi ?(y/t)");
                String str = Pendaftaran.bacaString();
                lagi = str.charAt(0);
                if (lagi == 'Y') lagi = 'Y';
                if (lagi == 'y') continue;
                else{
                    System.out.println("Terima Kasih");
                    break;
                }
            }
        }
    }


