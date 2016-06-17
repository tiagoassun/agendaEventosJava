package tiagoassun.ifes.bsi.poo1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class GestorContatos {

    private List<Contatos> contatos;




    public GestorContatos() {
        contatos = new ArrayList<>();
    }

    public List<Contatos> getContatos() {
        return contatos;
    }

    public void adicionaContato(Contatos contato) {
        contatos.add(contato);
    }

    public void excluiContato(int pos) {
        contatos.remove(pos);
    }

    public void excluiContatoNome(String nome) {
        int i;
        for(i=0; i<contatos.size(); i++) {
            Contatos c = contatos.get(i);
            if(c.getNome().equalsIgnoreCase(nome))
                contatos.remove(i);
        }
    }

    public Contatos buscarNome(String nome){
        for(int i=0; i<contatos.size(); i++) {
            Contatos c = contatos.get(i);
            if(c.getNome().equalsIgnoreCase(nome))
                return c;
        }
        return null;
    }

    public Contatos buscarIndice(int pos){
        return contatos.get(pos);
    }
}
