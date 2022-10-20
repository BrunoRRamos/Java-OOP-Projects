package lab2.Classes;

/**
 * Armazena os resumos cadastrados pela classe RegistroResumos
 * <p>
 * @author Bruno Rodrigues Ramos
 */
public class Resumos {
    private String[] temasResumos;
    private String[] resumos;

    /**
     * Construtor que atribui o tamanho dos arrays: reumos e temasResumos.
     * @param numeroMaxResumos
     */
    public Resumos(int numeroMaxResumos) {
        this.temasResumos = new String[numeroMaxResumos];
        this.resumos = new String[numeroMaxResumos];
    }

    /**
     * Adiciona um novo resumo e um novo tema ao seu respectivo lugar do seu array.
     * @param posicao
     * @param tema
     * @param resumo
     */
    public void adicionaNovoResumo(int posicao, String tema, String resumo) {
        this.temasResumos[posicao] = tema;
        this.resumos[posicao] = tema + " : " + resumo;
    }

    /**
     * Retorna o array resumos.
     * @return array resumos
     */
    public String[] getResumos() {
        return this.resumos;
    }

    /**
     * Retorna o array temasResumos
     * @return array temasResumos
     */
    public String[] getTemasResumos() {
        return this.temasResumos;
    }
}
