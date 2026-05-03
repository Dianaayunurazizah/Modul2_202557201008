/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_202557201008;

import java.util.Scanner;


/**
 *
 * @author Diana Ayu Nur Azizah
 */
public class Percobaan2VolumeKerucut {
    public static void main(String[] args) {
        System.out.println("Percobaan Ke-2 Volume Kerucut-------diana");
        double diameternya,tinggi;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan diameter : ");
        diameternya=input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        tinggi=input.nextDouble();
        Percobaan2VolumeKerucut ad = new Percobaan2VolumeKerucut();
        System.out.println("VOLUME KERUCUT : "+ad.VolumeKerucut(diameternya,tinggi));
    }
    public double VolumeKerucut(double diameternya,double tinggi){ // MENGGUNAKAN NON VOID METHOD
            double jari2 = (diameternya/2.0);
            double luas= 1.0/3.0*Math.PI* Math.pow(jari2,2)*tinggi;//math pi untuk phi. math pow untuk pangkat
            return luas;
    }
}
