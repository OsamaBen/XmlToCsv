package com.benbaha.osama.batch;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.benbaha.osama.entities.Personne;


@Service
public class PersonWriter implements ItemWriter<Personne>{

	private SessionFactory sessionFactory;
	
	public PersonWriter() {	}
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Transactional
	@Override
	public void write(List<? extends Personne> liste) throws Exception 
	{
		Session s = sessionFactory.getCurrentSession();
		for(Personne p : liste)
		{
			System.out.println(p.toString());
			s.saveOrUpdate(p);
		}
	}

}
