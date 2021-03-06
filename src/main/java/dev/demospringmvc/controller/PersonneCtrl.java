package dev.demospringmvc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.demospringmvc.entites.Personne;

@RestController
@RequestMapping("personnes")
public class PersonneCtrl {
	
	@PostMapping
	public String creerPersonne(@RequestBody Personne personne) {
		return "nom : " + personne.getNom() + " prenom : " + personne.getPrenom() + " adresse : { rue : " + personne.getAdresse().getRue() + " ville : " + personne.getAdresse().getVille() + " }";
	}
}
