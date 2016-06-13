package tiagoassun.ifes.bsi.poo1;

import java.util.ArrayList;
import java.util.List;


public class Eventos {
    private List<Contato> contatos;
    private String titulo;
    private String local;
    private String data;

    public Eventos() {
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void adicionaParticipante(Contato p) {
        contatos.add(p);
    }

    public void excluiParticipante(Contato p) {
        contatos.remove(p);
    }
}
