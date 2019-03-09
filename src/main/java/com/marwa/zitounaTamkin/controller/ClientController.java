package com.marwa.zitounaTamkin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marwa.zitounaTamkin.dao.ClientRepository;
import com.marwa.zitounaTamkin.entities.Clients;
@RestController
public class ClientController {

	@Autowired
	private ClientRepository clientRepo;
	
	@GetMapping("/clients")
	public List<Clients> allClients(){
		return clientRepo.findAll();
	}
	
	@GetMapping("/clients/{id}")
	public Clients retrieveClient(@PathVariable long id) {
		Optional<Clients> client = clientRepo.findById(id);

			return client.get();
	}
	
	@DeleteMapping("/clients/{id}")
	public void deleteClient(@PathVariable long id) {
		clientRepo.deleteById(id);
	}
	
	@PostMapping("/clients")
	public Clients createClient(@RequestBody Clients client) {
		Clients saveClient = clientRepo.save(client);

		return saveClient;

	}
	
	
	@PutMapping("/clients/{id}")
	public Clients updateClient(@RequestBody Clients client) {

		return clientRepo.save(client);

	}
}
