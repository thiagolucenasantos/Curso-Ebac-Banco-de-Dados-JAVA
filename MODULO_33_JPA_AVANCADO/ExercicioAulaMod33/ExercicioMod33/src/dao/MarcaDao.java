package dao;

import domain.Carro;
import domain.Marca;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MarcaDao implements IMarcaDao {
    @Override
    public Marca cadastrar(Marca marca) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("JPA");//Nome do Persistence, é o mesmo que está no meu arquiv xml na parta META-INF
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(marca);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


        return marca;
    }
}

