package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado = 120;
    private int tempoUtilizado;

    public RegistroTempoOnline (String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoUtilizado += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        return tempoUtilizado >= tempoOnlineEsperado;
    }

    public String toString() {
        return this.nomeDisciplina + " " + this.tempoUtilizado + "/" + this.tempoOnlineEsperado;
    }


}
