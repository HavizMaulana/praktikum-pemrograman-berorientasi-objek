package com.haha;

public class BidangWebDevelopment extends Main{
    public  double nilaiAkhir,nilaiTesTulis, nilaiTesCoding, nilaiTesWawancara;

    public BidangWebDevelopment(double nilaiTesTulis, double nilaiTesCoding, double nilaiTesWawancara){this.nilaiTesTulis = nilaiTesTulis; this.nilaiTesCoding = nilaiTesCoding; this.nilaiTesWawancara = nilaiTesWawancara;}
    public double  hitungNilaiAkhir(){return this.nilaiAkhir = (((this.nilaiTesTulis*2.0/5.0))+((this.nilaiTesCoding*7.0/20.0))+((this.nilaiTesWawancara*1.0/4.0)));}

}
