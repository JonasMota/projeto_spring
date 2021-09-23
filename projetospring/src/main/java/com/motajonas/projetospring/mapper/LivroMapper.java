package com.motajonas.projetospring.mapper;

import com.motajonas.projetospring.dto.LivrosDTO;
import com.motajonas.projetospring.entity.Livros;
import com.motajonas.projetospring.repository.LivroRepository;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LivroMapper {

    LivroMapper INSTANCE = Mappers.getMapper(LivroMapper.class);

    Livros toModel (LivrosDTO livrosDTO);

    LivrosDTO toDTO (Livros livros);

}
