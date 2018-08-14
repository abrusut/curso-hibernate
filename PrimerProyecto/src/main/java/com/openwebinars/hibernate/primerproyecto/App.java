package com.openwebinars.hibernate.primerproyecto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Forma vieja (levanta el hibernate.cfg.xml del src/main/resources por defecto
        // SessionFactory sf = new Configuration().configure().buildSessionFactory();
    	
    	StandardServiceRegistry sr = new StandardServiceRegistryBuilder()
    			.configure().build();
    	
    	SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	User user = new User();
    	user.setId(1);
    	user.setUsername("Andres");
    	user.setUserMensagge("Mensaje hello word");
    	
    	User user2 = new User();
    	user2.setId(2);
    	user2.setUsername("Juan");
    	user2.setUserMensagge("Otro hello word");
    	
    	session.save(user);
    	session.save(user2);
    	
    	session.close();
    	sf.close();
    }
}
