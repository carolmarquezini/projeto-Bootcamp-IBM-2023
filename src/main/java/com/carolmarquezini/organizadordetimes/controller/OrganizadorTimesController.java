package com.carolmarquezini.organizadordetimes.controller;

import com.carolmarquezini.organizadordetimes.model.Jogador;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrganizadorTimesController {

    @PostMapping("/jogador")
    public void adicionarJogador(@RequestBody Jogador jogador){
        System.out.println("Adicionando um jogador " + jogador.nome);
    }

    @GetMapping("/times")
    public Map<String, List<String>> buscarTimes(){
        System.out.println("Buscando times ...");
        return new HashMap<>();
    }

    @DeleteMapping("/jogador/all")
    public void deletarTodosJogadores(){
        System.out.println("Deletando todos os jogadores ...");
    }
}
