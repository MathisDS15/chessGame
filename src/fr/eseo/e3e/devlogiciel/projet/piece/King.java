package fr.eseo.e3e.devlogiciel.projet.piece;


public class King extends Piece {

    /**
     * Constructeur de la classe King.
     * @param isWhite Indique si le roi est blanc (true) ou noir (false).
     */
    public King(boolean isWhite) {

        super(isWhite);
    }

    /**
     * Vérifie si le mouvement du roi est valide.
     * Un roi peut se déplacer d'une case dans n'importe quelle direction, mais pas sur une case occupée par une pièce de la même couleur.
     *
     * @param fromX Position X de départ.
     * @param fromY Position Y de départ.
     * @param toX Position X d'arrivée.
     * @param toY Position Y d'arrivée.
     * @param board Le plateau de jeu.
     * @return true si le mouvement est valide, false sinon.
     */
    public boolean isValidMove(int fromX, int fromY, int toX, int toY, Piece[][] board) {

        int dx = Math.abs(fromX - toX);
        int dy = Math.abs(fromY - toY);
        if (dx <= 1 && dy <= 1) {
            return board[toX][toY] == null || board[toX][toY].isWhite() != isWhite;
        }
        return false;
    }

    /**
     * Retourne une représentation textuelle du roi pour l'affichage.
     * @return "♔" pour un roi blanc, "♚" pour un roi noir.
     */
    public String toString() {
        return isWhite ? "♔" : "♚";
    }

    /**
     * Vérifie si le roi est en échec.
     * Un roi est en échec s'il peut être attaqué par une pièce adverse.
     *
     * @param kingX Position X du roi.
     * @param kingY Position Y du roi.
     * @param board Le plateau de jeu.
     * @return true si le roi est en échec, false sinon.
     */
    public boolean kingInCheck(int kingX, int kingY, Piece [][] board) {

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                Piece piece = board[x][y];
                if (piece != null && piece.isWhite() != isWhite) {
                    if (piece.isValidMove(x, y, kingX, kingY, board)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean checkmate(){

        return false;
    }

    public boolean inPat(){

        return false;
    }
}
