package br.com.gx2.curso.servico.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gx2.curso.servico.entities.Cliente;
import br.com.gx2.curso.servico.repository.ClienteRepository;

@RestController
public class ClienteController{

    @Autowired
    private ClienteRepository clienteRepository;

    // @RequestMapping(path="/Clientes", method=RequestMethod.GET)
    // List<Cliente> list(){
    //     return clienteRepository.findAll();
    // }
    
    @RequestMapping(path="/Clientes/{id}", method=RequestMethod.GET)
    Cliente findById(@PathVariable Integer id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @RequestMapping(path="/Clientes", method=RequestMethod.POST)
    Cliente save(@RequestBody Cliente cliente){
        Cliente saved = clienteRepository.save(cliente);
        return saved;
    }

    @RequestMapping(path="/Clientes", method=RequestMethod.GET)
    List<Cliente> filterByNome(@RequestParam(required=false) String nome){
        if(nome != null)
            return clienteRepository.findByNome(nome);
        return clienteRepository.findAll();
    }


}