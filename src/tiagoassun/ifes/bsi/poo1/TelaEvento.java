package tiagoassun.ifes.bsi.poo1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class TelaEvento {

    private StringBuilder menu_agenda;

    private StringBuilder menu_gerenciar_contatos;
    private StringBuilder subMenu_criar_contatos;
    private StringBuilder subMenu_criar_relacao;

    private StringBuilder menu_criar_eventos;
    private StringBuilder menu_gerenciar_convidados_evento;

    private GestorEventos gestorEventos;
    private GestorContatos gestorContatos;





    // FUNÇÕES DA “PROJEÇÃO DA TELA”
    public TelaEvento() {
        gestorEventos = new GestorEventos();
        gestorContatos = new GestorContatos();
        iniciarMenuAgenda();

        iniciarMenuGerenciarContatos();
        iniciarSubMenuCriarContato();
        iniciarSubMenuCriarRelacao();

        iniciarMenuCriarEventos();
        iniciarMenuGerenciarConvidadosEvento();
    }

    private void iniciarMenuAgenda() {
        menu_agenda = new StringBuilder();
        menu_agenda.append("1 - Gerenciar Contato").append("\n");
        menu_agenda.append("2 - Criar Evento").append("\n");
        menu_agenda.append("3 - Gerenciar Convidados de evento").append("\n");
        menu_agenda.append("0 - Sair").append("\n");
    }

    private void iniciarMenuGerenciarContatos() {
        menu_gerenciar_contatos = new StringBuilder();
        menu_gerenciar_contatos.append("1 - Criar Contato").append("\n");
        menu_gerenciar_contatos.append("2 - Editar Contato").append("\n");
        menu_gerenciar_contatos.append("3 - Excluir Contato").append("\n");
        menu_gerenciar_contatos.append("4 - Pesquisar Contato").append("\n");
        menu_gerenciar_contatos.append("5 - Listar Contato").append("\n");
        menu_gerenciar_contatos.append("6 - Criar Relação").append("\n");
        menu_gerenciar_contatos.append("0 - Voltar").append("\n");
    }

    private void iniciarSubMenuCriarContato() {
        subMenu_criar_contatos = new StringBuilder();
        subMenu_criar_contatos.append("1 - Amigo").append("\n");
        subMenu_criar_contatos.append("2 - Colega").append("\n");
        subMenu_criar_contatos.append("3 - Familiar").append("\n");
        subMenu_criar_contatos.append("0 - Voltar").append("\n");
    }

    private void iniciarSubMenuCriarRelacao() {
        subMenu_criar_relacao = new StringBuilder();
        subMenu_criar_relacao.append("1 - Relação Amigo").append("\n");
        subMenu_criar_relacao.append("2 - Relação Colega").append("\n");
        subMenu_criar_relacao.append("3 - Relação Familiar").append("\n");
        subMenu_criar_relacao.append("0 - Voltar").append("\n");
    }

    private void iniciarMenuCriarEventos() {
        menu_criar_eventos = new StringBuilder();
        menu_criar_eventos.append("1 - Criar Evento").append("\n");
        menu_criar_eventos.append("2 - Editar Evento").append("\n");
        menu_criar_eventos.append("3 - Excluir Evento").append("\n");
        menu_criar_eventos.append("4 - Pesquisar Evento").append("\n");
        menu_criar_eventos.append("5 - Listar Evento").append("\n");
        menu_criar_eventos.append("0 - Voltar").append("\n");
    }

    private void iniciarMenuGerenciarConvidadosEvento() {
        menu_gerenciar_convidados_evento = new StringBuilder();
        menu_gerenciar_convidados_evento.append("1 - Adicionar Convidado Individualmente").append("\n");
        menu_gerenciar_convidados_evento.append("2 - Remover Convidado").append("\n");
        menu_gerenciar_convidados_evento.append("3 - Mostrar lista de Convidados de um evento").append("\n");
        menu_gerenciar_convidados_evento.append("4 - Verificar se um Contato está em uma lista de um evento").append("\n");
        menu_gerenciar_convidados_evento.append("5 - Mostrar os eventos para os quais um contato está convidado").append("\n");
        menu_gerenciar_convidados_evento.append("6 - Criar lista automática de Convidados").append("\n");
        menu_gerenciar_convidados_evento.append("0 - Voltar").append("\n");
    }

    void executar() {
        while (true) {
            switch (Integer.parseInt(mostrarMenuAgenda())) {
                case 0:
                    System.exit(0);
                case 1:
                    executarMenuGerenciarContatos();
                    break;
                case 2:
                    executarMenuCriarEventos();
                    break;
                case 3:
                    executarMenuGerenciarConvidadosEvento();
                    break;
            }
        }
    }

    void executarMenuGerenciarContatos() {
        while (true) {
            switch (Integer.parseInt(mostrarMenuGerenciarContatos())) {
                case 0:
                    executar();
                    break;
                case 1:
                    executarSubMenuCriarContato();
                    break;
                case 2:
                    editarContato();
                    break;
                case 3:
                    excluirContato();
                    break;
                case 4:
                    buscaConta();
                    break;
                case 5:
                    listaConta();
                    break;
                case 6:
                    executarSubMenuCriarRelacao();
                    break;
            }
        }
    }

    void executarSubMenuCriarContato() {
        while (true){
            switch (Integer.parseInt(mostrarSubMenuCriarContato())) {
                case 0:
                    executarMenuGerenciarContatos();
                    break;
                case 1:
                    criarAmigo();
                    break;
                case 2:
                    criarColega();
                    break;
                case 3:
                    criarFamiliar();
                    break;
            }
        }
    }

    void executarSubMenuCriarRelacao() {
        while (true){
            switch (Integer.parseInt(mostrarSubMenuCriarRelacao())) {
                case 0:
                    executarMenuGerenciarContatos();
                    break;
                case 1:
                    criarRelacaoAmigo();
                    break;
                case 2:
                    criarRelacaoColega();
                    break;
                case 3:
                    criarRelacaoFamiliar();
                    break;
            }
        }
    }

    void executarMenuCriarEventos() {
        while (true) {
            switch (Integer.parseInt(mostrarMenuCriarEventos())) {
                case 0:
                    executar();
                    break;
                case 1:
                    criarEvento();
                    break;
                case 2:
                    editarEvento();
                    break;
                case 3:
                    excluirEvento();
                    break;
                case 4:
                    buscaEvent();
                    break;
                case 5:
                    listaEvent();
                    break;
            }
        }
    }

    void executarMenuGerenciarConvidadosEvento() {
        while (true) {
            switch (Integer.parseInt(mostrarMenuGerenciarConvidadosEvento())) {
                case 0: // 0 - Voltar
                    executar();
                    break;
                case 1: // 1 - Adicionar Convidado Individualmente
                    addConvidadoIndividualmente();
                    break;
                case 2: // 2 - Remover Convidado
                    removerConvidado();
                    break;
                case 3: // 3 - Mostrar lista de Convidados de um evento
                    listarConvidadosDoEvento();
                    break;
                case 4: // 4 - Verificar se um Contato está em uma lista de um evento
                    listarContatoEmEvento();
                    break;
                case 5: // 5 - Mostrar os eventos para os quais um contato está convidado
                    listarEventosDoContato();
                    break;
                case 6: // 6 - Criar lista automática de Convidados
                    ;
                    break;
            }
        }
    }

    private String mostrarMenuAgenda() {
        return JOptionPane.showInputDialog(null, menu_agenda);
    }


    private String mostrarMenuGerenciarContatos() {
        return JOptionPane.showInputDialog(null, menu_gerenciar_contatos);
    }

    private String mostrarSubMenuCriarContato() {
        return JOptionPane.showInputDialog(null, subMenu_criar_contatos);
    }

    private String mostrarSubMenuCriarRelacao() {
        return JOptionPane.showInputDialog(null, subMenu_criar_contatos);
    }


    private String mostrarMenuCriarEventos() {
        return JOptionPane.showInputDialog(null, menu_criar_eventos);
    }

    private String mostrarMenuGerenciarConvidadosEvento() {
        return JOptionPane.showInputDialog(null, menu_gerenciar_convidados_evento);
    }





    // FUNÇÕES DE “GERENCIAR CONTATOS”
    private void criarAmigo() {
        Amigo amigo = new Amigo();
        amigo.setNome(JOptionPane.showInputDialog("Nome"));
        amigo.setCelular(JOptionPane.showInputDialog("Celular"));
        //amigo.setEmail(JOptionPane.showInputDialog("E-mail"));
        //amigo.setNascimento(JOptionPane.showInputDialog("Nascimento"));
        //amigo.setRua(JOptionPane.showInputDialog("Rua"));
        //amigo.setNumero(JOptionPane.showInputDialog("Numero da casa"));
        //amigo.setBairro(JOptionPane.showInputDialog("Bairro"));
        //amigo.setCidade(JOptionPane.showInputDialog("Cidade"));
        //amigo.setEstado(JOptionPane.showInputDialog("Estado"));
        //amigo.setPais(JOptionPane.showInputDialog("País"));
        //amigo.setGenero(JOptionPane.showInputDialog("Genero"));
        //amigo.setProximidade(JOptionPane.showInputDialog("Proximidade"));
        //amigo.setReferencia(JOptionPane.showInputDialog("Referencia"));
        gestorContatos.adicionaContato(amigo);
    }

    private void criarColega() {
        Colega colega = new Colega();
        colega.setNome(JOptionPane.showInputDialog("Nome"));
        colega.setCelular(JOptionPane.showInputDialog("Celular"));
        //colega.setEmail(JOptionPane.showInputDialog("E-mail"));
        //colega.setNascimento(JOptionPane.showInputDialog("Nascimento"));
        //colega.setRua(JOptionPane.showInputDialog("Rua"));
        //colega.setNumero(JOptionPane.showInputDialog("Numero da casa"));
        //colega.setBairro(JOptionPane.showInputDialog("Bairro"));
        //colega.setCidade(JOptionPane.showInputDialog("Cidade"));
        //colega.setEstado(JOptionPane.showInputDialog("Estado"));
        //colega.setPais(JOptionPane.showInputDialog("País"));
        //colega.setGenero(JOptionPane.showInputDialog("Genero"));
        //colega.setProximidade(JOptionPane.showInputDialog("Proximidade"));
        //colega.setReferencia(JOptionPane.showInputDialog("Referencia"));
        //colega.setLocal_trabalho(JOptionPane.showInputDialog("Local de trabalho"));
        //colega.setProfissao(JOptionPane.showInputDialog("Profissão"));
        gestorContatos.adicionaContato(colega);
    }

    private void criarFamiliar() {
        Familiar familiar = new Familiar();
        familiar.setNome(JOptionPane.showInputDialog("Nome"));
        familiar.setCelular(JOptionPane.showInputDialog("Celular"));
        //familiar.setEmail(JOptionPane.showInputDialog("E-mail"));
        //familiar.setNascimento(JOptionPane.showInputDialog("Nascimento"));
        //familiar.setRua(JOptionPane.showInputDialog("Rua"));
        //familiar.setNumero(JOptionPane.showInputDialog("Numero da casa"));
        //familiar.setBairro(JOptionPane.showInputDialog("Bairro"));
        //familiar.setCidade(JOptionPane.showInputDialog("Cidade"));
        //familiar.setEstado(JOptionPane.showInputDialog("Estado"));
        //familiar.setPais(JOptionPane.showInputDialog("País"));
        //familiar.setGenero(JOptionPane.showInputDialog("Genero"));
        //familiar.setProximidade(JOptionPane.showInputDialog("Proximidade"));
        //familiar.setParentesco(JOptionPane.showInputDialog("Parentesco"));
        gestorContatos.adicionaContato(familiar);
    }

    public void editarContato() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta = gestorContatos.buscarIndice(--indice);
        gestorContatos.excluiContato(indice); //Não precisa de "--indice" pois já foi feito na linha a cima

        if (conta instanceof Amigo){
            criarAmigo();
        }
        else if (conta instanceof Colega){
            criarColega();
        }
        else{
            criarFamiliar();
        }
    }

    private void excluirContato() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        gestorContatos.excluiContato(--indice);
    }

    private void buscaConta() {
        JOptionPane.showMessageDialog(null, buscarContato());
    }

    private String buscarContato() {
        String nome;
        StringBuilder contato = new StringBuilder();
        Contato conta;
        nome = JOptionPane.showInputDialog("Nome contato");
        conta = gestorContatos.buscarNome(nome);
        contato.append(conta.getNome()).append(" ").append(conta.getCelular()).append("\n");
        return contato.toString();
    }

    private void listaConta() {
        JOptionPane.showMessageDialog(null, listarContato());
    }

    private String listarContato() {
        int cont = 0;
        StringBuilder contato = new StringBuilder();
        for (Contato conta : gestorContatos.getContatos()) {
            contato.append(++cont).append(" - ").append(conta.getNome()).append(" ").append(conta.getCelular()).append("\n");
        }
        return contato.toString();
    }

    public void criarRelacaoAmigo() {
        int indice1 = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta1 = gestorContatos.buscarIndice(--indice1);
        int indice2 = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta2 = gestorContatos.buscarIndice(--indice2);
        conta1.relacoes.adicionarAmigo(conta2);
        conta2.relacoes.adicionarAmigo(conta1);
    }

    public void criarRelacaoColega() {
        int indice1 = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta1 = gestorContatos.buscarIndice(--indice1);
        int indice2 = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta2 = gestorContatos.buscarIndice(--indice2);
        conta1.relacoes.adicionarColega(conta2);
        conta2.relacoes.adicionarColega(conta1);
    }

    public void criarRelacaoFamiliar() {
        int indice1 = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta1 = gestorContatos.buscarIndice(--indice1);
        int indice2 = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta2 = gestorContatos.buscarIndice(--indice2);
        conta1.relacoes.adicionarFamiliar(conta2);
        conta2.relacoes.adicionarFamiliar(conta1);
    }





    // FUNÇÕES DE “CRIAR EVENTOS”
    private void criarEvento() {
        Evento evento = new Evento();
        evento.setTitulo(JOptionPane.showInputDialog("Título do Evento"));
        evento.setData(JOptionPane.showInputDialog("Data"));
        evento.setLocal(JOptionPane.showInputDialog("Local"));
        gestorEventos.adicionaEvento(evento);
    }

    public void editarEvento() {
        String nome;
        nome = (JOptionPane.showInputDialog("Nome evento"));
        Evento evento = gestorEventos.buscarNome(nome);
        gestorEventos.excluiEventoNome(nome);
        evento.setTitulo(JOptionPane.showInputDialog("Título do Evento"));
        evento.setData(JOptionPane.showInputDialog("Data"));
        evento.setLocal(JOptionPane.showInputDialog("Local"));
        gestorEventos.adicionaEvento(evento);
    }

    private void excluirEvento() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarEvento()));
        gestorEventos.excluiEvento(--indice);
    }

    private void buscaEvent() {
        JOptionPane.showMessageDialog(null, buscarEvento());
    }

    private String buscarEvento() {
        String nome;
        StringBuilder evento = new StringBuilder();
        Evento even;
        nome = (JOptionPane.showInputDialog("Nome evento"));
        even = gestorEventos.buscarNome(nome);
        evento.append(even.getTitulo()).append(" ").append(even.getData()).append("\n");

        return evento.toString();
    }

    private void listaEvent() {
        JOptionPane.showMessageDialog(null, listarEvento());
    }

    private String listarEvento() {
        int cont = 0;
        StringBuilder listaE = new StringBuilder();
        for (Evento evento : gestorEventos.getEventos()) {
            listaE.append(++cont).append(" - ").append(evento.getTitulo()).append(" ").append(evento.getData()).append("\n");
        }
        return listaE.toString();
    }





    // FUNÇÕES DE “GERENCIAR CONVIDADOS EVENTO”
    public void addConvidadoIndividualmente() {
        int indiceEvento = Integer.valueOf(JOptionPane.showInputDialog(listarEvento()));
        int indiceContato = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        if(gestorEventos.validarRegras(gestorContatos.buscarIndice(--indiceContato), gestorEventos.buscarIndice(--indiceEvento))){
            gestorEventos.buscarIndice(--indiceEvento).adicionaParticipante(gestorContatos.buscarIndice(--indiceContato));
        }
        else{
            JOptionPane.showMessageDialog(null, "ERRO! Não foi possivel add o contato.");
        }
    }

    public void removerConvidado() {
        int indiceEvento = Integer.valueOf(JOptionPane.showInputDialog(listarEvento()));
        int indiceContato = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        gestorEventos.buscarIndice(--indiceEvento).excluiParticipante(gestorContatos.buscarIndice(--indiceContato));
    }

    public void listarConvidadosDoEvento() {
        int cont = 0;
        StringBuilder contato = new StringBuilder();
        int indiceEvento = Integer.valueOf(JOptionPane.showInputDialog(listarEvento()));
        for (Contato conta : gestorEventos.buscarIndice(--indiceEvento).getContatos()) {
            contato.append(++cont).append(" - ").append(conta.getNome()).append(" ").append(conta.getCelular()).append("\n");
        }
        JOptionPane.showMessageDialog(null, contato.toString());
    }

    public void listarContatoEmEvento() {
        String nome;
        int cont = 0;
        StringBuilder contato = new StringBuilder();
        int indiceEvento = Integer.valueOf(JOptionPane.showInputDialog(listarEvento()));
        nome = JOptionPane.showInputDialog("Nome contato");
        Contato conta = gestorEventos.buscarIndice(--indiceEvento).buscarNome(nome);
        contato.append(++cont).append(" - ").append(conta.getNome()).append(" ").append(conta.getCelular()).append("\n");
        JOptionPane.showMessageDialog(null, contato.toString());
    }

    public void listarEventosDoContato() {
        int cont = 0;
        String nome;
        StringBuilder listaE = new StringBuilder();
        nome = JOptionPane.showInputDialog("Nome contato");
        List<Evento> lista_event = new ArrayList<Evento>();
        lista_event = gestorEventos.getEventos();
        for(int i=0; i<lista_event.size(); i++) {
            Evento evento = lista_event.get(i);
            if (evento.buscarNome(nome) != null){
                listaE.append(++cont).append(" - ").append(evento.getTitulo()).append(" ").append(evento.getData()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, listaE.toString());
    }
}
