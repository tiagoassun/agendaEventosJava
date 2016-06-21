package tiagoassun.ifes.bsi.poo1.estruturas;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Gostos {

    Map<String, ArrayList<String>> map_gostos = new HashMap<String, ArrayList<String>>(); //<Nome gosto, Lista tipos eventos>





    public void adicionarGosto (String gosto) {
        ArrayList<String> lista_gosto_tipo_evento = new ArrayList<String>();
        map_gostos.put(gosto, lista_gosto_tipo_evento);
    }

    public void adicionarGostoTipoEvento (String gosto, String gosto_tipo_evento) {
        map_gostos.get(gosto).add(gosto_tipo_evento);
    }

    public void excluirGosto(String gosto){
        map_gostos.remove(gosto);
    }

    public void excluirGostoTipoEvento(String gosto, String gosto_tipo_evento) {
        map_gostos.get(gosto).remove(gosto_tipo_evento);
    }

    public ArrayList<String> buscarGosto(String gosto){
        return map_gostos.get(gosto);
    }

    //Faz: Pegas as chaves do HashMap uma por uma e vai salvando a chave e os valores em uma String, no final retorna a String
    //Entrada: VOID
    //Saida: Strig com os gostos e os tipos de eventos de cada gosto
    public String listarGostosETiposEvento() {
        StringBuilder contato = new StringBuilder();
        for (String  gosto : map_gostos.keySet()){
            ArrayList<String> tiposEventos = map_gostos.get(gosto);
            contato.append(" - ").append(gosto);
            for (String evento : tiposEventos) {
                contato.append(" - ").append(evento);
            }
            contato.append("\n");
        }
        return contato.toString();
    }
}
