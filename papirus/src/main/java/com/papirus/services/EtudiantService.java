package com.papirus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.papirus.entites.Etudiant;
import com.papirus.repository.EtudiantRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EtudiantService {
    private final EtudiantRepository etudiantRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void creer(Etudiant etudiant){
        // Chiffrer le mot de passe avec Bcrypt
        String motDePasseChiffre = passwordEncoder.encode(etudiant.getMdp());
        etudiant.setMdp(motDePasseChiffre);
        this.etudiantRepository.save(etudiant);
    }

    // la methode de suppression
    public void supprimer(Integer id) {
        etudiantRepository.deleteById(id);
    }


    @Autowired
    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    public Iterable<Etudiant> listerEtudiant() {
        return etudiantRepository.findAll();
    }


}
