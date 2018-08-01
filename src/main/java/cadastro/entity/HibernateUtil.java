package cadastro.entity;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

//		private static SessionFactory sessionFactory = null;
	    private static SessionFactory sessionFactory;
		private static Configuration conf;
		
//		private static SessionFactory buildSessionFactory() {
		static SessionFactory buildSessionFactory() {			
		try	{
			
			conf = new Configuration();
			conf.configure("hibernate.cfg.xml");
			System.out.println("Configurou");
			
			ServiceRegistry serviceRegistry;
	        serviceRegistry = new StandardServiceRegistryBuilder()
	                                 .applySettings(conf.getProperties())
	                                 .build();
	        System.out.println("Hibernate serviceRegistry created");
	        
	        sessionFactory = conf.buildSessionFactory(serviceRegistry);			
//			sessionFactory = conf.buildSessionFactory();
			System.out.println("Constroi");
			
			return sessionFactory;
			
		}catch (Throwable ex){
			System.out.println("Erro na Conexão:  ");
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
//		return sessionFactory;
	}
		
	public static SessionFactory getSessionFactory(){
		if (sessionFactory ==  null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}
			
}