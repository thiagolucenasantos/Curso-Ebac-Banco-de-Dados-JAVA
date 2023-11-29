import main.br.com.thiago.domain.Matricula;
import main.dao.IMatriculaDao;
import main.dao.MatriculaDao;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertNotNull;

public class MatriculaTest {

    private IMatriculaDao matriculaDao;
    public MatriculaTest(){
        matriculaDao = new MatriculaDao();
    }
    @Test
    public void cadastrar(){
        Matricula mat = new Matricula();
        mat.setCodigo("A1");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("Ativo");
        mat.setValor(2000d);
        matriculaDao.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());


    }
}
