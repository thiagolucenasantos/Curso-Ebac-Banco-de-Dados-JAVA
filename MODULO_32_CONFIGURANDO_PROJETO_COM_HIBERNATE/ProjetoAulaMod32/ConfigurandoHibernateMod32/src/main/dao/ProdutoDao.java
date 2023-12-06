package main.dao;

import main.br.com.thiago.domain.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProdutoDao implements IProdutoDao{

    @Override
    public Produto cadastrar(Produto produto) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");//Nome do Persistence, é o mesmo que está no meu arquiv xml na parta META-INF
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


        return produto;
    }
}
