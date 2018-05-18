package br.com.gx2.curso.servico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.gx2.curso.servico.entities.Cliente;
import br.com.gx2.curso.servico.services.ClienteService;

@RestController
@RequestMapping(path="/api/clientes")
public class ClienteController{

    @Autowired 
    private ClienteService clienteService;
    
    // @RequestMapping(path="/{id}", method=RequestMethod.GET)
    // Cliente findById(@PathVariable Integer id){
    //     Optional<Cliente> cliente = clienteRepository.findById(id);
    //     return cliente.get();
    // }

    // @RequestMapping(method=RequestMethod.POST)
    // Cliente save(@RequestBody Cliente cliente){
    //     Cliente saved = clienteRepository.save(cliente);
    //     return saved;
    // }

    // @RequestMapping(method=RequestMethod.GET)
    // List<Cliente> filterByNome(@RequestParam(required=false) String nome){
    //     if(nome != null)
    //         return clienteRepository.findByNome(nome);
    //     return clienteRepository.findAll();
    // }

    @RequestMapping(path="/{id}/vote", method=RequestMethod.POST)
    Cliente sayHelloBody(@PathVariable Integer id){
        Cliente saved = clienteService.vote(id);
        return saved;
    }
}