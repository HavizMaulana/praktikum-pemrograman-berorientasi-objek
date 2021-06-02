package com.haha;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihMenu;


        System.out.println("\n Divisi yang ingin diikuti");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        pilihMenu = input.nextInt();


        switch (pilihMenu){
            case 1:
                bidangAndroidDevelopment();
                break;
            case 2:
                bidangWebDevelopment();
                break;
            default:
                System.out.println("Input salah");
                break;
        }

    }
    static void bidangAndroidDevelopment(){

        BidangAndroidDevelopment outputBidangAndroidDevelopment;
        double nilaiTesTulis, nilaiTesCoding, nilaiTesWawancara;
        Scanner inputNilaiTulis, inputNilaiCoding, inputNilaiWawancara;
        int pilihan;
        char menu = 'y';
        Scanner inputNik, inputNama;
        inputNik = new Scanner(System.in);
        inputNama = new Scanner(System.in);
        System.out.print(" NIK : ");
        String nik = inputNik.nextLine();
        System.out.print(" Nama : ");
        String nama = inputNama.nextLine();
        inputNilaiTulis = new Scanner(System.in);
        inputNilaiCoding = new Scanner(System.in);
        inputNilaiWawancara = new Scanner(System.in);

        System.out.print(" Masukkan nilai tulis : ");
        nilaiTesTulis = inputNilaiTulis.nextDouble();
        System.out.print(" Masukkan nilai Coding : ");
        nilaiTesCoding = inputNilaiCoding.nextDouble();
        System.out.print(" Masukkan nilai Wawancara : ");
        nilaiTesWawancara = inputNilaiWawancara.nextDouble();
        outputBidangAndroidDevelopment = new BidangAndroidDevelopment(nilaiTesTulis, nilaiTesCoding, nilaiTesWawancara);
        do {
            System.out.println(" Menu : ");
            System.out.println(" 1. Edit.");
            System.out.println(" 2. Tampil. ");
            System.out.println(" 3. keluar. ");
            Scanner input = new Scanner(System.in);
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print(" Masukkan nilai tulis : ");
                    nilaiTesTulis = inputNilaiTulis.nextDouble();
                    System.out.print(" Masukkan nilai Coding : ");
                    nilaiTesCoding = inputNilaiCoding.nextDouble();
                    System.out.print(" Masukkan nilai Wawancara : ");
                    nilaiTesWawancara = inputNilaiWawancara.nextDouble();
                    outputBidangAndroidDevelopment = new BidangAndroidDevelopment(nilaiTesTulis, nilaiTesCoding, nilaiTesWawancara);

                    break;
                case 2:
                    System.out.println(" Nama : " + nama);
                    System.out.println(" NIK  : " + nik);
                    System.out.println(" Nilai Akhir = " + outputBidangAndroidDevelopment.hitungNilaiAkhir());
                    System.out.print(" Keterangan = ");
                    if (outputBidangAndroidDevelopment.hitungNilaiAkhir() > 85) {
                        System.out.println(" Selamat Kepada "+ nama+  " Anda Lulus Sebagai Android Developer");
                    } else
                        System.out.println(" Mohon Maaf Kepada " +nama+" Anda Belum Lulus Sebagai Android Developer");
                    break;
                case 3:
                    menu = 'n';
            }
        }
        while (menu == 'y');
    }
    static void bidangWebDevelopment(){

        BidangWebDevelopment outputBidangWebDevelopment;
        double nilaiTesTulis, nilaiTesCoding, nilaiTesWawancara;
        Scanner inputNilaiTulis, inputNilaiCoding, inputNilaiWawancara;
        int pilihan;
        char menu = 'y';
        Scanner inputNik, inputNama;
        inputNik = new Scanner(System.in);
        inputNama = new Scanner(System.in);
        System.out.print(" NIK : ");
        String nik = inputNik.nextLine();
        System.out.print(" Nama : ");
        String nama = inputNama.nextLine();
        inputNilaiTulis = new Scanner(System.in);
        inputNilaiCoding = new Scanner(System.in);
        inputNilaiWawancara = new Scanner(System.in);

        System.out.print(" Masukkan nilai tulis : ");
        nilaiTesTulis = inputNilaiTulis.nextDouble();
        System.out.print(" Masukkan nilai Coding : ");
        nilaiTesCoding = inputNilaiCoding.nextDouble();
        System.out.print(" Masukkan nilai Wawancara : ");
        nilaiTesWawancara = inputNilaiWawancara.nextDouble();
        outputBidangWebDevelopment = new BidangWebDevelopment(nilaiTesTulis, nilaiTesCoding, nilaiTesWawancara);
        do {
            System.out.println(" Menu : ");
            System.out.println(" 1. Edit.");
            System.out.println(" 2. Tampil. ");
            System.out.println(" 3. keluar. ");
            Scanner input = new Scanner(System.in);
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print(" Masukkan nilai tulis : ");
                    nilaiTesTulis = inputNilaiTulis.nextDouble();
                    System.out.print(" Masukkan nilai Coding : ");
                    nilaiTesCoding = inputNilaiCoding.nextDouble();
                    System.out.print(" Masukkan nilai Wawancara : ");
                    nilaiTesWawancara = inputNilaiWawancara.nextDouble();
                    outputBidangWebDevelopment = new BidangWebDevelopment(nilaiTesTulis, nilaiTesCoding, nilaiTesWawancara);

                    break;
                case 2:
                    System.out.println(" Nama : " + nama);
                    System.out.println(" NIK  : " + nik);
                    System.out.println(" Nilai Akhir = " + outputBidangWebDevelopment.hitungNilaiAkhir());
                    System.out.print(" Keterangan = ");
                    if (outputBidangWebDevelopment.hitungNilaiAkhir() > 85) {
                        System.out.println(" Selamat Kepada "+ nama+  " Anda Lulus Sebagai Web Developer");
                    } else
                        System.out.println(" Mohon Maaf Kepada " +nama+" Anda Belum Lulus Sebagai Web Developer");
                    break;
                case 3:
                    menu = 'n';
            }
        }
        while (menu == 'y');
    }
}
