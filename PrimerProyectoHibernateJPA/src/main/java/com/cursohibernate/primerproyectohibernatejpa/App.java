package com.cursohibernate.primerproyectohibernatejpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PrimerProyectoHibernateJPA");

		EntityManager em = emf.createEntityManager();

		User user = new User();
		user.setId(1);
		user.setUsername("Andres");
		user.setUserMensagge("Mensaje hello word JPA");

		User user2 = new User();
		user2.setId(2);
		user2.setUsername("Juan");
		user2.setUserMensagge("Otro hello word JPA");
		
		em.getTransaction().begin();
		
		em.persist(user);
		em.persist(user2);
		
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
