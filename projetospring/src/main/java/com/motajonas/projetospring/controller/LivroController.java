package com.motajonas.projetospring.controller;

import com.motajonas.projetospring.dto.MessageResponseDTO;
import com.motajonas.projetospring.entity.Livros;
import com.motajonas.projetospring.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroController {

    private LivroRepository livroRepository;

    @Autowired
    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @PostMapping
    public MessageResponseDTO create (@RequestBody Livros livros){
      Livros savedlivro =  livroRepository.save(livros);
      return MessageResponseDTO.builder().message("Livro criado com ID" + savedlivro.getId())
              .build();

    }
}
