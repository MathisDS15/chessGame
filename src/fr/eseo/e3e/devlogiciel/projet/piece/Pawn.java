package fr.eseo.e3e.devlogiciel.projet.piece;

import java.util.Scanner;

public class Pawn {

    Scanner scanner;

    public void selection(int x, int y) {
        // Logique de déplacement du pion
        scanner = new Scanner(System.in);
        boolean isDeuxCases = false;
        int positionPawnX = 0;
        int positionPawnY = 0;
        System.out.println("Le pion est à la position : " + x + ", " + y);
        while(positionPawnX !=x){
            System.out.println("Sur quelle case voulez-vous déplacer le pion ? la position X :");
            positionPawnX = scanner.nextInt();
            scanner.nextLine();
            if(positionPawnX !=x){
                System.out.println("Le pion ne peut pas se déplacer de cette façon.");
            }
        }
        System.out.println("Sur quelle case voulez-vous déplacer le pion ? la position Y :");
        positionPawnY = scanner.nextInt();
        scanner.nextLine();

        if (y==6 && y-positionPawnY==2 ) {
            isDeuxCases =true;
            System.out.println("Vous avez déplacé le pion de deux cases.");
            System.out.println("Vous avez déplacé le pion à la position : " + positionPawnX + ", " + positionPawnY);
        } else if (y-positionPawnY==1 ) {
            System.out.println("Vous avez déplacé le pion d'une case.");
            System.out.println("Vous avez déplacé le pion à la position : " + positionPawnX + ", " + positionPawnY);
        } else {
            System.out.println("Déplacement invalide. Le pion ne peut se déplacer que d'une ou deux cases vers l'avant.");
            return;
        }

    }

    public void promotion(){

    }


}
