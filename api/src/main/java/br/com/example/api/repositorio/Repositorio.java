package br.com.example.api.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.example.api.modelo.Pessoa;
@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {
    // Este repositório herda métodos CRUD básicos do CrudRepository
    // Não é necessário implementar nada aqui, o Spring Data JPA cuida disso
    
}
