package dev.demospringmvc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.demospringmvc.entites.Plat;
import dev.demospringmvc.service.PlatService;

@RestController
@RequestMapping("plats")
public class PlatBDDControler {
	
	private PlatService platServ;

	public PlatBDDControler(PlatService platServ) {
		this.platServ = platServ;
	}
	
	@GetMapping
	public List<Plat> listePlat(){
		return this.platServ.listerPlat();
	}
	
	@PostMapping
	public Plat creerPlat(@RequestBody Plat plat) {
		return this.platServ.newPlat(plat);
	}

}
