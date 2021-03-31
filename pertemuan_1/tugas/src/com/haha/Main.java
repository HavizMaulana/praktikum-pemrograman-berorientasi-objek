package com.haha;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	    int x = 0;
        Scanner userInput = new Scanner(System.in);
        while ( x == 0){
            String namaMahasiswa, nimMahasiswa;
            int nilaiUts, nilaiUAS, usiaMahasiswa;
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
            int y = 0;
            while ( y == 0) {
                System.out.println("1. tampilkan data");
                System.out.println("2. edit data");
                System.out.println("3. exit");
                int pilih;
                pilih = userInput.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println(" Perkenalkan nama saya " + namaMahasiswa);
                        System.out.println(" nim " + nimMahasiswa);
                        System.out.println(" usia:  " + usiaMahasiswa);
                        System.out.println(" nilai akhir:" + (nilaiUAS + nilaiUts) / 2);
                        break;
                    case 2:
                        y =1;
                        break;

                    case 3:
                        x++;
                        break;


                }
            }
        }
    }
}
