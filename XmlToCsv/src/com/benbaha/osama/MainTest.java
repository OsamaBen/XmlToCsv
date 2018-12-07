package com.benbaha.osama;

import java.io.*;

import javax.xml.bind.*;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.benbaha.osama.entities.Personne;

public class MainTest  {

	public static void main(String[] args) {
		
		try {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("com/benbaha/osama/config/SprConf.xml");
			JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
			Job job = (Job) context.getBean("personneJob");
			jobLauncher.run(job, new JobParameters());
			System.out.println("Done");
//	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			

	}

}
