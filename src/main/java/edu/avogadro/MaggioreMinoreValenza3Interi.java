package edu.avogadro;

import java.util.Scanner;

    public class MaggioreMinoreValenza3Interi {
        public static void main(String[] args) {
            System.out.print("Inserisci il primo numero: ");

            Scanner lettore = new Scanner(System.in);
            String testo = lettore.nextLine();

            int primoNumero = Integer.parseInt(testo);

            System.out.print("Inserisci il secondo numero: ");
            testo = lettore.nextLine();
            int secondoNumero = Integer.parseInt(testo);

            System.out.print("Inserisci il terzo numero: ");
            testo = lettore.nextLine();
            int terzoNumero = Integer.parseInt(testo);

            if (primoNumero > secondoNumero) {
                System.out.print("Il primo numero è il maggiore e vale: "+primoNumero);
            } else {
                if (primoNumero < secondoNumero)  {
                    if (primoNumero < terzoNumero){
                        System.out.print("Il primo numero è il minore e vale: "+primoNumero);
                    } else {
                        if (secondoNumero > primoNumero) {
                            System.out.print("Il secondo numero è il maggiore e vale: "+secondoNumero);
                        } else {
                            if (secondoNumero < primoNumero) {
                                if (secondoNumero < terzoNumero) {
                                    System.out.print("Il secondo numero è il minore e vale: "+secondoNumero);
                                } else {
                                    if (terzoNumero > primoNumero) {
                                        System.out.print("Il terzo numero è il maggiore e vale: " + terzoNumero);
                                    } else {
                                        if (terzoNumero < primoNumero) {
                                            if (terzoNumero < secondoNumero) {
                                                System.out.println("Il terzo numero è il minore e vale: "+terzoNumero);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }



        }
    }



