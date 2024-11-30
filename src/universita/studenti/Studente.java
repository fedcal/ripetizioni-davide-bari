package universita.studenti;

public class Studente {
    //Attributi di classe
    private String nome;
    public String cognome;
    int matricola;
    private int annoNascita;

    //COSTRUTTORI
    public Studente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public Studente() {}

    //METODI
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public void infoStudente() {
        System.out.println("Nome: " + this.nome + "\nCognome: " + this.cognome + "\nMatricola: " + this.matricola);
    }

    public int calcolaEta(int annoCorrente){
        return annoCorrente - this.annoNascita;
    }
}
