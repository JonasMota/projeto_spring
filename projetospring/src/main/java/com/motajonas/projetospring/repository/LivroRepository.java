package com.motajonas.projetospring.repository;

import com.motajonas.projetospring.entity.Livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livros, Long> {
}
