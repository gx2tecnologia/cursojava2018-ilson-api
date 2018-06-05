package br.com.gx2.curso.servico.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// import org.springframework.data.mongodb.repository.MongoRepository;

// @Entity
public class Movie{

    public Movie(String title, String writer, Integer year, String franchise, String synopsis){
        this.title = title;
        this.writer = writer;
        this.year = year;
        this.franchise = franchise;
        this.synopsis = synopsis;
    }

    public Movie(){}

    @Id
    @Column(name="_id")
    public String id;
    
    public String title;
    public String writer;
    public Integer year;
    public String franchise;
    public String synopsis;

    public List<String> actors;

}