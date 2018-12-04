package com.benbaha.osama.batch;



import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.benbaha.osama.entities.Personne;


@Service
public class PersonProcessor implements ItemProcessor<Personne, Personne>{

	public PersonProcessor() {	}

	@Override
	public Personne process(Personne p) throws Exception 
	{
		Personne pers = null; 
		if(p.getCivilite().equals("M"))
			pers=p;
		
		return pers;
	}

}
