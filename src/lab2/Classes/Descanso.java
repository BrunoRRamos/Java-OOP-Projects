package lab2.Classes;

/**
 * Gerencia as horas de descanso, realizando a media de descanso por semana; Verifica se há semanas cadastras
 * e se há horas cadastradas.
 * <p>
 *
 * @author Bruno Rodrigues Ramos
 */
public class Descanso {
    /**
     * Recebe o numero de semanas no formato de número inteiro (int).
     */
    private int numeroDeSemanas;
    /**
     * Recebe o numero de horas descansadas no formato de um número inteiro (int).
     */
    private int numeroDeHoras;
    /**
     * Representa o estado do aluno (cansado ou descansado), iniciado como "cansado", mas pode ser modificado pelo
     * médodo getStatusGeral.
     */
    private String statusAluno = "cansado";

    /**
     * Recebe um valor int como argumento e o atribui ao atributo numeroSemanas da classe Descanso.
     * <p>
     * Funciona como um Setter
     * @param numeroDeSemanas
     */
    public void defineNumeroSemanas(int numeroDeSemanas) {
        this.numeroDeSemanas = numeroDeSemanas;
    }

    /**
     * Recebe um valor int como argumento e o atribui ao atributo numeroDeHoras da classe Descanso.
     * <p>
     * Funciona como um Setter
     * @param NumeroDeHoras
     */
    public void defineHorasDescanso(int NumeroDeHoras) {
        this.numeroDeHoras = NumeroDeHoras;
    }

    /**
     * Calcula a média de horas descansadas por semana e se a média de horas for inferior a 26,
     * retorna "cansado", caso o contrário retorna "descansado".
     *
     * @return statusAluno - ("cansado" ou "descansado")
     */
    public String getStatusGeral() {
        if (numeroDeSemanas >= 1 && (numeroDeHoras / numeroDeSemanas) >= 26) {
            this.statusAluno = "descansado";
        } else {
            this.statusAluno = "cansado";
        }
        return statusAluno;
    }
}
