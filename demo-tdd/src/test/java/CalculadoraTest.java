import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    @DisplayName("Dado que eu tenho 10,20,30 numeros,quando eu somar, então o resultado deve ser 60")
    void dadoQueEuTenho102030NumerosQuandoEuSomarEntaoOResultadoDeveSer60() {
        //Dado
        Calculadora calculadora = new Calculadora();
        //Quando
        int resultado = calculadora.somar(10, 20, 30);

        //Então
        Assertions.assertEquals(60, resultado);
    }

    @Test
    @DisplayName("Dado que eu tenho o numero 2, quando eu calcular potencia, então o resultado deve ser 4")
    void dadoQueEuTenhoONumero2QuandoEuCalcularPotenciaEntaoOResultadoDeveSer4() {
        //Dado
        Calculadora calculadora = new Calculadora();
        //Quando
        double resultado = calculadora.calcularPotencia(2);

        //Então
        Assertions.assertEquals(4, resultado);
    }

    @Test
    @DisplayName("Dado que eu tenho um numero qualquer, quando eu dividir esse numero por qualquer outro numero diferente de zero, então o resultado deve ser um numero")
    void dadoQueEuTenhoUmNumeroQualquerQuandoEuDividirEsseNumeroPorQualquerOutroNumeroDiferenteDeZeroEntaoOResultadoDeveSerUmNumero() {
        //Dado
        Calculadora calculadora = new Calculadora();
        //Quando
        double resultado = calculadora.dividir(10, 2);

        //Então
        Assertions.assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Dado que eu tenho um numero qualquer, quando eu dividir esse numero por zero, então deve lançar uma exceção")
    void dadoQueEuTenhoUmNumeroQualquerQuandoEuDividirEsseNumeroPorZeroEntaoDeveLancarUmaExcecao() {
        //Dado
        Calculadora calculadora = new Calculadora();
        //Quando
        Assertions.assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }

    @Test
    @DisplayName("Dado que eu não tenho nenhum valor, quando eu somar, então deve lançar uma exceção")
    void dadoQueEuNaoTenhoNenhumValorQuandoEuSomarEntaoDeveLancarUmaExcecao() {
        //Dado
        Calculadora calculadora = new Calculadora();
        //Quando
        Assertions.assertThrows(IllegalArgumentException.class, calculadora::somar);
    }



}
