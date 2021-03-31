package com.haha;

import java.util.Scanner;

public class mahasiwa {
    public static void main(String[] args) {


        String namaMahasiswa, nimMahasiswa;
        int nilaiUts, nilaiUAS, usiaMahasiswa;
        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan nama: ");
        namaMahasiswa = userInput.next();
        System.out.print(" masukkan nim: ");
        nimMahasiswa = userInput.next();
        System.out.print(" masukkan usia: ");
        usiaMahasiswa = userInput.nextInt();
        System.out.print(" masukkan nilai UTS: ");
        nilaiUts = userInput.nextInt();
        System.out.print(" Masukkan nilai UAS: ");
        nilaiUAS = userInput.nextInt();
    }

}
