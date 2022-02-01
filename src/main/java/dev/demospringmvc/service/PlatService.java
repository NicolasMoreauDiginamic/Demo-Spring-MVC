package dev.demospringmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import dev.demospringmvc.entites.Plat;
import dev.demospringmvc.repositories.PlatRepository;

@Service
public class PlatService {

	private PlatRepository platRepo;

	public PlatService(PlatRepository platRepo) {
		this.platRepo = platRepo;
	}
	
	public List<Plat> listerPlat(){
		return this.platRepo.findAll(Sort.sort(Plat.class).by(Plat::getNom));
	}
	
	@Transactional
	public Plat newPlat(Plat plat) {
		return this.platRepo.save(plat);
	}
	
}
