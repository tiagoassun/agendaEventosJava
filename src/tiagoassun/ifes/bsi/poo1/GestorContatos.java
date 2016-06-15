package tiagoassun.ifes.bsi.poo1;

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
}
