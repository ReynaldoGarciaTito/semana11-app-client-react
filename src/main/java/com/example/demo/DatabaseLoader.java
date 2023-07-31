package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class DatabaseLoader implements CommandLineRunner { 

	private final TortaRepository repository;

	@Autowired 
	public DatabaseLoader(TortaRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception { 
		this.repository.save(new Torta("Torta mixta", "3 leches", "Manjar, Leches"));
	}
}