package com.proyectofinaljava.proyectofinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

import com.proyectofinaljava.proyectofinal.model.Cliente;
import com.proyectofinaljava.proyectofinal.services.ClienteService;

@SpringBootApplication
public class ProyectofinalApplication implements CommandLineRunner {
	@Autowired
	private ClienteService clienteService;

	public ProyectofinalApplication(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProyectofinalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("usando jpa");
	}
	@Bean
	public CommandLineRunner demo() {
		return args -> {
			List<Cliente> clientes = clienteService.getAllClientes();
			clientes.forEach(cliente -> System.out.println(cliente.toString()));
		};
	}

}
