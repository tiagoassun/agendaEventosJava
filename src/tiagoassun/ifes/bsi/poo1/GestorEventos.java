package tiagoassun.ifes.bsi.poo1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class GestorEventos {
    private ArrayList<Eventos> eventos;




    public GestorEventos() {
        eventos = new ArrayList<>();
    }

    public List<Eventos> getEventos() {
        return eventos;
    }

    public void adicionaEvento(Eventos evento) {
        eventos.add(evento);
    }

    public void excluiEvento(int pos) {
        eventos.remove(pos);
    }

    public Eventos buscar(String nome){
        for(int i=0; i<eventos.size(); i++) {
            Eventos e = eventos.get(i);
            if(e.getTitulo().equalsIgnoreCase(nome))
                return e;
        }
        JOptionPane.showInputDialog("Evento não encontrado!");
        return null;
    }
}
