import java.util.ArrayList;
import java.util.List;

public class Troco {
    private int saldo;
    private List<Integer> notas;

    public Troco(int saldo) {
        this.saldo = saldo;
        this.notas = new ArrayList<>();
        calcularTroco();
    }

    private void calcularTroco() {
        int[] valoresNota = {100, 50, 20, 10, 5, 2, 1}; // Valores das notas
        int valorRestante = saldo;

        for (int valor : valoresNota) {
            while (valorRestante >= valor) {
                notas.add(valor);
                valorRestante -= valor;
            }
        }
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public int getSaldo() {
        return saldo;
    }
}
