package tiagoassun.ifes.bsi.poo1;

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
}
