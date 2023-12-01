import dao.IMarcaDao;
import dao.MarcaDao;
import domain.Marca;
import org.junit.Assert;

public class MarcaTest {

    private IMarcaDao marcaDao;

    public MarcaTest(){
        marcaDao = new MarcaDao();
    }

    public void cadastrar(){
        Marca marca = new Marca();
        marca.setCodigo("1");
        marca.setMarca("Volkswagem");
        marca = marcaDao.cadastrar(marca);

        Assert.assertNotNull(marca);
        Assert.assertNotNull(marca.getCodigo());
    }
}
