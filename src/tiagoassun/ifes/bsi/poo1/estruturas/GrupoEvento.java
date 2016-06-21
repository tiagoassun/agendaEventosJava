package tiagoassun.ifes.bsi.poo1.estruturas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class GrupoEvento {

    private Map<String, ArrayList<String>> map_evento_social = new HashMap<String, ArrayList<String>>(); //<Nome, Lista tipos eventos>
    private Map<String, ArrayList<String>> map_evento_profissional = new HashMap<String, ArrayList<String>>(); //<Nome, Lista tipos eventos>
    private Map<String, ArrayList<String>> map_evento_familiar = new HashMap<String, ArrayList<String>>(); //<Nome, Lista tipos eventos>

    private ArrayList lista_tipos_evento_social = new ArrayList();
    private ArrayList lista_tipos_evento_profissional = new ArrayList();
    private ArrayList lista_tipos_evento_familiar = new ArrayList();





    public GrupoEvento(){
        map_evento_social.put("Evento Social", lista_tipos_evento_social);
        map_evento_profissional.put("Evento Profissional", lista_tipos_evento_profissional);
        map_evento_familiar.put("Evento Familiar", lista_tipos_evento_familiar);
    }

    public void adicionarTipoEventoSocial (String tipo_evento) {
        map_evento_social.get("Evento Social").add(tipo_evento);
    }

    public void adicionarTipoEventoProfissional (String tipo_evento) {
        map_evento_profissional.get("Evento Profissional").add(tipo_evento);
    }

    public void adicionarTipoEventoFamiliar (String tipo_evento) {
        map_evento_familiar.get("Evento Familiar").add(tipo_evento);
    }

    public void excluirTipoEventoSocial(int indice) {
        map_evento_social.get("Evento Social").remove(indice);
    }

    public void excluirTipoEventoProfissional(int indice) {
        map_evento_profissional.get("Evento Profissional").remove(indice);
    }

    public void excluirTipoEventoFamiliar(int indice) {
        map_evento_familiar.get("Evento Familiar").remove(indice);
    }

    //Faz: Pegas a chave do HashMap e vai salvando a chave e os valores em uma String, no final retorna a String
    //Entrada: VOID
    //Saida: Strig com os evento social e os tipos de eventos
    public String listarTipoEventosSocial() {
        StringBuilder event = new StringBuilder();
        int cont = 0;
        ArrayList<String> tiposEventos = map_evento_social.get("Evento Social");
        event.append(" - ").append("Evento Social");
        event.append("\n");
        for (String evento : tiposEventos) {
            event.append(++cont).append(" - ").append(evento);
            event.append("\n");
        }
        event.append("\n");
        return event.toString();
    }

    //Faz: Pegas a chave do HashMap e vai salvando a chave e os valores em uma String, no final retorna a String
    //Entrada: VOID
    //Saida: Strig com os evento profissional e os tipos de eventos
    public String listarTipoEventosProfissional() {
        StringBuilder event = new StringBuilder();
        int cont = 0;
        ArrayList<String> tiposEventos = map_evento_profissional.get("Evento Profissional");
        event.append(" - ").append("Evento Profissional");
        event.append("\n");
        for (String evento : tiposEventos) {
            event.append(++cont).append(" - ").append(evento);
            event.append("\n");
        }
        event.append("\n");
        return event.toString();
    }

    //Faz: Pegas a chave do HashMap e vai salvando a chave e os valores em uma String, no final retorna a String
    //Entrada: VOID
    //Saida: Strig com os evento familiar e os tipos de eventos
    public String listarTipoEventosFamiliar() {
        StringBuilder event = new StringBuilder();
        int cont = 0;
        ArrayList<String> tiposEventos = map_evento_familiar.get("Evento Familiar");
        event.append(" - ").append("Evento Familiar");
        event.append("\n");
        for (String evento : tiposEventos) {
            event.append(++cont).append(" - ").append(evento);
        }
        event.append("\n");
        return event.toString();
    }

    public Map<String, ArrayList<String>> getMap_evento_social() {
        return map_evento_social;
    }

    public void setMap_evento_social(Map<String, ArrayList<String>> map_evento_social) {
        this.map_evento_social = map_evento_social;
    }

    public Map<String, ArrayList<String>> getMap_evento_profissional() {
        return map_evento_profissional;
    }

    public void setMap_evento_profissional(Map<String, ArrayList<String>> map_evento_profissional) {
        this.map_evento_profissional = map_evento_profissional;
    }

    public Map<String, ArrayList<String>> getMap_evento_familiar() {
        return map_evento_familiar;
    }

    public void setMap_evento_familiar(Map<String, ArrayList<String>> map_evento_familiar) {
        this.map_evento_familiar = map_evento_familiar;
    }

    public int buscarTipoEventoSocial(String tipo) {
        if (map_evento_social.get("Evento Social").contains(tipo)) {
            return 1;
        }
        return 0;
    }

    public int buscarTipoEventoProfissional(String tipo) {
        if (map_evento_profissional.get("Evento Profissional").contains(tipo)) {
            return 1;
        }
        return 0;
    }

    public int buscarTipoEventoFamiliar(String tipo) {
        if (map_evento_familiar.get("Evento Familiar").contains(tipo)) {
            return 1;
        }
        return 0;
    }
}
