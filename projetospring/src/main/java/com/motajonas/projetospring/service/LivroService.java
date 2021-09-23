package com.motajonas.projetospring.service;

import com.motajonas.projetospring.dto.LivrosDTO;
import com.motajonas.projetospring.dto.MessageResponseDTO;
import com.motajonas.projetospring.entity.Livros;
import com.motajonas.projetospring.mapper.LivroMapper;
import com.motajonas.projetospring.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.awt.print.Book;

@Service
public class LivroService {

    private final LivroMapper livroMapper  = LivroMapper.INSTANCE;;

    private LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public MessageResponseDTO create (LivrosDTO livrosDTO){
        Livros livroToSave = livroMapper.toModel(livrosDTO);

        Livros savedlivro =  livroRepository.save(livroToSave);
        return MessageResponseDTO.builder()
                .message("Livro criado com ID" + savedlivro.getId())
                .build();


    }
}
