/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_202557201008;

import javax.swing.JOptionPane;

/**
 *
 * @author DIANA AYU NUR AZIZAH
 */
public class Percobaan2Volumetabung {
    public static void main(String[] args) {
        System.out.println("Percobaan Ke-2 Volume Tabung");
        String input= JOptionPane.showInputDialog("Masukkan Diameter"); // untuk tampilkan pop up input diameter
        double diameter = Double.parseDouble(input);
        String input1= JOptionPane.showInputDialog("Masukkan Tinggi"); // untuk tampilkan pop up input tinggi
        double tinggi = Double.parseDouble(input1);
        Percobaan2Volumetabung mv = new Percobaan2Volumetabung();
        double luas = mv.VolumeTabung(diameter,tinggi);
        JOptionPane.showMessageDialog(null,"Volume Tabung : "+luas,"Hasil Hitung",3); // untuk tampilkan pop up hasil dari volume tabung
        System.out.println("VOLUME TABUNG : "+mv.VolumeTabung(14,5)); // 
    }
    public double VolumeTabung(double diameter,double tinggi){ // MENGGUNAKAN PUBLIC METHOD
            double jari2 = (diameter/2.0);
            double luas= Math.PI* Math.pow(jari2,2)*tinggi;//math pi untuk phi. math pow untuk pangkat
            return luas;
    }
}
