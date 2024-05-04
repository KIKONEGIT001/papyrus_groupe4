package com.papirus.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.papirus.entites.Etudiant;
import com.papirus.services.EtudiantService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;




@AllArgsConstructor
@RequestMapping("etudiant")
@RestController
public class EtudiantController {
    private final EtudiantService etudiantService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void creer (@RequestBody Etudiant etudiant){
        this.etudiantService.creer(etudiant);
    }

@DeleteMapping("/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void supprimer(@PathVariable Integer id) {
    this.etudiantService.supprimer(id);
}

    // @Autowired
    // public EtudiantController(EtudiantService etudiantService) {
    //     this.etudiantService = etudiantService;
    // }

    // @GetMapping
    // public List<Etudiant> listerEtudiant() {
    //     return etudiantService.listerEtudiant();
    // }

}
