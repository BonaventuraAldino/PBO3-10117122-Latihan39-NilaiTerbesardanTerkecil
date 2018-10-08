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
public class Officer {
    public String namaPetugas;
    ScoreList dafNilai = new ScoreList();
    Scanner scn = new Scanner(System.in);

    public void inputPetugas() {
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.next();
    }
    
}
