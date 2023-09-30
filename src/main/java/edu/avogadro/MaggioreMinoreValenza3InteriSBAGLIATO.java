package edu.avogadro;

import java.util.Scanner;

public class MaggioreMinoreValenza3InteriSBAGLIATO {
    public static void main(String[] args) {
        System.out.print("Inserisci il primo numero: ");

        Scanner lettore = new Scanner(System.in);

        String numero = lettore.nextLine();

        int primoNumero = Integer.parseInt(numero);
        System.out.print("Inserisci il secondo numero: ");

        numero = lettore.nextLine();

        int secondoNumero = Integer.parseInt(numero);
        System.out.print("Inserisci il terzo numero: ");

        numero = lettore.nextLine();

        int terzoNumero = Integer.parseInt(numero);

        if (primoNumero > secondoNumero) {
            System.out.println("Il primo numero è maggiore e vale: "+primoNumero);
        } if (primoNumero > terzoNumero) {
                System.out.println("Il primo numero è maggiore e vale: "+primoNumero);
            } else if (secondoNumero > terzoNumero) {
                    System.out.println("Il secondo numero è maggiore e vale: "+secondoNumero);
                } if (secondoNumero > primoNumero) {
            System.out.println("Il secondo numero è maggiore e vale: "+secondoNumero);
            }else if ()


    }
}


