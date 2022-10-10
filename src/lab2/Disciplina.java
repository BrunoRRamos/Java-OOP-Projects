package lab2;
import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private double[] notas =  new double[4];
    private int horasDisciplina;
    private double somaNotas = 0;
    private double mediaDisciplina;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas) {
        this.horasDisciplina += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public boolean aprovado() {
        for (double nota : notas) {
            somaNotas += nota;
        }
        mediaDisciplina = somaNotas / notas.length;
        somaNotas = 0;
        return mediaDisciplina >= 7;
    }


    public String toString() {
        for (double nota : notas) {
            somaNotas += nota;
        }
        mediaDisciplina = somaNotas / notas.length;
        somaNotas = 0;
        return this.nomeDisciplina + " " + this.horasDisciplina + " " + this.mediaDisciplina + " " + Arrays.toString(notas);
    }
}
