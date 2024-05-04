package com.papirus.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.papirus.entites.Emprunt;
import com.papirus.services.EmpruntService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("emprunt")
@RestController
public class EmpruntController {

    private final EmpruntService empruntService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void creer(@RequestBody Emprunt emprunt){
        this.empruntService.creer(emprunt);
    }

}
