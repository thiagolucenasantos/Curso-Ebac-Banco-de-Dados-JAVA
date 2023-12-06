import main.br.com.thiago.domain.Curso;
import main.dao.CursoDao;
import main.dao.ICursoDao;
import org.junit.Test;


import static org.junit.Assert.assertNotNull;

public class CustoTest1 {
    private ICursoDao cursoDao;
    public CustoTest1(){
        cursoDao = new CursoDao();
    }

  @Test
    public void cadastrar() {
      Curso curso = new Curso();
      curso.setCodigo("A1");
      curso.setNome("Curso de Java");
      curso.setDescricao("Curso Java BackEnd");
      curso = cursoDao.cadastrar(curso);

      assertNotNull(curso);
      assertNotNull(curso.getCodigo());



    }
}

