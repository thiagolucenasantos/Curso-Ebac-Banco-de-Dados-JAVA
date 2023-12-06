import dao.CarroDao;
import dao.ICarroDao;
import domain.Carro;
import org.junit.Assert;
import org.junit.Test;

public class CarroTest {
    private ICarroDao carroDao;
    public CarroTest() {
        carroDao = new CarroDao();
    }
        
        @Test
        public void cadastrar(){
            Carro carro = new Carro();
            carro.setCodigo("1");
            carro.setCarro("Brasilia");
            carro = carroDao.cadastrar(carro);

            Assert.assertNotNull(carro);
            Assert.assertNotNull(carro.getCodigo());
        }
    }

