package fr.eseo.e3e.devlogiciel.projet.board;

import fr.eseo.e3e.devlogiciel.projet.piece.Bishop;
import fr.eseo.e3e.devlogiciel.projet.piece.King;
import fr.eseo.e3e.devlogiciel.projet.piece.Knight;
import fr.eseo.e3e.devlogiciel.projet.piece.Pawn;
import fr.eseo.e3e.devlogiciel.projet.piece.Piece;
import fr.eseo.e3e.devlogiciel.projet.piece.Queen;
import fr.eseo.e3e.devlogiciel.projet.piece.Rook;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Board {

    private static final int SIZE = 8;
    private final Piece[][] board = new Piece[SIZE][SIZE];
    private final Button[][] cells = new Button[SIZE][SIZE];
    private int selectedRow = -1;
    private int selectedCol = -1;
    private boolean whiteTurn = true;

    /**
     * Constructeur de la classe Board.
     * Initialise le plateau de jeu avec les pièces aux positions de départ.
     */
    public Board() {
        initBoard();
    }

    /**
     * Initialise le plateau de jeu avec les pièces aux positions de départ.
     * Place les pièces noires sur les deux premières lignes et les pièces blanches sur les deux dernières lignes.
     */
    public void initBoard() {

        // Pièces noires
        // Tour, Cavalier, Fou, Dame, Roi, Fou, Cavalier, Tour
        board[0][0] = new Rook(false);
        board[0][1] = new Knight(false);
        board[0][2] = new Bishop(false);
        board[0][3] = new Queen(false);
        board[0][4] = new King(false);
        board[0][5] = new Bishop(false);
        board[0][6] = new Knight(false);
        board[0][7] = new Rook(false);

        // Pions noirs
        for (int i = 0; i < SIZE; i++) {
            board[1][i] = new Pawn(false);
        }

        // Cases vides
        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = null;
            }
        }

        // Pièces blanches
        // Tour, Cavalier, Fou, Dame, Roi, Fou, Cavalier, Tour
        board[7][0] = new Rook(true);
        board[7][1] = new Knight(true);
        board[7][2] = new Bishop(true);
        board[7][3] = new Queen(true);
        board[7][4] = new King(true);
        board[7][5] = new Bishop(true);
        board[7][6] = new Knight(true);
        board[7][7] = new Rook(true);

        // Pions blancs
        for (int i = 0; i < SIZE; i++) {
            board[6][i] = new Pawn(true);
        }
    }

    /**
     * Met à jour l'affichage du plateau de jeu dans la grille donnée.
     * Vide la grille et ajoute les boutons représentant les pièces.
     *
     * @param grid La grille dans laquelle afficher le plateau de jeu.
     */
    public void updateBoardDisplay(GridPane grid) {
        grid.getChildren().clear();
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                String label = (board[row][col] == null) ? "." : board[row][col].toString();
                Button cell = new Button(label);
                cell.setMinSize(60, 60);
                cell.setStyle((row + col) % 2 == 0 ? "-fx-background-color: white;" : "-fx-background-color: grey;");
                final int r = row, c = col;
                cell.setOnAction(e -> clickManagement(r, c, grid));
                cells[row][col] = cell;
                grid.add(cell, col, row);
            }
        }
    }

    /**
     * Gère le clic sur une case du plateau de jeu.
     * Si aucune case n'est sélectionnée, sélectionne la pièce si elle est valide.
     * Si une case est déjà sélectionnée, vérifie si le mouvement est valide et effectue le déplacement.
     *
     * @param row La ligne de la case cliquée.
     * @param col La colonne de la case cliquée.
     * @param grid La grille dans laquelle afficher le plateau de jeu.
     */
    public void clickManagement(int row, int col, GridPane grid) {
        if (selectedRow == -1 && selectedCol == -1) {
            Piece piece = board[row][col];
            if (piece != null && ((whiteTurn && piece.isWhite()) || (!whiteTurn && !piece.isWhite()))) {
                selectedRow = row;
                selectedCol = col;
                cells[row][col].setStyle("-fx-background-color: #a7c7e7;;"); // Met la case sélectionnée en bleu claire
            }
        } else {
            Piece piece = board[selectedRow][selectedCol];
            if (piece != null && piece.isValidMove(selectedRow, selectedCol, row, col, board)) {
                if (row != selectedRow || col != selectedCol) {
                    board[row][col] = board[selectedRow][selectedCol];
                    board[selectedRow][selectedCol] = null;
                    whiteTurn = !whiteTurn;
                }
            }
            selectedRow = -1;
            selectedCol = -1;
            updateBoardDisplay(grid);
        }
    }
}
