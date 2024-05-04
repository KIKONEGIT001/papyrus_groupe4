package com.papirus.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.papirus.entites.Bibliothecaire;
import com.papirus.services.BiblioService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("bibliothecaire")
@RestController
public class BiblioController {
    private final BiblioService biblioService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void creer(@RequestBody Bibliothecaire bibliothecaire){
        this.biblioService.creer(bibliothecaire);
    }

@DeleteMapping("/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void supprimer(@PathVariable Integer id) {
    this.biblioService.supprimer(id);
}
}
