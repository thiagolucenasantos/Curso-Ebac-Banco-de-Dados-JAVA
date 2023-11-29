import main.br.com.thiago.domain.Produto;
import main.dao.IProdutoDao;
import main.dao.ProdutoDao;
import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {
    private IProdutoDao produtoDao;
    public ProdutoTest(){
        produtoDao = new ProdutoDao();

        @Test
        public void cadastrar(){
            Produto produto = new Produto();
            produto.setCodigo("B1");
            produto.setNome("Arroz");
            produto.setValor(25.00);
            produto = produtoDao.cadastrar(produto);

            Assert.assertNotNull(produto);
            Assert.assertNotNull(produto.getCodigo());
        }
    }
}
