package fr.eseo.e3e.devlogiciel.projet;

import fr.eseo.e3e.devlogiciel.projet.board.Board;
import fr.eseo.e3e.devlogiciel.projet.board.Player;
import fr.eseo.e3e.devlogiciel.projet.piece.Piece;

import java.util.Scanner;

public class Chess {

    Board board;
    Piece piece;
    Player player1;
    Player player2;
    Scanner scanner;

    public void dipslayGameMessage(){

        scanner = new Scanner(System.in);
        int choice =0;
        while (choice != 2){
            System.out.println("\nWelcome to this Chess game!\n");
            System.out.println("\nWhat do you like to do?\n");
            System.out.println("(1) Play a game");
            System.out.println("(2) Exit");
            System.out.println("\nPlease enter your choice");

            scanner.nextLine();
            switch (choice){
                case 1:
                    int i;
                case 2:
                    break;
                default:
                    System.err.println("This choice is not valid");
            }

        }
        System.out.println("Goodbye, see you soon!");
        System.exit(0);
    }



    public static void main(String [] args) {

        Chess chess = new Chess();
        chess.dipslayGameMessage();
    }

}
