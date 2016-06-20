package tiagoassun.ifes.bsi.poo1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Evento {

    private List<Contato> contatos;
    private String titulo;
    private String local;
    private String endereco;
    private String data;
    private String hora;
    private int numero_maximo;
    private float valorEntrada;
    private String exclusividade;

    private Map<String, ArrayList<String>> grupo_evento = new HashMap<String, ArrayList<String>>(); //<Nome, Lista tipos eventos>



    public Evento() {
        contatos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getNumero_maximo() {
        return numero_maximo;
    }

    public void setNumero_maximo(int numero_maximo) {
        this.numero_maximo = numero_maximo;
    }

    public float getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(float valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public String getExclusividade() {
        return exclusividade;
    }

    public void setExclusividade(String exclusividade) {
        this.exclusividade = exclusividade;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void adicionaParticipante(Contato c) {
        int cont = 0;
        if (contatos.size() < numero_maximo) {
            for (Contato conta : contatos) {
                if (conta == c) {
                    cont++;
                }
            }
            if (cont == 0){
                contatos.add(c);
            }
            else{
                JOptionPane.showMessageDialog(null, "ERRO! Esse contato já está no evento.");
            }

        }
        else {
            JOptionPane.showMessageDialog(null, "ERRO! O evento chagou ao numero maximo de participantes.");
        }
    }

    public void excluiParticipante(Contato c) {
        contatos.remove(c);
    }

    //Faz: pega contato por contato na lista de contatos e compara o nome de cada um com a String recebida por parametro, se for igual retorna o contato
    //Entrada: String contendo o nome que sera pesquisado
    //Saida: o contato que combine com o nome ou null caso não exista o contato
    public Contato buscarNome(String nome){
        for(int i=0; i<contatos.size(); i++) {
            Contato c = contatos.get(i);
            if(c.getNome().equalsIgnoreCase(nome))
                return c;
        }
        return null;
    }

    public Map<String, ArrayList<String>> getGrupo_evento() {
        return grupo_evento;
    }

    public void setGrupo_evento(Map<String, ArrayList<String>> grupo_evento) {
        this.grupo_evento = grupo_evento;
    }
}
