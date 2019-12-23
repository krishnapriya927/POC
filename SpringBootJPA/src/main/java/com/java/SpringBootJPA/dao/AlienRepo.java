package com.java.SpringBootJPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.java.SpringBootJPA.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{

}
