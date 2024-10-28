package dev.java10x.CadastroDeNinjas.Missoes;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;



import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String dificuldade;

    // @OneToMany uma missão pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;



}
