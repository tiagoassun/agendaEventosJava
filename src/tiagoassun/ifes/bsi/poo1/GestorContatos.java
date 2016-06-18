package tiagoassun.ifes.bsi.poo1;

import java.util.ArrayList;
import java.util.List;


public class GestorContatos {

    private List<Contato> contatos;




    public GestorContatos() {
        contatos = new ArrayList<>();
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void adicionaContato(Contato contato) {
        contatos.add(contato);
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
