
package com.tutorial;

import java.util.*;

/**
 * Nama : Levira Ratu Vitaloka
 * Kelas : TI-IB
 * NIM : A2.1900096
 */

public class Main {
    
    public static void main(String[] args) {
        
        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;
        
        inputUser = new Scanner(System.in);
        
        System.out.print("nilai a= ");
        a = inputUser.nextFloat();
        System.out.print("operator= ");
        operator = inputUser.next().charAt(0);
        b = inputUser.nextFloat();
        
        System.out.println("input user: " + a + " " + operator + " " + b);
        
        //operator tersedia * / + -
        
        if (operator == '+'){
            // penjumlahan
             // penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-'){
            //pengurangan
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
            //perkalian
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/'){
            //pembagian
            if (b == 0){
                System.out.println("pembagi nol menghasilkan tak hingga");
        } else{
                hasil = a / b;
                System.out.println("hasil = " + hasil);
          }
        } else {
            System.out.println("operator tidak ditemukan");
        }
        
        }
            
    }
    
    
