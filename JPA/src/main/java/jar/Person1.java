package jar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//CRUD Operations

@Entity
@Table(name="PERSON_TABLE1")
//@NamedQuery(name="person1.getAll", query="SELECT p FROM Person1 p")

@NamedQueries({ @NamedQuery(name="person1.getAll", query="SELECT p FROM Person1 p"),
	//@NamedQuery(name="person1.getPersonById", query="SELECT p FROM Person1 p WHERE p.id = :id")})
@NamedQuery(name="person1.getPersonByName", query="SELECT p FROM Person1 p WHERE p.name = :name")})
 
public class Person1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	
	public Person1() {
		
	}
	
	
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setEmail(int age) {
		this.age = age;
	}

	public String toString() {
		return this.name +" - "+this.age;
	}
}
