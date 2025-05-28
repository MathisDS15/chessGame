package fr.eseo.e3e.devlogiciel.projet.piece;

import java.util.Scanner;

public class Knight {

    Scanner scanner;

    public void selection(int x, int y) {
        scanner = new Scanner(System.in);
        int positionKnightX = 0;
        int positionKnightY = 0;
        int positionDeuxX = 0, positionDeuxY = 0;

        System.out.println("Le cavalier est à la position : " + x + ", " + y);
        // On boucle tant que le déplacement n'est pas un déplacement valide du cavalier
        while (!(
                (positionDeuxX == 2 && (positionDeuxY == 1 || positionDeuxY == -1)) ||
                        (positionDeuxX == -2 && (positionDeuxY == 1 || positionDeuxY == -1)) ||
                        (positionDeuxY == 2 && (positionDeuxX == 1 || positionDeuxX == -1)) ||
                        (positionDeuxY == -2 && (positionDeuxX == 1 || positionDeuxX == -1))
        )) {
            System.out.println("Sur quelle case voulez-vous déplacer le cavalier ? la position X :");
            positionKnightX = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Sur quelle case voulez-vous déplacer le cavalier ? la position Y :");
            positionKnightY = scanner.nextInt();
            scanner.nextLine();
            positionDeuxX = positionKnightX - x;
            positionDeuxY = positionKnightY - y;
            if (!(
                    (positionDeuxX == 2 && (positionDeuxY == 1 || positionDeuxY == -1)) ||
                            (positionDeuxX == -2 && (positionDeuxY == 1 || positionDeuxY == -1)) ||
                            (positionDeuxY == 2 && (positionDeuxX == 1 || positionDeuxX == -1)) ||
                            (positionDeuxY == -2 && (positionDeuxX == 1 || positionDeuxX == -1))
            )) {
                System.out.println("Le cavalier ne peut pas se déplacer de cette façon.");
            }
        }
        System.out.println("Vous avez déplacé le cavalier à la position : " + positionKnightX + ", " + positionKnightY);
    }
}
