package edu.avogadro;

import java.util.Scanner;

public class MinoreMaggioreValenza2 {
    public static void main(String[] args) {
        Scanner lettore = new Scanner(System.in);

        System.out.println("Inserire primo numero: ");

        int primo = lettore.nextInt();
        System.out.println("Inserire secondo numero: ");

        int secondo = lettore.nextInt();
        System.out.println("Inserire terzo numero: ");

        int terzo = lettore.nextInt();

        if(primo > secondo){
            if(primo > terzo){
                System.out.println("Il numero maggiore è il primo: "+primo);
                if(secondo > terzo){
                    System.out.println("Il numero minore è il terzo: "+terzo);
                }else{
                    System.out.println("Il numero minore è il secondo: "+secondo);
                }
            }else{
                System.out.println("Il numero maggiore è il terzo: "+terzo);
                System.out.println("Il numero minore è il secondo: "+secondo);
            }
        }else if(secondo > terzo){
            System.out.println("Il numero maggiore è il secondo: "+secondo);
            if(primo > terzo){
                System.out.println("Il numero minore è il terzo: "+terzo);
            }else{
                System.out.println("Il numero minore è il primo: "+primo);
            }
        }else{
            System.out.println("Il numero maggiore è il terzo: "+terzo);
            System.out.println("Il numero minore è il primo: "+primo);
        }
    }
}