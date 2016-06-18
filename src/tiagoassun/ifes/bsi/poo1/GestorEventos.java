package tiagoassun.ifes.bsi.poo1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class GestorEventos {

    private ArrayList<Evento> eventos;




    public GestorEventos() {
        eventos = new ArrayList<>();
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void adicionaEvento(Evento evento) {
        eventos.add(evento);
    }

    public void excluiEvento(int pos) {
        eventos.remove(pos);
    }

    public void excluiEventoNome(String nome) {
        int i;
        for(i=0; i<eventos.size(); i++) {
            Evento e = eventos.get(i);
            if(e.getTitulo().equalsIgnoreCase(nome))
                eventos.remove(i);
        }
    }

    public Evento buscarNome(String nome){
        for(int i=0; i<eventos.size(); i++) {
            Evento e = eventos.get(i);
            if(e.getTitulo().equalsIgnoreCase(nome))
                return e;
        }
        JOptionPane.showInputDialog("Evento não encontrado!");
        return null;
    }

    public Evento buscarIndice(int pos){
        return eventos.get(pos);
    }

    public boolean validarRegras(Autenticar conta, Evento event) {
        boolean result = false;
        result =  conta.autentica(event);
        return result;
    }
}
