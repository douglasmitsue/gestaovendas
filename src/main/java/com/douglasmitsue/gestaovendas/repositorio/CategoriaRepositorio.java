package com.douglasmitsue.gestaovendas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasmitsue.gestaovendas.entidades.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long>{

	Categoria findByNome(String nome);
}
