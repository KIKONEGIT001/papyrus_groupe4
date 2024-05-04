package com.papirus.repository;

import org.springframework.data.repository.CrudRepository;


import com.papirus.entites.Etudiant;

public interface EtudiantRepository extends CrudRepository<Etudiant, Integer> {

}
