package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {


    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira messagem nessa rota!";
    }



    // adicionar ninjas (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }

    // mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostraTodosOsNinjas(){
        return "Mostrar todos os Ninjas";
    }

    // MOSTRAR NINJA POR ID (READ)
    @GetMapping("/todosID")
    public String mostraTodosOsNinjasPorId(){
        return "Mostrar Ninjas por ID";
    }

    // alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar ninja por id";
    }


    //deletar ninjas  (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por ID";
    }

}
