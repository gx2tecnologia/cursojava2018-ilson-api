package br.com.gx2.curso.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.gx2.curso.servico.entities.Cliente;
import br.com.gx2.curso.servico.repository.ClienteRepository;

@SpringBootApplication
public class ServicoApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(ServicoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		clienteRepository.deleteAll();
		
		clienteRepository.save(new Cliente("Rafael", 1091238, "1231", "123123", "Rua", "Analista"));

	}
}
