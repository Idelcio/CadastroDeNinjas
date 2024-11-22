package dev.java10x.CadastroDeNinjas.Missoes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {


    private MissoesService missoesService;

    @Autowired
    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // GET -- mandar uma requisisão para mostrar as missoes

    // Mostrar todas as missoes
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
       return missoesService.listarMissoes();
    }

    // Mostrar missoes po ID

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissaoPorId(@PathVariable Long id) {
        return missoesService.listarMissaoPorId(id);
    }

    // POST -- mandar uma requisisão para criar as missoes

    // Criar uma missão
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao ){
        return missoesService.criarMissao(missao);
    }


    // PUT -- mandar uma requisisão para alterar as missoes

    @PutMapping("/alterar")
    public String alterarMissao(){

        return "Missão alterada com sucesso";
    }

    // DELETE -- mandar uma requisisão para deletar as missoes
    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id){
        missoesService.deletarMissaoPorId(id);
    }

}
