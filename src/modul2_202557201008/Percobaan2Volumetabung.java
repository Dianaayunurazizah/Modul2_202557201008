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
public class Percobaan2Volumetabung {
    public static void main(String[] args) {
        System.out.println("Percobaan Ke-2 Volume Tabung------diana");
        double diameter,tinggi;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Diagram : ");
        diameter=input.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        tinggi=input.nextDouble();
        Percobaan2Volumetabung mv = new Percobaan2Volumetabung();
        System.out.println("VOLUME TABUNG : "+mv.VolumeTabung(diameter,tinggi)); 
    }
    public double VolumeTabung(double diameter,double tinggi){ // MENGGUNAKAN PUBLIC METHOD
            double jari2 = (diameter/2.0);
            double luas= Math.PI* Math.pow(jari2,2)*tinggi;//math pi untuk phi. math pow untuk pangkat
            return luas;
    }
}
