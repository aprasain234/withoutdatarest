package com.ashish.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;		
import com.ashish.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> { 
	

}
