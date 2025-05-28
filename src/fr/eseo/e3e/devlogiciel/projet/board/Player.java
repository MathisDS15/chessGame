package fr.eseo.e3e.devlogiciel.projet.board;

import fr.eseo.e3e.devlogiciel.projet.piece.*;


public class Player {



    public static void main(String[] args) {

        Board Echequier = new Board("Blanc");
        Echequier.affiche();

        jouer();
    }

    public static void jouer() {

        Pawn pawn = new Pawn();
        System.out.println("Déplacement du pion");
        pawn.selection(2, 6);
        
        Queen queen = new Queen();
        System.out.println("Déplacement de la reine");
        queen.selection(2,6);
        
        King king = new King();
        System.out.println("Déplacement du roi:");
        king.selection(2,6);
        
        Bishop bishop = new Bishop();
        System.out.println("Déplacement du fou");
        bishop.selection(2,6);
        
        Rook rook = new Rook();
        System.out.println("Déplacement de la tour");
        rook.selection(2,6);
        
        Knight knight = new Knight();
        System.out.println("Déplacement du cavalier:");
        knight.selection(2,6);

    }

}

