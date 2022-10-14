package lab2;

public class RegistroResumos {
    private int numeroMaxDeResumos;
    private String[] resumos;
    private String[] temasResumos;
    private static int contaResumosAtivos = 0;

    public RegistroResumos(int numeroDeResumos) {
        this.numeroMaxDeResumos = numeroDeResumos;
        this.resumos =  new String[numeroMaxDeResumos];
        this.temasResumos =  new String[numeroMaxDeResumos];
    }

    public void adiciona(String tema, String resumo) {
        if (contaResumosAtivos >= numeroMaxDeResumos) {
            contaResumosAtivos = 0;
        }
        temasResumos[contaResumosAtivos] = tema;
        resumos[contaResumosAtivos] = (tema + ": " + resumo);
        contaResumosAtivos++;
    }
    public String[] pegaResumos() {
        return resumos;
    }

    public String imprimeResumos() {
        System.out.println("- " + contaResumosAtivos + " resumo(s) cadastrado(s)");
        String stringTemas = "";
        stringTemas += "- ";

        for (int i = 0; i < contaResumosAtivos - 1; i++) {
            if (i <= contaResumosAtivos) {
                stringTemas += temasResumos[i] + " | ";
            }
        }
        stringTemas += temasResumos[contaResumosAtivos - 1];
        return stringTemas;
    }

    public int conta() {
        return contaResumosAtivos;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < contaResumosAtivos; i++) {
            if (temasResumos[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }
}
