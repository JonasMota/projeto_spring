package com.motajonas.projetospring.service;

import com.motajonas.projetospring.dto.MessageResponseDTO;
import com.motajonas.projetospring.entity.Livros;
import com.motajonas.projetospring.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LivroService {


    private LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public MessageResponseDTO create (Livros livros){
        Livros savedlivro =  livroRepository.save(livros);
        return MessageResponseDTO.builder().message("Livro criado com ID" + savedlivro.getId())
                .build();


    }
}
