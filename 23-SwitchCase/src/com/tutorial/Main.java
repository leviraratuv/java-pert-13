
package com.tutorial;

import  java.util.*;

/**
 * Nama : Levira Ratu Vitaloka
 * Kelas : TI-IB
 * NIM : A2.1900096
 */

public class Main {
    
    // switch case
    
    public static void main(String[] args) {
         
        String input;
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("panggil nama: ");
        input = inputUser.next();
        
        // ekspresinya berupa satuan (int, long, byte, short), String atau enum
        switch(input){
            case "otong":
                System.out.println("saya otong dan hadir Bos!!!");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir Bos!!!");
                break;
            case "mario":
                System.out.println("saya mario dan hadir Bos!!!");
                break;
            default:
                System.out.println(input + " tidak hadir Bos!!!");
        }
    }
    
    
}
