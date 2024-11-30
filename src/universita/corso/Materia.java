package universita.corso;

public class Materia {
    private String nomeMateria;
    private String descrizioneMateria;
    private int codiceMateria;

    // ESSENDO L'ATTRIBUTO nomeCorso PUBLIC, RIGA 13 è EQUIVALENTE ALLA RIGA 14. RIGA 12 è SBAGLIATA PERCHE' idCorso E' PRIVATO.
    // RIGA 15 EQUIVALENTE ALLA 16 SOLO SE SI TROVANO NELLO STESSO PACKAGE.
    public Materia(Corso corso){
        this.codiceMateria = corso.getIdCorso();
        //this.codiceMateria = corso.idCorso;
        this.nomeMateria = corso.nomeCorso;
        this.nomeMateria = corso.getNomeCorso();
        this.descrizioneMateria = corso.descrizioneCorso;
        this.descrizioneMateria = corso.getDescrizioneCorso();

    }
}
