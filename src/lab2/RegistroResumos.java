package lab2;
import java.util.Arrays;

/**
 * Registra os resumos, contabiliza o número total de resumos cadastrados, verifica se há resumios de determiando tema,
 * retorna os resumos cadastrados.
 *<p>
 *
 * @author Bruno
 */
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
    public String numeroDeResumos() {
        return "- " + contaResumosAtivos + " resumo(s) cadastrado(s)"+ "\n" + "- ";
    }
    /**
     *
     * @return
     */
    public String imprimeResumos() {
        String stringTemas = "";
        stringTemas += numeroDeResumos();

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
        return Arrays.asList(temasResumos).contains(tema);
    }
}
