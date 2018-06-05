package br.com.gx2.curso.servico.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.gx2.curso.servico.entities.Movie;

public interface MovieRepository extends MongoRepository<Movie, Integer> {

}
