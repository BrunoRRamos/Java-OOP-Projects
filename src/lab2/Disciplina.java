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
     * Acumula a soma de todas as notas da disciplina.
     */
    private double somaNotas = 0;
    /**
     * Recebe a média da disciplina.
     */
    private double mediaDisciplina;
    /**
     * Construtor que recebe como parâmetro uma String que representa o nome da disciplina.
     * Atrubui o parâmetro ao atrubuto nomeDisciplina
     * @param newNomeDisciplina
     */
    public Disciplina(String newNomeDisciplina) {
        this.nomeDisciplina = newNomeDisciplina;
    }
    /**
     *Recebe um valor do tipo int a ser acumulado no atributo horasDisciplina
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
     *Calcula a soma das notas, a média das notas da disciplina e retorna um boleano referente se o aluno foi aprovado ou não.
     * <p>
     *Atribui 0 ao atributo "somaNotas" no fim da execução a fim de possibilitar a mudança da média caso alguma nota mude.
     * @return boolean mediaDisciplina >= 7
     */
    public boolean aprovado() {
        for (double nota : notas) {
            somaNotas += nota;
        }
        mediaDisciplina = somaNotas / notas.length;
        somaNotas = 0;
        return mediaDisciplina >= 7;
    }
    /**
     * Calcula a soma das notas da disciplina, a média da disciplina e retorna uma String com o nome da disciplina,
     * horas utilizadas na disciplina, média na disciplina e o array das notas.
     * <p>
     * Atribui 0 ao atributo "somaNotas" no fim da execução a fim de possibilitar a mudança da média caso alguma nota mude.
     * @return String (nomeDisciplina, horasDisciplina, mediaDisciplina, notas)
     */
    public String toString() {
        for (double nota : notas) {
            somaNotas += nota;
        }
        mediaDisciplina = somaNotas / notas.length;
        somaNotas = 0;
        return this.nomeDisciplina + " " + this.horasDisciplina + " " + this.mediaDisciplina + " " + Arrays.toString(notas);
    }
}
