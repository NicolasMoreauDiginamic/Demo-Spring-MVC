package dev.demospringmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.demospringmvc.entites.Plat;


public interface PlatRepository extends JpaRepository<Plat, Integer> {

}
