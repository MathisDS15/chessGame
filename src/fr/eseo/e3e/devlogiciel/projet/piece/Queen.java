package fr.eseo.e3e.devlogiciel.projet.piece;

public class Queen extends Piece {

    /**
     * Constructeur de la reine.
     * @param isWhite true si la reine est blanche, false si elle est noire.
     */
    public Queen(boolean isWhite) {

        super(isWhite);
    }


    /**
     * Vérifie si le mouvement de la reine est valide.
     * La reine peut se déplacer en ligne droite (horizontalement ou verticalement)
     * ou en diagonale, et peut sauter par-dessus d'autres pièces.
     *
     * @param fromX Position X de départ
     * @param fromY Position Y de départ
     * @param toX Position X d'arrivée
     * @param toY Position Y d'arrivée
     * @param board Le plateau de jeu
     * @return true si le mouvement est valide, false sinon
     */
    public boolean isValidMove(int fromX, int fromY, int toX, int toY, Piece[][] board) {
        int dx = Math.abs(fromX - toX);
        int dy = Math.abs(fromY - toY);
        if (fromX == toX || fromY == toY) {
            // Tour
            int stepX = Integer.compare(toX, fromX);
            int stepY = Integer.compare(toY, fromY);
            int x = fromX + stepX, y = fromY + stepY;
            while (x != toX || y != toY) {
                if (board[x][y] != null) return false;
                x += stepX;
                y += stepY;
            }
            return board[toX][toY] == null || board[toX][toY].isWhite() != isWhite;
        } else if (dx == dy) {
            // Fou
            int stepX = Integer.compare(toX, fromX);
            int stepY = Integer.compare(toY, fromY);
            int x = fromX + stepX, y = fromY + stepY;
            while (x != toX && y != toY) {
                if (board[x][y] != null) return false;
                x += stepX;
                y += stepY;
            }
            return board[toX][toY] == null || board[toX][toY].isWhite() != isWhite;
        }
        return false;
    }

    /**
     * Retourne une représentation textuelle de la reine pour l'affichage.
     * @return "♕" pour une reine blanche, "♛" pour une reine noire.
     */
    public String toString() {
        return isWhite ? "♕" : "♛";
    }
}
