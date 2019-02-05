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
        //EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jar");
        
        /*
         * This is for insertion of data into databases - INSERT
         */
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jar");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        
        //Student s = new Student();
        //s.setAge(30);
        //s.setName("Daniel");
        
        //Student s = new Student("ryan",24, "Rizal");
        //Person p1 = new Person("ryan","iamryanmoreno@gmail.com");
        //Person p2 = new Person("joe","joe@gmail.com");
        
        /*
         * READ
         */
        Person p = entityManager.find(Person.class, 5);
        System.out.println(p);
        
        /*
         * DELETE
         */
        
        entityManager.remove(p);
        
        //entityManager.persist(s);
        //entityManager.persist(p1);
        //entityManager.persist(p2);
        //entityManager.persist(p);
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();
    }
}
