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
public class Percobaan2VolumeBola {
    public static void main(String[] args) {
        System.out.println("Percobaan Ke-2 Volume Bola--------diana");
        double diameternya;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan diameternya : ");
        diameternya=input.nextDouble();
        Percobaan2VolumeBola vn = new Percobaan2VolumeBola();
        System.out.println("VOLUME BOLA : "+vn.VolumeBola(diameternya)); //cara manggil output ini parameternya "diameternya"
        
    }
    public double VolumeBola(double diameter){ // MENGGUNAKAN PUBLIC METHOD
            double jari2 = (diameter/2.0);
            double luas= 4.0/3.0*Math.PI* Math.pow(jari2,3);//math pi untuk phi. math pow untuk pangkat
            return luas;
    }
}
