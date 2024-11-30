package universita.corso;

public class Corso {
    private int idCorso;
    public String nomeCorso;
    protected String descrizioneCorso;

    public Corso(int idCorso, String nomeCorso, String descrizioneCorso) {
        this.idCorso = idCorso;
        this.nomeCorso = nomeCorso;
        this.descrizioneCorso = descrizioneCorso;
    }
    public Corso() {}

    public int getIdCorso() {
        return idCorso;
    }

    public void setIdCorso(int idCorso) {
        this.idCorso = idCorso;
    }

    public String getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public String getDescrizioneCorso() {
        return descrizioneCorso;
    }

    public void setDescrizioneCorso(String descrizioneCorso) {
        this.descrizioneCorso = descrizioneCorso;
    }
}
