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
 * NAMA  : Bonaventura Aldino Senda Seni
 * KELAS : IF-3
 * NIM   : 10117122
 * Deskripsi Program : User memasukkan jumlah mahasiswa yang akan 
 *                     dibandingkan nilainya, memasukan nilai masing-masing
 *                     siswa, menampilkan nilai terbesar dan yang terkecil
 */
public class PBO310117122Latihan39NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Officer ptg = new Officer();
        ScoreList dafNilai = new ScoreList();
        Scanner scn = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai=====");
        ptg.inputPetugas();
        dafNilai.inputJumlahMhs();

//        input nilai mhs
        for (int i=0; i<dafNilai.jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            dafNilai.nilaiMhs[i] = scn.nextInt();
            dafNilai.hitungNilaiTerbesar(i);
            dafNilai.hitungNilaiTerkecil(i);
        }
        dafNilai.hasilNilaiMhs();

        System.out.println("\nNilai Terbesar adalah " + dafNilai.nBesar);
        System.out.println("Nilai Terkecil adalah " + dafNilai.nKecil);

        System.out.print("\nPetugas : " + ptg.namaPetugas);
    }
    
}
