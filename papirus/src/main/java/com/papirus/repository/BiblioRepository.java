package com.papirus.repository;

import org.springframework.data.repository.CrudRepository;

import com.papirus.entites.Bibliothecaire;

public interface BiblioRepository extends CrudRepository<Bibliothecaire, Integer> {

}
