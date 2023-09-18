package com.carolmarquezini.organizadordetimes.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrganizadorTimesService {

    private static Map<String, List<String>> times = new HashMap<>();
    private static Map<String, Integer> controleDeSobrenome = new HashMap<>();
    public void adicionarJogador(String nomeCompleto) {
        System.out.println("Iniciando organização de time para o jogador " + nomeCompleto);

        String[] partesDoNome = nomeCompleto.split(" ");

        if (partesDoNome.length != 2) {
            System.out.println("Ignorando nome por nao seguir o padrao nome e sobrenome: " + nomeCompleto);
            return;
        }

        String primeiroNome = partesDoNome[0];
        String sobrenome = partesDoNome[1];

        char primeiroCaracter = sobrenome.charAt(0);
        String nomeDoTime = "Time " + primeiroCaracter;

        if (controleDeSobrenome.containsKey(sobrenome)) {
            nomeDoTime += controleDeSobrenome.get(sobrenome); //alterando nome do time para evitar sobrenomes iguais no mesmo time.
        }

        List<String> jogadoresDoTime = new ArrayList();
        if (times.containsKey(nomeDoTime)) {
            jogadoresDoTime = times.get(nomeDoTime);
        }

        jogadoresDoTime.add(nomeCompleto);
        times.put(nomeDoTime, jogadoresDoTime);

        Integer qtdSobrenomeExistente = 0;
        if (controleDeSobrenome.containsKey(sobrenome)) {
            qtdSobrenomeExistente = controleDeSobrenome.get(sobrenome);
        }

        controleDeSobrenome.put(sobrenome, qtdSobrenomeExistente + 1);

    }

    public Map<String, List<String>> buscarTimes() {
        System.out.println("Iniciando busca dos times ...");
        return times;
    }

    public void deletarTodosJogadores() {
        System.out.println("Iniciando exclusão dos jogadores ...");
        times = new HashMap<>();
        controleDeSobrenome = new HashMap<>();
    }
}
