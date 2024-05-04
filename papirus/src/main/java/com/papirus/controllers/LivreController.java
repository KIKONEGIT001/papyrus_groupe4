package com.papirus.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.papirus.entites.Livre;
import com.papirus.services.LivreService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("livre")
@RestController
public class LivreController {
    private final LivreService livreService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void creer(@RequestBody Livre livre){
        this.livreService.creer(livre);
    }

// pour recuperer les livres dans la base de données
    // @GetMapping
    // public List<Livre> listerLivres() {
    //     return livreService.listerLivres();
    // }

}
