package lab2.Classes;

import java.util.Arrays;

public class RegistroResumos {
    private int numResumosCadastrados;
    private final int numeroMaxDeResumos;
    private int posicaoUltimoResumo;
    private Resumos resumos;

    public RegistroResumos(int numeroMaxDeResumos) {
        resumos = new Resumos(numeroMaxDeResumos);
        this.numeroMaxDeResumos = numeroMaxDeResumos;
    }

    public void verificaResumos() {
        posicaoUltimoResumo = (posicaoUltimoResumo <= numeroMaxDeResumos - 1 ? posicaoUltimoResumo : 0);
        numResumosCadastrados = (numResumosCadastrados <= numeroMaxDeResumos - 1 ? ++numResumosCadastrados : numResumosCadastrados);
    }

    public void adiciona(String titulo, String resumo) {
        verificaResumos();
        resumos.adicionaNovoResumo(posicaoUltimoResumo++, titulo, resumo);
    }

    public String[] pegaResumos() {
        return resumos.getResumos();
    }

    public int conta() {
        return this.numResumosCadastrados;
    }

    public String imprimeResumos() {
        String[] tempTema = resumos.getTemasResumos();
        String stringTemas = "- " + numResumosCadastrados + " resumo(s) cadastrado(s)\n- ";
        for (int i = 0; i < numResumosCadastrados; i++) {
            stringTemas += (i < numResumosCadastrados - 1 ? tempTema[i] + " | " : tempTema[i]);
        }
        return stringTemas;
    }

    public boolean temResumo(String tema) {
        return Arrays.asList(resumos.getTemasResumos()).contains(tema);
    }
}
