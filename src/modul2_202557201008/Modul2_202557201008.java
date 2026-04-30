/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2_202557201008;

/**
 *
 * @author DIANA AYU NUAR AZIZAH
 */
public class Modul2_202557201008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Percobaan Ke-1");
        int bil = 10;
        String b[]={"a","b","c"};
        try {
            for (int i = 0; i < 4; i++) { //untuk  menampilkan array
                System.out.println(b[i]);  
            }
            System.out.println(bil / 0);//logika salah sebab dibagi dengan 0
            System.out.println(b[3]);// indeks tidak ada sebab panjang indeks array b hanya sampai 2
        } catch (ArithmeticException ai) { // fungsinya untuk menangkap kesalahan di logika matematika  
            System.out.println("ERROR ARITMATIK");
            System.out.println(ai.getMessage());
        } catch (ArrayIndexOutOfBoundsException n){ // fungsinya untuk menangkap indeks array yang tidak ada 
            System.out.println("ERROR karena melebihi kapasitas array");
            System.out.println(n.getMessage());  
        } catch (Exception e){ //untuk menangkap semua kesalahan
            System.out.println("ADA ERROR");
        }
        
    }
   
    
}
