package com.globomatics.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globomatics.bike.models.Bike;

public interface IBikeRepository extends JpaRepository<Bike, Long>{

}
