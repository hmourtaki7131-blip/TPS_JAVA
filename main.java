import java.util.Scanner;

public class Main {

    // a. Méthode pour l'addition
    public static int addition(int a, int b) {
        return a + b;
    }

    // b. Méthode pour la multiplication
    public static int multiplication(int a, int b) {
        return a * b;
    }

    // c. Méthode moyenne avec varargs
    public static double moyenne(int... valeurs) {
        int total = 0;

        for (int v : valeurs) {
            total += v;
        }

        return (double) total / valeurs.length;
    }

    // d. Méthode pour trouver le plus grand nombre
    public static int maximum(int... valeurs) {
        int max = valeurs[0];

        for (int v : valeurs) {
            if (v > max) {
                max = v;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choix;

        do {

            // === MENU PRINCIPAL ===
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Moyenne");
            System.out.println("4. Trouver le plus grand");
            System.out.println("0. Quitter");

            System.out.print("Choisissez une option : ");
            choix = sc.nextInt();

            // Appel de la méthode correspondante
            switch (choix) {

                case 1:
                    System.out.print("Entrez deux entiers : ");
                    int a1 = sc.nextInt();
                    int b1 = sc.nextInt();

                    System.out.println("Résultat : " + addition(a1, b1));
                    break;

                case 2:
                    System.out.print("Entrez deux entiers : ");
                    int a2 = sc.nextInt();
                    int b2 = sc.nextInt();

                    System.out.println("Résultat : " + multiplication(a2, b2));
                    break;

                case 3:
                    System.out.print("Combien de valeurs ? ");
                    int n = sc.nextInt();

                    int[] valeurs = new int[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Valeur " + (i + 1) + " : ");
                        valeurs[i] = sc.nextInt();
                    }

                    System.out.println("Moyenne : " + moyenne(valeurs));
                    break;

                case 4:
                    System.out.print("Combien de valeurs ? ");
                    int m = sc.nextInt();

                    int[] nombres = new int[m];

                    for (int i = 0; i < m; i++) {
                        System.out.print("Valeur " + (i + 1) + " : ");
                        nombres[i] = sc.nextInt();
                    }

                    System.out.println("Maximum : " + maximum(nombres));
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Option invalide !");
            }

        } while (choix != 0);

        sc.close();
    }
}