package com.papirus.services;

import org.springframework.stereotype.Service;


import com.papirus.entites.Emprunt;

import com.papirus.repository.EmpruntRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EmpruntService {

    private final EmpruntRepository empruntRepository;

    public void creer (Emprunt emprunt){
        this.empruntRepository.save(emprunt);
    }

}
