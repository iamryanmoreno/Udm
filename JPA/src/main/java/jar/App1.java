package jar;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;

/**
 * Hello world!
 *
 */
public class App1 
{
    public static void main( String[] args )
    {
         
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jar");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        
        //31 JPQL
        /*
        Person1 p1 =  new Person1("ryan",24);
        Person1 p2 =  new Person1("joel",34);
        Person1 p3 =  new Person1("Adam",24);
        Person1 p4 =  new Person1("Nicole",18);
        
        entityManager.persist(p1);
        entityManager.persist(p2);
        entityManager.persist(p3);
        entityManager.persist(p4);
        entityManager.getTransaction().commit();
        
        */
        //via entity
        //Query query = entityManager.createQuery("SELECT p FROM Person1 p");
        //Query query = entityManager.createQuery("SELECT p FROM Person1 p WHERE p.age >=30");
        //Query query = entityManager.createQuery("SELECT p FROM Person1 p WHERE p.name LIKE '%el'");
        //Query query = entityManager.createQuery("SELECT p FROM Person1 p WHERE p.age BETWEEN 20 AND 30");
        //Query query = entityManager.createQuery("SELECT p FROM Person1 p ORDER BY p.age ASC");
        //Query query = entityManager.createQuery("SELECT p FROM Person1 p ORDER BY p.age DESC");
        //Query query = entityManager.createQuery("SELECT p FROM Person1 p ORDER BY p.name DESC");
        
        //Creating native query -- but not efficient and not elegant
        Query query = entityManager.createNativeQuery("SELECT * FROM PERSON_TABLE1 WHERE age<30", Person1.class);
        List<Person1> people = (List<Person1>) query.getResultList();
        	
        for(Person1 p: people) {
        	System.out.println(p);
        }
        
        
        entityManager.close();
        entityManagerFactory.close();
    }
}
