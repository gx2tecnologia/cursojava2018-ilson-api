package br.com.gx2.curso.servico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.gx2.curso.servico.entities.Movie;
import br.com.gx2.curso.servico.repository.MovieRepository;

@RestController
@RequestMapping(path="/api/movies")
public class MovieController{

    @Autowired 
    private MovieRepository movieRepository;

    @RequestMapping(method=RequestMethod.POST)
    Movie save(@RequestBody Movie movie){
        Movie saved = movieRepository.save(movie);
        return saved;
    }
}