package com.mycompany.projekpbo;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Projekpbo {
static float total = 0, bil1 = 1,bil2 = 1;
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("masukkan bilangan ke-1 =");
    bil1= input.nextFloat();
    System.out.print("masukkan bilangan ke-2 =");
    bil2= input.nextFloat();
    
    while(bil2 != 0 & bil1 != 0){
        System.out.println("Kalkulator Sederhana");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.perkalian");
        System.out.println("4.pembagian");
        System.out.print("Masukkan Pilihan Anda = ");
        int pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1 :
                System.out.println( + bil1 + "+" + bil2 );
                System.out.print("Hasilnya =");
                total = bil1 + bil2;
                break;
                case 2 :
                System.out.println( + bil1 + "-" + bil2 );
                System.out.print("Hasilnya =");
                total = bil1 - bil2;
                break;
                case 3 :
                System.out.println( + bil1 + "*" + bil2 );
                System.out.print("Hasilnya =");
                total = bil1 * bil2;
                break;
                case 4 :
                System.out.println( + bil1 + "/" + bil2 );
                System.out.print("Hasilnya =");
                total = bil1 / bil2;
                break;
                default :
                    System.out.println("Anda Harus Mengisi Angka");
        }
        System.out.println(total);
        }
        
    
    }
}
