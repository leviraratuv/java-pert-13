
package com.tutorial;

/**
 * Nama : Levira Ratu Vitaloka
 * Kelas : TI-IB
 * NIM : A2.1900096
 */

public class Main {
    
    public static void main(String[] args) {
        
        // break, continue, dan return
        
        int a = 0;
        
        while(true){
            a++;
            
            if(a == 10){
                break;
                // ini adalah keyword untuk memaksa keluar dari loop 
            } else if(a == 5){
                continue;
                // ini adalah keyword untuk memaksa memulai aksi dari
            } else if (a == 7){
                return;
            }
            
            System.out.println("looping ke - " + a);
        }
        System.out.println("akhir dari looping");
    }
    
}
