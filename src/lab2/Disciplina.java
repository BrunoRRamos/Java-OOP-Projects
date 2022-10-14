package lab2;
import java.util.Arrays;

/**
 * Registra o nome e as notas de determinada disciplina,
 * além de calcular sua media e retornar a situação do aluno ("aprovado", "reprovado").
 *<p>
 *
 * @author Bruno Rodrigues Ramos
 */
public class Disciplina {
    /**
     * Recebe uma String que representa o nome da disciplina.
     */
    private String nomeDisciplina;
    /**
     * Instância um array de 4 espaços onde serão armazenadas as respectivas notas da disciplina.
     */
    private double[] notas =  new double[4];
    /**
     * Acumula quantas horas foram dedicadas a disciplina.
     */
    private int horasDisciplina;
    /**
     * Construtor que recebe como parâmetro uma String que representa o nome da disciplina.
     * Atrubui o parâmetro ao atrubuto nomeDisciplina
     * @param newNomeDisciplina
     */
    public Disciplina(String newNomeDisciplina) {
        this.nomeDisciplina = newNomeDisciplina;
    }

    /**
     *Recebe um valor do tipo int a ser acumulado no atributo horasDisciplina.
     * @param horas
     */
    public void cadastraHoras(int horas) {
        this.horasDisciplina += horas;
    }

    /**
     * Recebe uma nota da disciplina e a aloca na devida posição do array "notas".
     * @param nota
     * @param valorNota
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    /**
     *Verifica se a média do aluno é maior ou igual a 7.
     * @return boolean mediaDisciplina >= 7
     */
    public boolean aprovado() {
        return calculaMedia() >= 7;
    }

    /**
     * Calcula a média da disciplina.
     * @return mediaDaDisciplina
     */
    public double calculaMedia() {
        int somaNotas = 0;
        double media;
        for (double nota : notas) {
            somaNotas += nota;
        }
        media = somaNotas / notas.length;
        return media;
    }

    /**
     * Retorna em forma de stringa o nome da disciplina, as horas utilizadas, média e as notas da disciplina.
     * @return String (nomeDisciplina, horasDisciplina, mediaDisciplina, notas)
     */
    public String toString() {
        return this.nomeDisciplina + " " + this.horasDisciplina + " " + calculaMedia() + " " + Arrays.toString(notas);
    }
}
