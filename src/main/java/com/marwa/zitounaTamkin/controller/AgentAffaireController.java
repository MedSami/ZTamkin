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

import com.marwa.zitounaTamkin.dao.AgentAffaireRepository;
import com.marwa.zitounaTamkin.entities.AgentAffaire;

@RestController
public class AgentAffaireController {

	@Autowired
	private AgentAffaireRepository agentAffaireRepo;
	
	

	@GetMapping("/agentAffaires")
	public List<AgentAffaire> allAgentAffaires(){
		return agentAffaireRepo.findAll();
	}
	
	@GetMapping("/agentAffaires/{id}")
	public AgentAffaire retrieveAgentAffaire(@PathVariable long id) {
		Optional<AgentAffaire> agentAffaire = agentAffaireRepo.findById(id);

		return agentAffaire.get();
	}
	
	@DeleteMapping("/agentAffaires/{id}")
	public void deleteAffaire(@PathVariable long id) {
		agentAffaireRepo.deleteById(id);
	}
	
	@PostMapping("/agentAffaires")
	public AgentAffaire createAgentAffaire(@RequestBody AgentAffaire agentAffaire) {
		AgentAffaire saveAgentAffaire = agentAffaireRepo.save(agentAffaire);

		/*URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(saveClient.getId()).toUri();
*/
		return saveAgentAffaire;

	}
	
	
	@PutMapping("/agentAffaires/{id}")
	public AgentAffaire updateAgentAffaire(@RequestBody AgentAffaire agentAffaire) {

		
		return agentAffaireRepo.save(agentAffaire);

	}

}
