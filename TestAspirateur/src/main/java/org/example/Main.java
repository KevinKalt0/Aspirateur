package org.example;

public class Main {
            public static void main(String[] args) {
            int dimensionX = 10; // Dimension de la grille en X
            int dimensionY = 10; // Dimension de la grille en Y
            int positionInitialeX = 5; // Position initiale de l'aspirateur en X
            int positionInitialeY = 5; // Position initiale de l'aspirateur en Y
            Orientation orientationInitiale = Orientation.N; // Orientation initiale de l'aspirateur
            String instructions = "DADADADAA"; // Liste d'instructions

            Aspirateur aspirateur = new Aspirateur(positionInitialeX, positionInitialeY, orientationInitiale); // Crée un nouvel aspirateur avec la position et l'orientation initiales
            aspirateur.executerInstructions(instructions); // Exécute les instructions sur l'aspirateur
            aspirateur.afficherPositionFinale(); // Affiche la position finale de l'aspirateur
        }


    }



