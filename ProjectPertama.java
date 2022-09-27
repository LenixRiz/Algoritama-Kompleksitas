/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectpertama;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Rizky-PC
 */
public class ProjectPertama {

    public static void main(String[] args) throws IOException {
        
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        //Variabel
        String nik, nama, tempatLahir, tanggalLahir, alamat, usia, jenisKelamin;
        
        //Input
        System.out.println("Masukkan data diri kamu!");
        System.out.println("========================");
        System.out.print("NIK : ");
        nik = keyboard.readLine();
        System.out.print("Nama : ");
        nama = keyboard.readLine();
        System.out.print("Tempat Lahir : ");
        tempatLahir = keyboard.readLine();
        System.out.print("Tanggal Lahir 'dd/mm/yyyy' : ");
        tanggalLahir = keyboard.readLine();
        System.out.print("Alamat : ");
        alamat = keyboard.readLine();
        System.out.print("Usia : ");
        usia = keyboard.readLine();
        System.out.print("Jenis Kelamin 'L/P' : ");
        jenisKelamin = keyboard.readLine();
        
        // Konversi String ke Int
        int nomorIndukKependudukan = Integer.parseInt(nik);
        int nilaiUsia = Integer.parseInt(usia);
        
        // Output
        System.out.println("");
        System.out.println("Halo " + nama + "!");
        System.out.println("Berikut data diri kamu!");
        System.out.println("=======================");
        System.out.println("NIK : " + nomorIndukKependudukan );
        System.out.println("Nama : " + nama );
        System.out.println("Tempat. Tanggal Lahir : " + tempatLahir + ", " + tanggalLahir);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + nilaiUsia);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
    }
}
