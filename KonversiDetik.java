/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.berapadetik;

import java.util.Scanner;

/**
 *
 * @author Rizky-PC
 */
public class KonversiDetik {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int userInput;
        int jam, menit, detik;
        
        System.out.print("Masukkan jumlah detik : ");
        userInput = keyboard.nextInt();
        
        jam = userInput / 3600;
        menit = (userInput%3600) / 60;
        detik = userInput % 60;
        
        System.out.println("Hasil dari " + userInput + " detik adalah :");
        System.out.println(jam + " Jam, " + menit + " Menit, " + detik + " Detik.");
        
    }
}
