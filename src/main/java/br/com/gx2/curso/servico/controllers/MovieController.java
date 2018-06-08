package br.com.gx2.curso.servico.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(method=RequestMethod.GET)
    List<Movie> getAll(){
        List<Movie> movieList = movieRepository.findAll();
        return movieList;
    }

    @RequestMapping(path="/{id}", method=RequestMethod.GET)
    Movie get(@PathVariable String id ){
        Optional<Movie> op = movieRepository.findById(id);
        Movie movie = null;
        op.orElse(movie);
        return op.get();
    }

    @RequestMapping(method=RequestMethod.POST)
    Movie save(@RequestBody Movie movie){
        Movie saved = movieRepository.save(movie);
        return saved;
    }

    @RequestMapping(path="/all", method=RequestMethod.POST)
    List<Movie> saveAll(@RequestBody List<Movie> movie){
        List<Movie> moviesSaved = movieRepository.saveAll(movie);
        return moviesSaved;
    }
}