package lab2;

public class Descanso {
    private int numeroDeSemanas;
    private int NumeroDeHoras;

    public void defineNumeroSemanas(int numeroDeSemanas) {
        this.numeroDeSemanas = numeroDeSemanas;
    }

    public void defineHorasDescanso(int getNumeroDeHoras) {
        this.NumeroDeHoras = getNumeroDeHoras;
    }

    public String getStatusGeral() {
        try {
            if ((NumeroDeHoras / numeroDeSemanas) < 26) {
                return "cansado";
            }
        } catch (Exception e) {
            return "cansado";
        }
        return "descansado";
    }
}
