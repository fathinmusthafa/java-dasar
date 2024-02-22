package programmerzamannow.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programmerzamannow.jpa.entity.*;
import programmerzamannow.jpa.util.JpaUtil;

public class EmbeddedTest {

    @Test
    void embeddedTest() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        Name name = new Name();
        name.setTitle("Mr");
        name.setFirstName("Fathin");
        name.setMiddleName("Musthafa");
        name.setLastName("Habiburrahman");

        Member member = new Member();
        member.setEmail("fathin@gmail.com");
        member.setName(name);

        entityManager.persist(member);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void embeddedIdTest() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        DepartementId id = new DepartementId();
        id.setCompanyId("pzn");
        id.setDepartementId("tech");

        Departement departement = new Departement();
        departement.setId(id);
        departement.setName("Teknologi");

        entityManager.persist(departement);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void embeddedIdFindTest() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        DepartementId id = new DepartementId();
        id.setCompanyId("pzn");
        id.setDepartementId("tech");

        Departement departement = entityManager.find(Departement.class, id);
        Assertions.assertEquals("Teknologi", departement.getName());

        entityTransaction.commit();
        entityManager.close();
    }
}
