package tiagoassun.ifes.bsi.poo1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class GestorContatos {

    private List<Contato> contatos;
    public Gostos gotos = new Gostos();




    public GestorContatos() {
        contatos = new ArrayList<>();
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void adicionaContato(Contato c) {
        int cont = 0;
        for (Contato conta : contatos) {
            if (conta == c) {
                cont++;
            }
        }

        if (cont == 0) {
            contatos.add(c);
        }
        else{
            JOptionPane.showMessageDialog(null, "ERRO! Esse contato já foi adicionado.");
        }
    }

    public void excluiContato(int pos) {
        contatos.remove(pos);
    }

    public void excluiContatoNome(String nome) {
        int i;
        for(i=0; i<contatos.size(); i++) {
            Contato c = contatos.get(i);
            if(c.getNome().equalsIgnoreCase(nome))
                contatos.remove(i);
        }
    }

    public Contato buscarNome(String nome){
        for(int i=0; i<contatos.size(); i++) {
            Contato c = contatos.get(i);
            if(c.getNome().equalsIgnoreCase(nome))
                return c;
        }
        return null;
    }

    public Contato buscarIndice(int pos){
        return contatos.get(pos);
    }
}
