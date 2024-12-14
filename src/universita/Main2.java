package universita;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        double temperatura[] = new double[8];
        //double temperatura[] = {15.5859, 18, 25.4, 17.2, 18, 25, 8, 500};
        int persone[] = {400, 300, 200, 100, 60, 18, 18, 16};


        /*
            int x int = int
            float x float = float
            double x double = doble
            int x float = float
            int x double = double

            float x (float) double = float
            (double) float x double = double //converti tutto in un tipo

         */


        Scanner tastiera = new Scanner(System.in);

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Temperatura media per il piano " + i + ": ");
            temperatura[i] = tastiera.nextDouble();

        }

        int pianoIndex = calcolaIndicePiano(temperatura,persone);

        System.out.println("Piano su cui intervenire con urgenza: " + pianoIndex + "\n Numero di persone: " + persone[pianoIndex] + "\n Temperatura: " + temperatura[pianoIndex]);


    }

    private static int calcolaIndicePiano(double[] temperaturaInput, int[] personeInput) {
        double piano[] = new double[8];

        for (int i = 0; i < piano.length; i++) {
            piano[i] = temperaturaInput[i] * personeInput[i];
            System.out.println("Per il piano i: "+ i + " il punteggio calcolato è: " + piano[i]);
        }

        double minPunteggio = piano[0];
        int indicePiano = 0;

        for (int i = 1; i < piano.length; i++) {
            if(minPunteggio > piano[i]){
                minPunteggio = piano[i];
                indicePiano = i;
            }
        }

        return indicePiano;
    }


}
