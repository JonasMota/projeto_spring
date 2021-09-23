package com.motajonas.projetospring.dto;

import com.motajonas.projetospring.entity.Autor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LivrosDTO {


    private Long id;

    @NotBlank
    @Size(max = 200)
    private String nome;

    @NotNull
    private Integer paginas;

    @NotNull
    private Integer capitulos;

    @NotNull
    @Size(max = 100)
    @Pattern(regexp = "^(?:ISBN(?:-10)?:?●)?(?=[0-9X]{10}$|(?=(?:[0-9]+[-●]){3})[-●0-9X]{13}$)↵\n" +
            "[0-9]{1,5}[-●]?[0-9]+[-●]?[0-9]+[-●]?[0-9X]$ ", message = "Deve inserir um formato valido")
    private String isbn;

    @NotBlank
    @Size(max = 200)
    private String nomePublicadora;

    @Valid
    private Autor autor;
}
