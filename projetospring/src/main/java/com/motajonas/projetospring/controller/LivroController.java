package com.motajonas.projetospring.controller;

import com.motajonas.projetospring.dto.LivrosDTO;
import com.motajonas.projetospring.dto.MessageResponseDTO;
import com.motajonas.projetospring.entity.Livros;
import com.motajonas.projetospring.repository.LivroRepository;
import com.motajonas.projetospring.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroController {

    private LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    public MessageResponseDTO create (@RequestBody @Valid LivrosDTO livrosDTO){
        return livroService.create(livrosDTO);


    }
}
