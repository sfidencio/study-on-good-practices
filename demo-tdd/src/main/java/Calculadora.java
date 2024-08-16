import java.util.Arrays;

public class Calculadora {
    public int somar(int... valores) {
        if(valores.length == 0) {
            throw new IllegalArgumentException("Nenhum valor informado");
        }
        return Arrays.stream(valores).sum();
    }

    public double calcularPotencia(int i) {
        return Math.pow(i, 2);
    }

    public int dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }
}
