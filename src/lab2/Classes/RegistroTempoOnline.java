package lab2.Classes;
/**
 * Gerencia o nome, as horas esperadas e as horas utilizadas para determinada disciplina,
 * verifica se as horas esperadas foram atingidas, adiciona tempo online e retorna a relação,
 * horas utilizadas / horas esperadas.
 * <p>
 * @author Bruno Rodrigues Ramos
 */
public class RegistroTempoOnline {
    /**
     * Recebe uma Stringa que representa o nome da disciplina.
     */
    private String nomeDisciplina;
    /**
     * Recebe um int que representa o tempo esperado online. Se não for passado nenhum valor
     * o valor padrão vai ser 120.
     */
    private int tempoOnlineEsperado;
    /**
     * Recebe um int que representa horas utilizadas na disciplina, sendo acumuladas na variável.
     */
    private int tempoUtilizado;
    /**
     * Construtor que recebe apenas o nome da disciplina e atrubui o valor padrão int 120 a variável tempoOnlineEsperado.
     * @param nomeDisciplina
     */
    public RegistroTempoOnline (String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
    }

    /**
     * Construtor que recebe o nome da disciplina e o número de horas esperadas para a mesma.
     * @param nomeDisciplina
     * @param tempoOnlineEsperado
     */
    public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * Recebe um int que representa horas utilizadas na disciplina e acumula esse valor ao acumulador tempoUtilizado.
     * @param tempo
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoUtilizado += tempo;
    }

    /**
     * Verifica se o número de horas utilizadas na disciplina é maior ou igual ao número de horas esperadas.
     * @return boolean (tempoUtilizado >= tempoOnlineEsperado)
     */
    public boolean atingiuMetaTempoOnline() {
        return tempoUtilizado >= tempoOnlineEsperado;
    }

    /**
     * Retorna uma String com o nome da disciplina e a relação de horas utilizadas / horas esperadas
     * @return String (nomeDaDisciplina tempoUtilizado / tempoOnlineEsperado)
     */
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoUtilizado + "/" + this.tempoOnlineEsperado;
    }
}
