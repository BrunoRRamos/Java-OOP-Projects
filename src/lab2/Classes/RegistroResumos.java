package lab2.Classes;
import java.util.Arrays;

/**
 * Adicona novos resumos, verifica se exedeu o número máximo de resumos, retorna uma string com os temas de resumos cadastrados,
 * verifica se existe algum resumo cadastrado com um certo nome.
 * <p>
 * @author Bruno Rodrigues Ramos
 */
public class RegistroResumos {
    private int numResumosCadastrados;
    private final int numeroMaxDeResumos;
    private int posicaoUltimoResumo;
    private Resumos resumos;

    /**
     * Construtor que cria o objeto resumos com o argumento: numeroMaxDeResumos; E atribui um valor a variavel: numeroMaxDeResumos.
     * @param numeroMaxDeResumos
     */
    public RegistroResumos(int numeroMaxDeResumos) {
        resumos = new Resumos(numeroMaxDeResumos);
        this.numeroMaxDeResumos = numeroMaxDeResumos;
    }

    /**
     * Verifica se o número de resumos cadastrados exedeu o número máximo de resumos e caso tenha exedido zera o valor da variavel: posicaoUltimoResumo,
     * a fim de subistituir os primeiros resumos cadastrados por novos.
     */
    private void verificaResumos() {
        posicaoUltimoResumo = (posicaoUltimoResumo <= numeroMaxDeResumos - 1 ? posicaoUltimoResumo : 0);
        numResumosCadastrados = (numResumosCadastrados <= numeroMaxDeResumos - 1 ? ++numResumosCadastrados : numResumosCadastrados);
    }

    /**
     * Apos a verificação do número de resumos, cadastra um novo resumo atravez do método adicionaNovoResumo da classe resumos.
     * @param titulo
     * @param resumo
     */
    public void adiciona(String titulo, String resumo) {
        verificaResumos();
        resumos.adicionaNovoResumo(posicaoUltimoResumo++, titulo, resumo);
    }

    /**
     * Retorna um array de resumos atravez do método getResumos da classe resumos.
     * @return Strinf[] array de resumos
     */
    public String[] pegaResumos() {
        return resumos.getResumos();
    }

    /**
     * Retorna o número de resumos cadastrados.
     * @return int número de resumos cadastrados
     */
    public int conta() {
        return this.numResumosCadastrados;
    }

    /**
     * Retorna uma stringa com a quantidade de resumos cadastrados e os temas de resumos cadastrados
     * @return
     */
    public String imprimeResumos() {
        String[] tempTema = resumos.getTemasResumos();
        String stringTemas = "- " + numResumosCadastrados + " resumo(s) cadastrado(s)\n- ";
        for (int i = 0; i < numResumosCadastrados; i++) {
            stringTemas += (i < numResumosCadastrados - 1 ? tempTema[i] + " | " : tempTema[i]);
        }
        return stringTemas;
    }

    /**
     * Verifica se há algum resumo cadastrado com determinado título,
     * @param tema
     * @return boolean
     */
    public boolean temResumo(String tema) {
        return Arrays.asList(resumos.getTemasResumos()).contains(tema);
    }
}
