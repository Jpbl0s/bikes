package com.globomatics.bike.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.IBikeRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

	@Autowired
	private IBikeRepository ibikeRepository;

	@GetMapping
	public List<Bike> list() {

		log.info("[BIKE]- Obtaining data from request");
		return ibikeRepository.findAll();

	}

	@GetMapping("/{id}")
	public Bike getBike(@PathVariable Long id) {
		log.info("[BIKE]- Obtaining data from {}" + id);
		return ibikeRepository.getOne(id);
	}

	@PostMapping("/create")
	public Bike createBike(@RequestBody Bike bike) {
		log.info("[BIKE]- Savind Bike {}" + bike);
		return ibikeRepository.save(bike);
	}

	@PutMapping("/{id}")
	public Bike updateBike(@RequestBody Bike bike, @PathVariable Long id) {
		Optional<Bike> optBike = ibikeRepository.findById(id);
		if (optBike != null) {
			ibikeRepository.saveAndFlush(bike);
			log.info("[BIKE]- Updating bike " + bike);
		}

		return bike;

	}

	@DeleteMapping("/{id}")
	public void deleteBike(@PathVariable Long id) {

		ibikeRepository.deleteById(id);
		log.info("[BIKE]- Deleting bike " + id);

	}

}
