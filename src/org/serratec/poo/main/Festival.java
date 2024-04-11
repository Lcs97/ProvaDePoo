package org.serratec.poo.main;

import java.time.LocalDate;
import java.util.List;

import org.serratec.poo.classs.Banda;
import org.serratec.poo.classs.Cantor;
import org.serratec.poo.classs.Evento;
import org.serratec.poo.classs.GeneroMusical;
import org.serratec.poo.classs.Palco;

public class Festival {
    public static void main(String[] args) {        
    	Evento evento1 = new Evento();
        
    	Cantor cantor1 = new Cantor("Iza", GeneroMusical.pop, 10000.0);
        evento1.adicionarEvento(LocalDate.of(2024, 5, 20), "19:00");

        Cantor cantor2 = new Cantor("Ludmilla", GeneroMusical.pop, 10000.0);
        evento1.adicionarEvento(LocalDate.of(2024, 5, 20), "22:00");

        
        Banda banda1 = new Banda("Red Hot Chili Peppers", GeneroMusical.rock, 150000.0);
        evento1.adicionarEvento(LocalDate.of(2024, 5, 21), "18:00");
  
        
        Banda banda2 = new Banda("The Cure", GeneroMusical.rock, 150000.0);     
        evento1.adicionarEvento(LocalDate.of(2024, 5, 21), "23:00");
        

        List<String> horarios = evento1.getHorarios();
        horarios.set(0, evento1.getDatasApresentacao().get(0) + " - " + horarios.get(0) + " - " + cantor1.getNome());
        horarios.set(1, evento1.getDatasApresentacao().get(1) + " - " + horarios.get(1) + " - " + cantor2.getNome());
        horarios.set(2, evento1.getDatasApresentacao().get(2) + " - " + horarios.get(2) + " - " + banda1.getNome());
        horarios.set(3, evento1.getDatasApresentacao().get(3) + " - " + horarios.get(3) + " - " + banda2.getNome());
        
        Palco palcoPrincipal = new Palco("Palco Principal", 20000);
        palcoPrincipal.adicionarProgramacao(evento1);
        
        
        System.out.println("Festival de Música: ");
        System.out.println("\nArtistas:");
        System.out.println("Cantor: " + cantor1.getNome() + ", Gênero: " + cantor1.getGenero());
        System.out.println("Cantor: " + cantor2.getNome() + ", Gênero: " + cantor2.getGenero());
        System.out.println("Banda: " + banda1.getNome() + ", Gênero: " + banda1.getGenero());
        System.out.println("Banda: " + banda2.getNome() + ", Gênero: " + banda2.getGenero());
        
        System.out.println("\nPalco:");
        System.out.println(palcoPrincipal.getNome() + ", Capacidade: " + palcoPrincipal.getCapacidade());
        System.out.println("\nProgramação:");
        for (Evento evento : palcoPrincipal.getProgramacao()) {
            for (String horario : evento.getHorarios()) {
                System.out.println(horario);
            }
        }
    }
}