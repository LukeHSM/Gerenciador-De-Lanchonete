package dev.lucasmartins.LanchoneteManager.menu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class menuController {

    // Adicionar item - Create - POST

    // Buscar todos - Read - GET
    @GetMapping("/buscar")
    public String mostrarMenu(){return "Mostrando itens do cardápio...";}

    // Buscar item por ID - Read - GET
    @GetMapping("/buscar/{id}")
    public String mostrarItem(@PathVariable Long id){return "Mostrando item: " + id + "...";}

    // Atualizar item - Update - PUT

    // Deletar item - Delete - DELETE

}
