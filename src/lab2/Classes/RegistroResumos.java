package lab2.Classes;
import java.util.Arrays;

/**
 * Gerencia os resumos, contabiliza o número total de resumos cadastrados, verifica se há resumios de determiando tema,
 * retorna os resumos cadastrados.
 *<p>
 *
 * @author Bruno
 */
public class RegistroResumos {
    private int numeroMaxDeResumos;
    private String[] resumos;
    private String[] temasResumos;
    private int contaResumosAtivos = 0;
    private int auxiliaContaResumos = 0;

    /**
     * Construtor recebe o número máximo de resumo e cria os arrays (do número máximo de resumos) que correspondem ao tema e ao conteúdo do resumo.
     * @param numeroDeResumos
     */
    public RegistroResumos(int numeroDeResumos) {
        this.numeroMaxDeResumos = numeroDeResumos;
        this.resumos =  new String[numeroMaxDeResumos];
        this.temasResumos =  new String[numeroMaxDeResumos];
    }

    /**
     * Verifica se é necessário substituir algum resumo e adiciona o tema e o conteúdo dos resumos em seus respectivos arrays.
     * Utiliza uma variavel auxiliar que é zerada caso o número de resumos ultrapasse o limite.
     * @param tema
     * @param resumo
     */
    public void adiciona(String tema, String resumo) {
        if (contaResumosAtivos <= numeroMaxDeResumos - 1) {
            temasResumos[contaResumosAtivos] = tema;
            resumos[contaResumosAtivos] = (tema + ": " + resumo);
            contaResumosAtivos++;
        } else {
            if (auxiliaContaResumos > numeroMaxDeResumos - 1) {
                auxiliaContaResumos = 0;
            }
            temasResumos[auxiliaContaResumos] = tema;
            resumos[auxiliaContaResumos] = (tema + ": " + resumo);
            auxiliaContaResumos++;
        }
    }

    /**
     * Retorna todos os resumos cadastrados.
     * @return Array resumos
     */
    public String[] pegaResumos() {
        return resumos;
    }

    /**
     * Retorna uma stringa com a relação do número de resumos cadastrados.
     * @return String "- contaResumosAtivos resumo(s) cadastrado(s)
     */
    public String numeroDeResumos() {
        return "- " + contaResumosAtivos + " resumo(s) cadastrado(s)"+ "\n" + "- ";
    }
    /**
     *Retorna uma string com o tema e o conteúdo do resumo além do número de resumos cadastrados.
     * @return temaDoResumo : resumo
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

    /**
     * Retorna um int que representa o número de resumos cadastrados
     * @return
     */
    public int conta() {
        return contaResumosAtivos;
    }

    /**
     * Verifica se determinado tema de resumo já foi cadastrado.
     * @param tema
     * @return boolean true ou false
     */
    public boolean temResumo(String tema) {
        return Arrays.asList(temasResumos).contains(tema);
    }
}
