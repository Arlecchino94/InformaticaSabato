package edu.avogadro;

import java.util.Scanner;

public class MinMax3InteriProfessore {
    public static void main(String[] args) {
        Scanner lettore = new Scanner(System.in);
        int primoIntero;
        int secondoIntero;
        int terzoIntero;
        String testoUtente;

        System.out.println(""
                + "*************************************************************************\n"
                + "Questo programma visualizza il minore e maggiore di tre interi inseriti *\n"
                + "*************************************************************************");
        System.out.print("Inserire il primo intero: ");
        testoUtente = lettore.nextLine();
        primoIntero = Integer.parseInt(testoUtente);

        System.out.print("Inserire il secondo intero: ");
        testoUtente = lettore.nextLine();
        secondoIntero = Integer.parseInt(testoUtente);

        System.out.print("Inserire il terzo intero: ");
        testoUtente = lettore.nextLine();
        terzoIntero = Integer.parseInt(testoUtente);

        if (primoIntero < secondoIntero) {
            if (primoIntero <= terzoIntero) {
                if (primoIntero == terzoIntero) {
                    System.out.print("Gli interi minori sono il primo e il terzo e valgono: ");
                } else {
                    System.out.print("L'intero minore è il primo e vale: ");
                }
                System.out.println(primoIntero);
            } else {
                System.out.print("L'intero minore è il terzo e vale: ");
                System.out.println(terzoIntero);
            }
            if (secondoIntero < secondoIntero) {
                if (secondoIntero <= terzoIntero) {
                    if (secondoIntero == terzoIntero) {
                        System.out.print("Gli interi minori sono il terzo e il secondo e valgono: ");
                    } else {
                        System.out.print("L'intero minore è il secondo e vale: ");
                    }
                    System.out.println(secondoIntero);
                } else {
                    System.out.print("L'intero minore è il terzo e vale: ");
                    System.out.println(terzoIntero);
                }
            }
        }
    }
}

