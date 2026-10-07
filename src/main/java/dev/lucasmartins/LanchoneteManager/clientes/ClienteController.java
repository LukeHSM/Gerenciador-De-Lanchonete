package dev.lucasmartins.LanchoneteManager.clientes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    // Adicionar item - Create - POST

    // Buscar todos - Read - GET
    @GetMapping("/buscar")
    public String mostrarClientes(){return "Mostrando lista de clientes...";}

    // Buscar item por ID - Read - GET
    @GetMapping("/buscar/{id}")
    public String mostrarCliente(@PathVariable Long id){return "Mostrando cliente: " + id + "...";}

    // Atualizar item - Update - PUT

    // Deletar item - Delete - DELETE

}
