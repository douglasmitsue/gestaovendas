package com.douglasmitsue.gestaovendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/* Estou configurando essas anotações caso alguma aplicação que eu for desenvolver
não utilize o package principal
*/
@EntityScan(basePackages = {"com.douglasmitsue.gestaovendas.entidades"})
@EnableJpaRepositories(basePackages = {"com.douglasmitsue.gestaovendas.repositorio"})
@ComponentScan(basePackages = {"com.douglasmitsue.gestaovendas.servico", "com.douglasmitsue.gestaovendas.controlador", "com.douglasmitsue.gestaovendas.excecao"})
@SpringBootApplication
public class GestaovendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaovendasApplication.class, args);
	}

}
