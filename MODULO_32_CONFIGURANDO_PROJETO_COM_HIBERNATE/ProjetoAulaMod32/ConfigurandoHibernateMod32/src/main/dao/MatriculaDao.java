package main.dao;

import main.br.com.thiago.domain.Matricula;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MatriculaDao implements IMatriculaDao{
    @Override
    public Matricula cadastrar(Matricula mat) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");//Nome do Persistence, é o mesmo que está no meu arquiv xml na parta META-INF
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(mat);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


        return mat;
    }
}
