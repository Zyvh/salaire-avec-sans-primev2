package fr.nassim;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 1. Initialisation des variables
        Double salaireDeBase = 400.0;
        Double primePotenetielle = 250.0;
        Double salaireFinal = salaireDeBase;
        int quotaVentes = 10;
        int nbVentesManquantes;

        // 2. Nomnbre de ventes
        System.out.println("Veuillez entrer le nombre de ventes : ");
        Scanner clavier = new Scanner(System.in);
        int nbVentes = clavier.nextInt();
        clavier.close();

        // 3. Condition quota et prime ou pas
        if (nbVentes > quotaVentes) {
            salaireFinal = salaireDeBase + primePotenetielle;
            System.out.println(
                    "Bravo ! Vous avez rempli votre quota hebdomadaire de ventes, vous obtenez la prime de "
                            + primePotenetielle + " euros");
        } else if (nbVentes == quotaVentes) {
            salaireFinal = salaireDeBase + primePotenetielle;
            System.out.println("Attention, vous arrivez tout pile au quota minimum, vous obtenez la prime de "
                    + primePotenetielle + " euros");
        } else {
            nbVentesManquantes = quotaVentes - nbVentes;
            System.out.println("Il vous manque " + nbVentesManquantes + " ventes pour atteindre le quota hebdomadaire");
        }

        // 4. Retourner le salaire final
        System.out.println("Salaire final : " + salaireFinal + " euros");
    }

}
