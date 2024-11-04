/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_23176029latihan25ejaannama;

/**
 *
 * @author shafi
 * NIM   : 23176029
 * Kelas : PBO1
 * Prodi : Sistem Informasi
 * Deskripsi Program : Program ini berisi program untuk menampilkan ejaan nama
 */

import java.util.Scanner;
public class SI_RegPagi_23176029Latihan25EjaanNama {


    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = scanner.nextLine();
        
        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
        
        // Melakukan perulangan untuk setiap huruf dalam nama
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
        
        // Menutup scanner
        scanner.close();
        
        System.out.println("BUILD SUCCESSFUL");
    }
}
