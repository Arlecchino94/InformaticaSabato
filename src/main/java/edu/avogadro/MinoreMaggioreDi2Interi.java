package edu.avogadro;

import java.util.Scanner;

public class MinoreMaggioreDi2Interi {
    public static void main(String[] args) { // equivale a start
        System.out.print(
                  "************** \n"
                + "Questo programma ti chiederà l'inserimento di 2 interi e visualizzerà qual'è il minore e quale il maggiore *\n"
                + "e visualizzerà qual'è il minore e quale il maggior\n                                                       *"
                + "************************************************************************************************************\n\n");
        System.out.print("Inserisci il primo intero: ");

        Scanner lettore = new Scanner(System.in);
        String testo = lettore.nextLine();
        int primoIntero = Integer.parseInt(testo);

        System.out.print("Inserisci il secondo intero: ");

        testo = lettore.nextLine();

        int secondoIntero = Integer.parseInt(testo);

        System.out.println("Ho letto il primo numero intero = " + primoIntero);
        System.out.println("Ho letto il secondo numero intero = " + secondoIntero);
        if (primoIntero > secondoIntero) {
            // codice per TRUE
            System.out.println("Il primo intero è maggiore del secondo intero");
        } else {
            //codice per FALSE
            if (primoIntero == secondoIntero) {
                //codice per TRUE
                System.out.println("Il due numeri interi sono uguali");
            } else {
                System.out.println("Il secondo numero intero è maggiore del primo numero intero");
            }

        }


    }
}
