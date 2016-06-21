package tiagoassun.ifes.bsi.poo1.estruturas;


import tiagoassun.ifes.bsi.poo1.entidades.Contato;

import java.util.HashMap;
import java.util.Map;

public class Relacao {

    Map<String, Contato> map_amigos = new HashMap<String, Contato>(); //<Nome, Objeto Contato>
    Map<String, Contato> map_colegas = new HashMap<String, Contato>(); //<Nome, Objeto Contato>
    Map<String, Contato> map_familiares = new HashMap<String, Contato>(); //<Nome, Objeto Contato>





    public void adicionarAmigo (Contato conta){
        map_amigos.put(conta.getNome(), conta);
    }

    public void adicionarColega (Contato conta){
        map_colegas.put(conta.getNome(), conta);
    }

    public void adicionarFamiliar (Contato conta){
        map_familiares.put(conta.getNome(), conta);
    }

    public void excluirAmigo(Contato conta) {
        String nome = conta.getNome();
        if (map_amigos.containsKey(nome)) {
            map_amigos.remove(conta.getNome());
        }
    }

    public void excluirColega(Contato conta) {
        String nome = conta.getNome();
        if (map_colegas.containsKey(nome)) {
            map_colegas.remove(conta.getNome());
        }
    }

    public void excluirFamiliar(Contato conta) {
        String nome = conta.getNome();
        if (map_familiares.containsKey(nome)) {
            map_familiares.remove(conta.getNome());
        }
    }

    public Contato buscarAmigo(Contato conta) {
        Contato contato = new Contato();
        String nome = conta.getNome();

        if (map_amigos.containsKey(nome)) {
            return contato = map_amigos.get(nome);
        }
        else {
            return null;
        }
    }

    public Contato buscarColega(Contato conta) {
        Contato contato = new Contato();
        String nome = conta.getNome();

        if (map_colegas.containsKey(nome)) {
            return contato = map_colegas.get(nome);
        }
        else {
            return null;
        }
    }

    public Contato buscarFamiliar(Contato conta) {
        Contato contato = new Contato();
        String nome = conta.getNome();

        if (map_familiares.containsKey(nome)) {
            return contato = map_familiares.get(nome);
        }
        else {
            return null;
        }
    }

    public String listarRelacoesAmigos() {
        StringBuilder contato = new StringBuilder();
        for (Contato conta : map_amigos.values()) {
            contato.append(" - ").append(conta.getNome()).append(" ").append(conta.getCelular()).append("\n");
        }
        return contato.toString();
    }

    public String listarRelacoesColegas() {
        StringBuilder contato = new StringBuilder();
        for (Contato conta : map_colegas.values()) {
            contato.append(" - ").append(conta.getNome()).append(" ").append(conta.getCelular()).append("\n");
        }
        return contato.toString();
    }

    public String listarRelacoesFamiliares() {
        StringBuilder contato = new StringBuilder();
        for (Contato conta : map_familiares.values()) {
            contato.append(" - ").append(conta.getNome()).append(" ").append(conta.getCelular()).append("\n");
        }
        return contato.toString();
    }
}
