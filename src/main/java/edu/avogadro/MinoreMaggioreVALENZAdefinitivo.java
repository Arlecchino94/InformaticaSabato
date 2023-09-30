package edu.avogadro;

import java.util.Scanner;

public class MinoreMaggioreVALENZAdefinitivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Inserisci il terzo numero: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Il numero maggiore è: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Il numero maggiore è: " + num2);
        } else {
            System.out.println("Il numero maggiore è: " + num3);
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("Il primo numero è minore e vale: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Il terzo numero è minore e vale: " + num2);
        } else {
            System.out.println("Il terzo numero è minore e vale: " + num3);
        }
    }
}