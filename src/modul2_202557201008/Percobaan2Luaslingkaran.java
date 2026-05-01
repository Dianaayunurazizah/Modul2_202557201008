/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_202557201008;

import java.util.Scanner;

/**
 *
 * @author DIANA AYU NUR AZIZAH
 */
public class Percobaan2Luaslingkaran {
    public static void main(String[] args) {
        System.out.println("Percobaan Ke-2 Luas Lingkaran------diana");
        double diameter;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Diameter : ");
        diameter=input.nextDouble();
        Percobaan2Luaslingkaran mt = new Percobaan2Luaslingkaran();
        System.out.println("LUAS LINGKARAN : "+mt.luas_lingkaran(diameter)); 
        
    }
    public double luas_lingkaran(double diameter){ // MENGGUNAKAN PUBLIC METHOD
            double jari2 = (diameter/2.0);
            double luas= Math.PI* Math.pow(jari2,2);//math pi untuk phi. math pow untuk pangkat
            return luas;
    }
}
