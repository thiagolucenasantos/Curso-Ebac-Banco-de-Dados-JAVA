package dao;

import domain.Carro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarroDao implements ICarroDao {
    @Override
    public Carro cadastrar(Carro carro) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("JPA");//Nome do Persistence, é o mesmo que está no meu arquiv xml na parta META-INF
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(carro);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


        return carro;
    }
    }

