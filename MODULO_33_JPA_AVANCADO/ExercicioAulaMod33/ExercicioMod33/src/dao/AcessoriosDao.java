package dao;

import domain.Acessorios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AcessoriosDao implements IAcessoriosDao{
    @Override
    public Acessorios cadastrar(Acessorios acessorios) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("JPA");//Nome do Persistence, é o mesmo que está no meu arquiv xml na parta META-INF
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(acessorios);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


        return acessorios;
    }

    @Override
    public Acessorios buscarAccCarro(Long id) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT m FROM Marca m ");
        sb.append("INNER JOIN Carro c on c = m.carro ");
        sb.append("WHERE c.codigo = :codigoCarro");

        entityManager.getTransaction().begin();
        TypedQuery<Acessorios> query =
                entityManager.createQuery(sb.toString(), Acessorios.class);
        Object codigo = null;
        query.setParameter("codigoCurso", codigo);
        Acessorios marca = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return marca;
    }
    }


