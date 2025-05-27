package fr.eseo.e3e.devlogiciel.projet.board;

public class Board {

    int taille;
    int [][] jeu;


    int[][] getJeu () {
        return this.jeu;
    }

    int getTaille () {return this.taille;}

    Board(String nom) {
        if (nom.equals("Blanc")) {
            // 1 -> pion, 2 -> tour, 3 -> ho LeFou, 4 -> LeCavalier, 5 -> LaDame, 6 -> LeRoi
            this.taille = 8;
            int[][] pionsBlanc = {
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {1, 1, 1, 1, 1, 1, 1, 1},
                    {2, 4, 3, 6, 5, 3, 4, 2}};
            this.jeu = pionsBlanc;
        } else if (nom.equals("Noir")) {
            // 1 -> pion, 2 -> tour, 3 -> LeFou, 4 -> LeCavalier, 5 -> LaDame, 6 -> LeRoi
            this.taille = 8;
            int[][] pionsNoir = {
                    {2, 4, 3, 6, 5, 3, 4, 2},
                    {1, 1, 1, 1, 1, 1, 1, 1},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0}};
            this.jeu = pionsNoir;
        } else {
            System.out.println("Erreur de nom de damier");

        }
    }

    public void affiche() {

        System.out.println ("- Graphe ayant "+this.getTaille()+ " sommet(s).");
        System.out.println ("- Matrice du graphe :");


        // affichage d'indices au dessus de la matrice afin d'y voir plus clair
        System.out.print(" ");
        for (int i=0;i<this.getTaille(); i++)
            System.out.print(" "+i);
        System.out.println();

        // affichage d'un trait au dessus de la matrice pour que ça soit plus joli
        for (int i=0;i<=this.getTaille(); i++)
            System.out.print("--");
        System.out.println();


        // affichage du contenu de la matrice, ligne par ligne
        for (int i=0;i<this.getTaille(); i++) {
            System.out.print("| ");
            for (int j=0;j<this.getTaille(); j++) {
                System.out.print(this.jeu[i][j]+" ");
            }
            System.out.println("|  "+ i);
        }
        for (int i=0;i<=this.getTaille(); i++)
            System.out.print("--");
        System.out.println();
    }
}
