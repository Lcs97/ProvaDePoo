package org.serratec.poo.classs;

import java.util.ArrayList;
import java.util.List;

public class Palco {
    private String nome;
    private int capacidade;
    private List<Evento> evento;

    public Palco(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.evento = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Evento> getProgramacao() {
        return evento;
    }

    public void adicionarProgramacao(Evento evento) {
        this.evento.add(evento);
    }

}
