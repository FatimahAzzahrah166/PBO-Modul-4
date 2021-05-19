package Modul4;

public class Cetak {
    public static void main (String [] args ){
        
        Bilangan opbil = new Bilangan();
        opbil.setA(10.5);
        opbil.setB(0.5);
        opbil.setC();
        
        System.out.println("APLIKASI ARITMATIKA");
        System.out.println("Bilangan A: " + opbil.getA());
        System.out.println("Bilangan B: " + opbil.getB());
        
        opbil.tampil();
        
        Penjumlahan jumlah = new Penjumlahan();
        jumlah.setA(10.5);
        jumlah.setB(0.5);
        jumlah.setC();
        
        System.out.println("");
        System.out.println("PENJUMLAHAN");
        System.out.println("Bilangan A: " + opbil.getA());
        System.out.println("Bilangan B: " + opbil.getB());
        System.out.println("Bilangan A+B: " + jumlah.getC());
        
        jumlah.tampil();
        
        Pengurangan kurang = new Pengurangan();
        kurang.setA(10.5);
        kurang.setB(0.5);
        kurang.setC();
        
        System.out.println("");
        System.out.println("PENGURANGAN");
        System.out.println("Bilangan A: " + opbil.getA());
        System.out.println("Bilangan B: " + opbil.getB());
        System.out.println("Bilangan A-B: " + kurang.getC());
        
        kurang.tampil();
        
        Perkalian kali = new Perkalian();
        kali.setA(10.5);
        kali.setB(0.5);
        kali.setC();
        
        System.out.println("");
        System.out.println("PERKALIAN");
        System.out.println("Bilangan A: " + opbil.getA());
        System.out.println("Bilangan B: " + opbil.getB());
        System.out.println("Bilangan A*B: " + kali.getC());
        
        kali.tampil();
        
        Pembagian bagi = new Pembagian();
        bagi.setA(10.5);
        bagi.setB(0.5);
        bagi.setC();
        
        System.out.println("");
        System.out.println("PEMBAGIAN");
        System.out.println("Bilangan A: " + opbil.getA());
        System.out.println("Bilangan B: " + opbil.getB());
        System.out.println("Bilangan A-B: " + bagi.getC());
        
        bagi.tampil();
    }   
}
