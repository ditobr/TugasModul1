package com.ditobakhtiarrifai.modul1.Pass;

public class Passed {
    public static void main(String[] args) {

        int nomer1, nomer2;
        TestPass pass = new TestPass(50, 100); //deklarasi objek
        nomer1 = 10;
        nomer2 = 20;

        //passed by value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("Nomer 1 = " + nomer1);
        System.out.println("Nomer 2 = " + nomer2);

        pass.calculate(nomer1, nomer2);
        System.out.println("Nilai sesudah passed by value\t:");
        System.out.println("Nomer 1 = " + nomer1);
        System.out.println("Nomer 2 = " + nomer2);

        System.out.println();

        //passed by reference
        System.out.println("Nilai sebelum passed by reference");
        System.out.println("Nomer 1 = " + pass.nomer1);
        System.out.println("Nomer 2 = " + pass.nomer2);

        pass.calculate(pass);
        System.out.println("Nilai sesudah passed by reference");
        System.out.println("Nomer 1 = " + pass.nomer1);
        System.out.println("Nomer 2 = " + pass.nomer2);
    }

}
