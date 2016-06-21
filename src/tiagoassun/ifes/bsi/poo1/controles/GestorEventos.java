package tiagoassun.ifes.bsi.poo1.controles;

import tiagoassun.ifes.bsi.poo1.interfaces.Autenticar;
import tiagoassun.ifes.bsi.poo1.estruturas.GrupoEvento;
import tiagoassun.ifes.bsi.poo1.entidades.Evento;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class GestorEventos {

    private ArrayList<Evento> eventos;
    public GrupoEvento grupoEvento;




    public GestorEventos() {
        eventos = new ArrayList<>();
        grupoEvento = new GrupoEvento();
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

    //Faz: pega evento por evento na lista de eventos e compara o nome de cada um com a String recebida por parametro, se for igual remove o evento
    //Entrada: String contendo o nome que sera pesquisado
    //Saida: VOID
    public void excluiEventoNome(String nome) {
        int i;
        for(i=0; i<eventos.size(); i++) {
            Evento e = eventos.get(i);
            if(e.getTitulo().equalsIgnoreCase(nome))
                eventos.remove(i);
        }
    }

    //Faz: pega evento por evento na lista de eventos e compara o nome de cada um com a String recebida por parametro, se for igual retorna o evento
    //Entrada: String contendo o nome que sera pesquisado
    //Saida: o evento que combine com o nome ou null caso não exista o evento
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
        boolean result;
        result =  conta.autentica(event);
        return result;
    }
}
