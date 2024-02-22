package programmerzamannow.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import programmerzamannow.jpa.entity.Customer;
import programmerzamannow.jpa.entity.Member;
import programmerzamannow.jpa.entity.Name;
import programmerzamannow.jpa.util.JpaUtil;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionTest {

    @Test
    void createList() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        Name name = new Name();
        name.setFirstName("Fathin");
        name.setMiddleName("Musthafa");
        name.setLastName("Habiburrahman");

        Member member = new Member();
        member.setEmail("test@gmail.com");
        member.setName(name);

        member.setHobbies(new ArrayList<>());
        member.getHobbies().add("Coding");
        member.getHobbies().add("Gaming");

        entityManager.persist(member);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void updateList() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        Member member = entityManager.find(Member.class, 2);

        member.getHobbies().add("Traveling");

        entityManager.persist(member);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void updateMapSkills() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        Member member = entityManager.find(Member.class, 2);
        member.setSkills(new HashMap<>());
        member.getSkills().put("Java", 90);
        member.getSkills().put("Golang", 90);
        member.getSkills().put("PHP", 85);

        entityManager.persist(member);

        entityTransaction.commit();
        entityManager.close();
    }
}
