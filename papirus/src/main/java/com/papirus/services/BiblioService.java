package com.papirus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.papirus.entites.Bibliothecaire;
import com.papirus.repository.BiblioRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BiblioService {

    private final BiblioRepository biblioRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void creer (Bibliothecaire bibliothecaire){
        // Chiffrer le mot de passe avec Bcrypt
        String motDePasseChiffre = passwordEncoder.encode(bibliothecaire.getMdp());
        bibliothecaire.setMdp(motDePasseChiffre);
        this.biblioRepository.save(bibliothecaire);
    }

    // la methode de suppression
    public void supprimer(Integer id) {
        biblioRepository.deleteById(id);
    }

}
