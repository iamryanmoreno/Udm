package jar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jar");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        
        Student s = new Student();
        s.setAge(30);
        s.setName("Daniel");
        
        entityManager.persist(s);
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();
    }
}
