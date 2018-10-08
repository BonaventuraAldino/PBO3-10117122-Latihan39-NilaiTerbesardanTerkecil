/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ScoreList {
     public int jumlahMhs;
    public int nBesar = 0;
    public int nKecil = 100;
    public int nilaiMhs[] = new int[40];
    Scanner scn = new Scanner(System.in);

    public void inputJumlahMhs(){
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahMhs = scn.nextInt();
    }

    public int hitungNilaiTerbesar(int i) {
        return nBesar = ((nBesar <= nilaiMhs[i])?nilaiMhs[i]:nBesar);
    }

    public int hitungNilaiTerkecil(int i) {
        return nKecil = ((nKecil >= nilaiMhs[i])?nilaiMhs[i]:nKecil);
    }

    public void hasilNilaiMhs(){
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1)+ " = "
                    +""+nilaiMhs[i]+"\n");
        }
    }
    
}
