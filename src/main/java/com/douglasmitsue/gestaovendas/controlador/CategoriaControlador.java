package com.douglasmitsue.gestaovendas.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglasmitsue.gestaovendas.entidades.Categoria;
import com.douglasmitsue.gestaovendas.servico.CategoriaServico;

@RestController
@RequestMapping("/categoria")
public class CategoriaControlador {

	@Autowired
	private CategoriaServico categoriaServi1co;
	
	@GetMapping
	public List<Categoria> listarTodas(){
		return categoriaServi1co.listarTodas();
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Optional<Categoria>> buscarPorId(@PathVariable Long codigo){
		 Optional<Categoria> categoria = categoriaServi1co.buscarPorId(codigo);
		 return categoria.isPresent() ? ResponseEntity.ok(categoria) : ResponseEntity.notFound().build();
	}
}
