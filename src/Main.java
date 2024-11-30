import universita.corso.Corso;
import universita.corso.Materia;
import universita.studenti.Studente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer:");
        int myInt = 0; // Leggi e converte in intero
        try {
            myInt = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("You entered the integer: " + myInt);

        System.out.println("Enter a double:");
        double myDouble = 0; // Leggi e converte in double
        try {
            myDouble = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("You entered the double: " + myDouble);

        System.out.println("Enter a string:");
        String myString = null; // Leggi la stringa
        try {
            myString = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("You entered the string: " + myString);*/

       /* Studente studente = new Studente();
        System.out.println("Prima della valorizzazione");
        System.out.println("studente nome: " + studente.getNome());
        System.out.println("studente cognome: " + studente.getCognome());
        System.out.println("studente matricola: " + studente.getMatricola());

        System.out.println("================================");

        System.out.println("Dopo la valorizzazione");

        studente.setNome("Pippo");
        studente.setCognome("Pluto");
        studente.setMatricola(56789);
        System.out.println("studente nome: " + studente.getNome());
        System.out.println("studente cognome: " + studente.getCognome());
        System.out.println("studente matricola: " + studente.getMatricola());

        studente.infoStudente();
        System.out.println("================================");

        Studente studente2 = new Studente("Federico", "Calò",1234);

        System.out.println("Studente2 nome: " + studente2.getNome());
        System.out.println("Studente2 cognome: " + studente2.getCognome());
        System.out.println("Studente2 matricola: " + studente2.getMatricola());*/

        Corso corso = new Corso(1,"Matematica","Corso di matematica");
        Materia materia = new Materia(corso);

    }
}