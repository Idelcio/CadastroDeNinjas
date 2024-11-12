package dev.java10x.CadastroDeNinjas.Missoes;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    // GET -- mandar uma requisisão para mostrar as missoes
    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missões listadas com sucesso";
    }

    // POST -- mandar uma requisisão para criar as missoes
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso";
    }


    // PUT -- mandar uma requisisão para alterar as missoes
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada com sucesso";
    }

    // DELETE -- mandar uma requisisão para deletar as missoes
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missão deleteda com sucesso";
    }

}
