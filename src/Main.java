import universita.corso.Corso;
import universita.corso.Materia;
import universita.studenti.Studente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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

        Studente studente = new Studente();
        /*System.out.println("Prima della valorizzazione");
        System.out.println("studente nome: " + studente.getNome());
        System.out.println("studente cognome: " + studente.getCognome());
        System.out.println("studente matricola: " + studente.getMatricola());

        System.out.println("================================");

        System.out.println("Dopo la valorizzazione");*/

        studente.setNome("Pippo");
        studente.setCognome("Pluto");
        studente.setMatricola(56789);

        Studente studente2 = new Studente("Federico", "Calò",1234);

        studente2.getNome();
        studente.getNome();

        studente.equals(studente2);
       /* System.out.println("studente nome: " + studente.getNome());
        System.out.println("studente cognome: " + studente.getCognome());
        System.out.println("studente matricola: " + studente.getMatricola());*/

       /* studente.infoStudente();
        System.out.println("================================");



        System.out.println("Studente2 nome: " + studente2.getNome());
        System.out.println("Studente2 cognome: " + studente2.getCognome());
        System.out.println("Studente2 matricola: " + studente2.getMatricola());

        Corso corso = new Corso(1,"Matematica","Corso di matematica");
        Materia materia = new Materia(corso);*/

        int[] vettore1 = new int[5]; //5 elementi {0,0,0,0,0}
        int[] vettore2 = {1,2,3,4,5,8,15,30}; //8 elementi

        System.out.println("Vettore1 di dimensione: " + vettore1.length);
        vettore1[0] = 1;
        vettore1[1] = 2;
        vettore1[2] = 3;
        vettore1[3] = 4;
        vettore1[4] = 5;
       //for(int i = 0; i<vettore1.length; i++){
        for(int i = 0; i<5; i++){
            System.out.println(vettore1[i]);
        }
        System.out.println("Vettore2 di dimensione: " + vettore2.length);
        for(int i = 0; i<vettore2.length; i++){
            System.out.println(vettore2[i]);
        }

        int[][] arrayBidimensionale = new int[5][15];
        System.out.println("arrayBidimensionale di dimensione: " + arrayBidimensionale.length); //il punto .length restituisce la dimensione massima delle righe
        int dimensioneColonna = arrayBidimensionale[0].length;
        System.out.println("Colonna di dimensione: " + dimensioneColonna);
        //Di default i valori sono 0
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.println(arrayBidimensionale[i][j]);
            }
        }

        List<Integer> lista1 = new ArrayList<>();

        lista1.add(35);
        lista1.add(89);
        lista1.add(500);
        lista1.add(10000);
        lista1.add(458748);

        System.out.println("Lista di dimensione dopo la compilazione: " + lista1.size());
        System.out.println(lista1);

        String continua = "No";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int myInt = 0;
        do{
            System.out.println("Inserisci numero da aggiungere: ");
            try {
                myInt = Integer.parseInt(reader.readLine());
                lista1.add(myInt);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Continuare?");
            try {
                continua = reader.readLine().trim();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }while(continua.equals("Si"));
        System.out.println("Lista di dimensione durante il runtime: " + lista1.size());
        System.out.println(lista1);

        //Elimino un elemento dalla lista
        lista1.remove(lista1.size()-1);

        System.out.println("Lista di dimensione durante il runtime: " + lista1.size());
        System.out.println(lista1);

    }
}