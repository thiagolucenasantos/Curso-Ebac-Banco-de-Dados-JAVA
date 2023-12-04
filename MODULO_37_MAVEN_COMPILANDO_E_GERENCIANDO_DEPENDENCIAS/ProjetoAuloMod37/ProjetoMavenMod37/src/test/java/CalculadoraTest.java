import br.com.thiago.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testSoma(){
        Calculadora calculadora = new Calculadora();
        calculadora.setA(2d);
        calculadora.setB(2d);
//        double soma = calculadora.getA() + calculadora.getB();
        Assert.assertEquals(4.0, calculadora.soma(),0.001 );

    }
}
