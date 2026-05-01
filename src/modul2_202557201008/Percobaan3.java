/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_202557201008;

import javax.swing.JOptionPane;

/**
 *
 * @author Diana Ayu Nur Azizah
 */
public class Percobaan3 {
    public static void main(String[] args) {
    String satu=JOptionPane.showInputDialog("Masukkan Panjang : ");
    double panjang=Double.parseDouble(satu);
    String dua=JOptionPane.showInputDialog("Masukkan Lebar : ");
    double lebar=Double.parseDouble(dua);
    String tiga=JOptionPane.showInputDialog("Masukkan Alas : ");
    double alas=Double.parseDouble(tiga);
    String empat=JOptionPane.showInputDialog("Masukkan Tinggi : ");
    double tinggi=Double.parseDouble(empat);
    String lima=JOptionPane.showInputDialog("Masukkan Diameter : ");
    double diameter=Double.parseDouble(lima);
    Percobaan3 nn= new Percobaan3();
    double luasPP = nn.luasPersegiPanjang(panjang,lebar);//parameter
    double luasS = nn.luasSegitiga(alas,tinggi);//parameter
    double luasL = nn.luasLingkaran(diameter);//parameter
    JOptionPane.showMessageDialog(null,"Luas Persegi Panjang : "+luasPP,"Perhitungan",3);
    JOptionPane.showMessageDialog(null,"Luas Segitiga : "+luasS,"Perhitungan",3);
    JOptionPane.showMessageDialog(null,"Luas Lingkaran : "+luasL,"Perhitungan",3);
    }
    double luasPersegiPanjang(double panjang,double lebar){
        double luasPP=panjang*lebar;
        return luasPP;
    }
    double luasSegitiga(double alas,double tinggi){
        double luasS=1.0/2.0*alas*tinggi;
        return luasS;
    }
    double luasLingkaran(double diameter){
        double jari_jari=(diameter/2.0);
        double luasL=Math.PI*Math.pow(jari_jari, 2);
        return luasL;
    }
    
}
