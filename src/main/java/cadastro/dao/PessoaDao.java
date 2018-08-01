package cadastro.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import cadastro.entity.HibernateUtil;
import cadastro.entity.Pessoa;

public class PessoaDao {

	
	public void addPessoa(Pessoa pessoa) {
		Session s = HibernateUtil.getSessionFactory().openSession();
//		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		s.beginTransaction();
		s.save(pessoa);
		s.getTransaction().commit();
		s.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> listPessoa() {
		List<Pessoa> list = new ArrayList<Pessoa>();
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		list = s.createQuery("from.pessoa").list();
		s.getTransaction().commit();
		s.close();
		return list;
	}
	
	public void removePessoa(Integer id) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		Pessoa c = (Pessoa) s.load(Pessoa.class, id);
		s.delete(c);
		s.getTransaction().commit();
		s.close();
	}
	
	public void updatePessoa(Pessoa pessoa) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		s.update(pessoa);
		s.getTransaction().commit();
		s.close();
	}
	
}
