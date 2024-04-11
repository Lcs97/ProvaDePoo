package org.serratec.poo.classs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private List<LocalDate> datasApresentacao;
    private List<String> horarios;

    public Evento() {
        this.datasApresentacao = new ArrayList<>();
        this.horarios = new ArrayList<>();
    }

    public void adicionarEvento(LocalDate data, String horario) {
        datasApresentacao.add(data);
        horarios.add(horario);
    }

    public List<LocalDate> getDatasApresentacao() {
        return datasApresentacao;
    }

    public List<String> getHorarios() {
        return horarios;
    }
}
