package cadastro.entity;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	private static SessionFactory sessionFactory;

	static SessionFactory buildSessionFactory() {			
		try	{
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			System.out.println("Constroi");
			return sessionFactory;
		}catch (Throwable ex){
			System.out.println("Erro na Conexao:  ");
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}
		
	public static SessionFactory getSessionFactory(){
		if (sessionFactory ==  null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}
			
}