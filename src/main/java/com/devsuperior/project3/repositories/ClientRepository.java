package com.devsuperior.project3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.project3.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
