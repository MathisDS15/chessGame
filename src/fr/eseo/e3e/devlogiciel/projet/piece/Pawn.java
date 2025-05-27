package fr.eseo.e3e.devlogiciel.projet.piece;

import java.util.Scanner;

public class Pawn {

    Scanner scanner;

    public void selection(int x, int y) {
        // Logique de déplacement du pion
        scanner = new Scanner(System.in);
        boolean isDeuxCases = false;
        int positionX = 0;
        int positionY = 0;
        System.out.println("Le pion est à la position : " + x + ", " + y);
        while(positionX !=x){
            System.out.println("Sur quelle case voulez-vous déplacer le pion ? la position X :");
            positionX = scanner.nextInt();
            scanner.nextLine();
            if(positionX !=x){
                System.out.println("Le pion ne peut pas se déplacer de cette façon.");
            }
        }
        System.out.println("Sur quelle case voulez-vous déplacer le pion ? la position Y :");
        positionY = scanner.nextInt();
        scanner.nextLine();

        if (y==6 && y-positionY==2 ) {
            isDeuxCases =true;
            System.out.println("Vous avez déplacé le pion de deux cases.");
            System.out.println("Vous avez déplacé le pion à la position : " + positionX + ", " + positionY);
        } else if (y-positionY==1 ) {
            System.out.println("Vous avez déplacé le pion d'une case.");
            System.out.println("Vous avez déplacé le pion à la position : " + positionX + ", " + positionY);
        } else {
            System.out.println("Déplacement invalide. Le pion ne peut se déplacer que d'une ou deux cases vers l'avant.");
            return;
        }




    }


}