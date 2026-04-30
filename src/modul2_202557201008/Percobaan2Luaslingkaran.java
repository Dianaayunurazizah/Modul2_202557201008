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
public class Percobaan2Luaslingkaran {
    public static void main(String[] args) {
        System.out.println("Percobaan Ke-2 Luas Lingkaran");
        String input= JOptionPane.showInputDialog("Masukkan Diameter"); // untuk tampilkan pop up input diameter
        double diameter = Double.parseDouble(input);
        Percobaan2Luaslingkaran mt = new Percobaan2Luaslingkaran();
        double luas = mt.luas_lingkaran(diameter);
        JOptionPane.showMessageDialog(null,"Luas Lingkaran : "+luas,"Hasil Hitung",3); // untuk tampilkan pop up hasil dari luas lingkaran
        System.out.println("LUAS LINGKARAN : "+mt.luas_lingkaran(14)); // untuk output di console
    }
    public double luas_lingkaran(double diameter){ // MENGGUNAKAN PUBLIC METHOD
            double jari2 = (diameter/2.0);
            double luas= Math.PI* Math.pow(jari2,2);//math pi untuk phi. math pow untuk pangkat
            return luas;
    }
}
