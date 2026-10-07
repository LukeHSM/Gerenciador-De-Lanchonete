package dev.lucasmartins.LanchoneteManager.pedidos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    // Adicionar item - Create - POST

    // Buscar todos - Read - GET
    @GetMapping("/buscar")
    public String mostrarPedidos(){return "Mostrando lista de pedidos...";}

    // Buscar item por ID - Read - GET
    @GetMapping("/buscar/{id}")
    public String mostrarPedido(@PathVariable Long id){return "Mostrando pedido: " + id + "...";}

    // Atualizar item - Update - PUT

    // Deletar item - Delete - DELETE

}
