/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.berapadetik;

/**
 *
 * @author Rizky-PC
 */
public class Pembanding {
    public static void main(String[] args) {
        
        //latihan menggunakan pembanding interger
        
        int age = 36;
        
        boolean hasilBandingSatu = age < 25;
        boolean hasilBandingDua = age != 26;
        
        System.out.println("age == 26");
        System.out.println("Hasil Banding age < 25 : " + hasilBandingSatu);
        System.out.println("Hasil Banding age != 26 : " + hasilBandingDua);
        
        //latihan menggunakan pembanding String
        
        String kataSatu = "halo";
        String kataDua = "Halo";

        System.out.println("equals; apakah kataSatu = halo sama dengan kataDua = Halo?");
        
        if (kataSatu.equals(kataDua)) {
            System.out.println("Ya");
        } else {
            System.out.println("Tidak");
        }
        
        System.out.println("equalsIgnoreCase; apakah kataSatu = halo sama dengan kataDua = Halo?");
        
        if (kataSatu.equalsIgnoreCase(kataDua)) {
            System.out.println("Ya");
        } else {
            System.out.println("Tidak");
        }
        
        //compareTo
        
        String kucingSatu = "Cat";
        String kucingDua = "Kucing";
        
        System.out.println("compareTo < 0; apakah kucingSatu = Cat lebih dahulu kucingDua = Kucing?");
        System.out.println(kucingSatu.compareTo(kucingDua) < 0);
        System.out.println("compareTo > 0; apakah kucingSatu = Cat sebelum kucingDua = Kucing?");
        System.out.println(kucingSatu.compareTo(kucingDua) > 0);
        System.out.println("compareTo == 0; apakah kucingSatu = Cat sama dengan kucingDua = Kucing?");
        System.out.println(kucingSatu.compareTo(kucingDua) == 0);
     
        
        
    }
}
