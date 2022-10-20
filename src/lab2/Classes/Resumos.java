package lab2.Classes;


public class Resumos {
    private String[] temasResumos;
    private String[] resumos;

    public Resumos(int numeroMaxResumos) {
        this.temasResumos = new String[numeroMaxResumos];
        this.resumos = new String[numeroMaxResumos];
    }

    public void adicionaNovoResumo(int posicao, String tema, String resumo) {
        this.temasResumos[posicao] = tema;
        this.resumos[posicao] = tema + " : " + resumo;
    }

    public String[] getResumos() {
        return this.resumos;
    }

    public String[] getTemasResumos() {
        return this.temasResumos;
    }


}
