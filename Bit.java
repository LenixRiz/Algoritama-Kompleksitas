/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.berapadetik;

/**
 *
 * @author Rizky-PC
 */
public class Bit {
    public static void main(String[] args) {
        
        int a = 3, b = 5, c;
        
        c = a&b;
        System.out.println("a AND b = " + c);
        
        c = a|b;
        System.out.println("a OR b = " + c);
        
        c = a^b;
        System.out.println("a XOR b = " + c);
        
        c = ~a;
        System.out.println("NOT a = " + c);
        
        c = a << 2;
        System.out.println("a geser kiri = " + c);
        
        c = a >> 2;
        System.out.println("a geser kanan = " + c);
    }
}
