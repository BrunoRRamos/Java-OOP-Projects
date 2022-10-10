package lab2;

public class Descanso {
    private int numeroDeSemanas;
    private int numeroDeHoras;
    private String statusAluno = "cansado";

    public void defineNumeroSemanas(int numeroDeSemanas) {
        this.numeroDeSemanas = numeroDeSemanas;
    }

    public void defineHorasDescanso(int getNumeroDeHoras) {
        this.numeroDeHoras = getNumeroDeHoras;
    }

    public String getStatusGeral() {
        if (numeroDeSemanas >= 1 && (numeroDeHoras / numeroDeSemanas) >= 26) {
            this.statusAluno = "descansado";
        } else {
            this.statusAluno = "cansado";
        }
        return statusAluno;
    }
}
