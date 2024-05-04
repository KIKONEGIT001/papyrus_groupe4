package com.papirus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.papirus.entites.Livre;
import com.papirus.repository.LivreRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LivreService {

    
    private final LivreRepository livreRepository;

    public void creer(Livre livre){
        this.livreRepository.save(livre);
    }


    




}
