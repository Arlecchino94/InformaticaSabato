package edu.avogadro;

import java.util.Scanner;

public class MinoreMaggioreDi2Interi {
    public static void main(String[] args) { // equivale a start
        System.out.print(
                """
                        **************************************************************************************************************
                        *Questo programma ti chiederà l'inserimento di 2 interi e visualizzerà qual'è il minore e quale il maggiore *
                        *e visualizzerà qual'è il minore e quale il maggior                                                         *
                        **************************************************************************************************************

                        """);
        System.out.print("Inserisci il primo intero: ");

        Scanner lettore = new Scanner(System.in);
        int primoIntero = lettore.nextInt();

        System.out.print("Inserisci il secondo intero: ");

        int secondoIntero = lettore.nextInt();

        System.out.println("Ho letto il primo numero intero = "+ primoIntero);
        System.out.println("Ho letto il secondo intero = "+ secondoIntero);


    }
}
