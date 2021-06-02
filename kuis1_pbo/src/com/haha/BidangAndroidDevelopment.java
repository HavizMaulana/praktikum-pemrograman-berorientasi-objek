package com.haha;

public class BidangAndroidDevelopment extends Main{
    public  double nilaiAkhir,nilaiTesTulis, nilaiTesCoding, nilaiTesWawancara;

    public BidangAndroidDevelopment(double nilaiTesTulis, double nilaiTesCoding, double nilaiTesWawancara){this.nilaiTesTulis = nilaiTesTulis; this.nilaiTesCoding = nilaiTesCoding; this.nilaiTesWawancara = nilaiTesWawancara;}
    public double  hitungNilaiAkhir(){return this.nilaiAkhir = (((this.nilaiTesTulis/5.0))+((this.nilaiTesCoding/2.0))+((this.nilaiTesWawancara*3.0/10.0)));}

}
