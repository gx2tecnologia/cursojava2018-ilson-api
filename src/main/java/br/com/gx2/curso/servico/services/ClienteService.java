package br.com.gx2.curso.servico.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gx2.curso.servico.entities.Cliente;
import br.com.gx2.curso.servico.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente vote(Integer id){
        Cliente cliente = clienteRepository.findById(id).get();

        System.out.println(cliente.votos);

        cliente.votos++;
        
        clienteRepository.save(cliente);

        return cliente;
    }

}