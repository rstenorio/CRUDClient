package com.crud.crudClient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crudClient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
