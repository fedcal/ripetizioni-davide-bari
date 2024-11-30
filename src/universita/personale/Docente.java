package universita.personale;

import universita.corso.Corso;

import java.util.List;

public class Docente {
    private String nomeDocente;
    private String cognomeDocente;
    private List<Corso> corsoList;
    private String nomeCorso;
    private String descrizioneCorso;

    // IN QUESTO CASO RIGA 20 E 21 NON SONO EQUIVALENTI, PERCHE' L'ATTRIBUTO descrizioneCorso E' DI TIPO PROTECTED
    // E LA CLASSE DOCENTE SI TROVA IN UN PACKAGE DIVERSO DA QUELLO DELLA CLASSE CORSO.
    public Docente(Corso corso){
        //Essendo l'attributo idCorso privato, devo accedere
        int idCorso = corso.getIdCorso();
        this.nomeCorso = corso.nomeCorso;
        this.descrizioneCorso = corso.getDescrizioneCorso();
        //this.descrizioneCorso = corso.descrizioneCorso;

    }
    public Docente(String nomeDocente, String cognomeDocente, List<Corso> corsoList) {}
    public Docente(){};

    public String getNomeDocente() {
        return nomeDocente;
    }

    public void setNomeDocente(String nomeDocente) {
        this.nomeDocente = nomeDocente;
    }

    public String getCognomeDocente() {
        return cognomeDocente;
    }

    public void setCognomeDocente(String cognomeDocente) {
        this.cognomeDocente = cognomeDocente;
    }

    public List<Corso> getCorsoList() {
        return corsoList;
    }

    public void setCorsoList(List<Corso> corsoList) {
        this.corsoList = corsoList;
    }
}
