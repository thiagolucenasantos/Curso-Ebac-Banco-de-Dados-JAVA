import dao.AcessoriosDao;
import dao.IAcessoriosDao;
import domain.Acessorios;
import org.junit.Assert;
import org.junit.Test;

public class AcessoriosTest {

    private IAcessoriosDao acessoriosDao;

    public AcessoriosTest(){
        acessoriosDao = new AcessoriosDao();
    }
    @Test
    public void cadastrar(){
        Acessorios acessorios = new Acessorios();
        acessorios.setCodigo("1");
        acessorios.setNome("Parafuso de roda");
        acessorios = acessoriosDao.cadastrar(acessorios);

        Assert.assertNotNull(acessorios);
        Assert.assertNotNull(acessorios.getId());

        Acessorios acessBD = acessoriosDao.buscarAccCarro(acessorios.getId());
        Assert.assertNotNull(acessBD);
        Assert.assertEquals(acessorios.getId(), acessBD.getId());

    }
}
