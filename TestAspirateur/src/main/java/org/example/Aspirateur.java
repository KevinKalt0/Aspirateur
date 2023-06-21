package org.example;

public class Aspirateur {

    private int x; // Coordonnée x de l'aspirateur
    private int y; // Coordonnée y de l'aspirateur
    private Orientation orientation; // Orientation de l'aspirateur


    public Aspirateur(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void avancer() {
        switch (orientation) {
            case N:
                if (y < 10) // Vérifie si l'aspirateur peut avancer vers le nord (y+1)
                {
                    y++;
                }
                break;

            case E:
                if (x < 10) // Vérifie si l'aspirateur peut avancer vers l'est (x+1)
                {
                    x++;
                }
                break;

            case S:
                if (y > 0) // Vérifie si l'aspirateur peut avancer vers le sud (y-1)
                {
                    y--;
                }
                break;

            case W:
                if (x > 0) // Vérifie si l'aspirateur peut avancer vers l'ouest (x-1)
                {
                    x--;
                }
                break;
        }
    }

    public void tourneraDroite() {
        switch (orientation) {
            case N:
                orientation = Orientation.E; // Change l'orientation de N à E (tourne à droite)
                break;

            case E:
                orientation = Orientation.S; // Change l'orientation de E à S (tourne à droite)
                break;

            case S:
                orientation = Orientation.W; // Change l'orientation de S à W (tourne à droite)
                break;

            case W:
                orientation = Orientation.N; // Change l'orientation de W à N (tourne à droite)
                break;
        }
    }

    public void tourneraGauche() {

        switch (orientation) {
            case N:
                orientation = Orientation.W; // Change l'orientation de N à W (tourne à gauche)
                break;

            case E:
                orientation = Orientation.N; // Change l'orientation de E à N (tourne à gauche)
                break;

            case S:
                orientation = Orientation.E; // Change l'orientation de S à E (tourne à gauche)
                break;

            case W:
                orientation = Orientation.S; // Change l'orientation de W à S (tourne à gauche)
                break;
        }
    }

    public void executerInstructions(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            switch (instruction) {
                case 'A':
                    avancer(); // Exécute l'instruction "avancer"
                    break;

                case 'D':
                    tourneraDroite(); // Exécute l'instruction "tourner à droite"
                    break;

                case 'G':
                    tourneraGauche(); // Exécute l'instruction "tourner à gauche"
                    break;

                default:
                    // Instruction invalide, ignorer ou lancer une exception selon les besoins.
                    break;
            }
        }
    }

    public void afficherPositionFinale() {
        System.out.println("Position finale : x=" + x + " y=" + y + " orientation=" + orientation);
    }
    public int getX() {
        return x ;
    }
    public int getY() {
        return y;

    }
    public Orientation getOrientation() {
        return orientation ;

    }
}



