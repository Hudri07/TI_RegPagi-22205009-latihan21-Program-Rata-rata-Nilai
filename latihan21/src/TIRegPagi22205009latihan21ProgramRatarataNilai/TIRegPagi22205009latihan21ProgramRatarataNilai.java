/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TIRegPagi22205009latihan21ProgramRatarataNilai;
import java.util.Scanner;

/**
 *
 * @author Axioo
 * NAMA     : Asmalik Hudri
 * Prodi    : Teknik Informatika
 * NIM      : 22205009
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * rata rata nilai yang inputannya berasal dari user
 * 
 */
public class TIRegPagi22205009latihan21ProgramRatarataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int banyakMahasiswa = scanner.nextInt();
        System.out.println("\n");
        
        double nilaiTotal = 0; 
        double rataRataNilai;
        for (int i=1; i<= banyakMahasiswa; i++){
            System.out.print("Nilai Mahasiswa ke-"+ i + ": ");
            double nilai= scanner.nextDouble();
            nilaiTotal += nilai;
        }
        
        rataRataNilai = nilaiTotal / banyakMahasiswa;
        System.out.print("\nMaka, rata-rata nilainya adalah " + rataRataNilai);
    }
    
}
