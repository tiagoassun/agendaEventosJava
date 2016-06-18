package tiagoassun.ifes.bsi.poo1;

import java.util.ArrayList;
import java.util.List;


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
        contatos.add(c);
    }

    public void excluiParticipante(Contato c) {
        contatos.remove(c);
    }

    public Contato buscarNome(String nome){
        for(int i=0; i<contatos.size(); i++) {
            Contato c = contatos.get(i);
            if(c.getNome().equalsIgnoreCase(nome))
                return c;
        }
        return null;
    }
}
