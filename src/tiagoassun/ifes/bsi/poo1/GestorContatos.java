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

    public Contatos buscar(String nome){
        for(int i=0; i<contatos.size(); i++) {
            Contatos c = contatos.get(i);
            if(c.getNome().equalsIgnoreCase(nome))
                return c;
        }
        JOptionPane.showInputDialog("Contato não encontrado!");
        return null;
    }
}
