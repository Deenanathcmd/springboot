package com.skcet.day4.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day4.model.Fuelstation;

public interface petrolrep extends JpaRepository<Fuelstation, Integer> {

}