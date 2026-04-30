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
public class Percobaan2VolumeBola {
    public static void main(String[] args) {
        System.out.println("Percobaan Ke-2 Volume Bola");
        String input= JOptionPane.showInputDialog("Masukkan Diameter"); // untuk tampilkan pop up input diameter
        double diameter = Double.parseDouble(input);
        Percobaan2VolumeBola vn = new Percobaan2VolumeBola();
        double luas = vn.VolumeBola(diameter);
        JOptionPane.showMessageDialog(null,"Volume Kerucut : "+luas,"Hasil Hitung",3); // untuk tampilkan pop up hasil dari volume bola
        System.out.println("VOLUME BOLA : "+vn.VolumeBola(14)); // 
    }
    public double VolumeBola(double diameter){ // MENGGUNAKAN PUBLIC METHOD
            double jari2 = (diameter/2.0);
            double luas= 4.0/3.0*Math.PI* Math.pow(jari2,3);//math pi untuk phi. math pow untuk pangkat
            return luas;
    }
}
