/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_202557201008;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Percobaan2VolumeKerucut {
    public static void main(String[] args) {
        System.out.println("Percobaan Ke-2 Volume Kerucut");
        String input= JOptionPane.showInputDialog("Masukkan Diameter"); // untuk tampilkan pop up input diameter
        double diameter = Double.parseDouble(input);
        String input1= JOptionPane.showInputDialog("Masukkan Tinggi"); // untuk tampilkan pop up input tinggi
        double tinggi = Double.parseDouble(input1);
        Percobaan2VolumeKerucut ad = new Percobaan2VolumeKerucut();
        double luas = ad.VolumeKerucut(diameter,tinggi);
        JOptionPane.showMessageDialog(null,"Volume Kerucut : "+luas,"Hasil Hitung",3); // untuk tampilkan pop up hasil dari volume tabung
        System.out.println("VOLUME TABUNG : "+ad.VolumeKerucut(14,5)); // 
    }
    public double VolumeKerucut(double diameter,double tinggi){ // MENGGUNAKAN PUBLIC METHOD
            double jari2 = (diameter/2.0);
            double luas= 1.0/3.0*Math.PI* Math.pow(jari2,2)*tinggi;//math pi untuk phi. math pow untuk pangkat
            return luas;
    }
}
