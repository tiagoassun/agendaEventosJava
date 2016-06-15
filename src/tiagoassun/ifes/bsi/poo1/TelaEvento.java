package tiagoassun.ifes.bsi.poo1;

import javax.swing.*;


public class TelaEvento {
    private StringBuilder menu_agenda;
    private StringBuilder menu_gerenciar_contatos;
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
        iniciarMenuCriarEventos();
        iniciarMenuGerenciarConvidadosEvento();
    }

    private void iniciarMenuAgenda() {
        menu_agenda = new StringBuilder();
        menu_agenda.append("1 - Gerenciar Contatos").append("\n");
        menu_agenda.append("2 - Criar Eventos").append("\n");
        menu_agenda.append("3 - Gerenciar Convidados de evento").append("\n");
        menu_agenda.append("0 - Sair").append("\n");
    }

    private void iniciarMenuGerenciarContatos() {
        menu_gerenciar_contatos = new StringBuilder();
        menu_gerenciar_contatos.append("1 - Criar Contatos").append("\n");
        menu_gerenciar_contatos.append("2 - Editar Contatos").append("\n");
        menu_gerenciar_contatos.append("3 - Excluir Contatos").append("\n");
        menu_gerenciar_contatos.append("4 - Pesquisar Contatos").append("\n");
        menu_gerenciar_contatos.append("0 - Voltar").append("\n");
    }

    private void iniciarMenuCriarEventos() {
        menu_criar_eventos = new StringBuilder();
        menu_criar_eventos.append("1 - Criar Evento").append("\n");
        menu_criar_eventos.append("2 - Editar Evento").append("\n");
        menu_criar_eventos.append("3 - Excluir Evento").append("\n");
        menu_criar_eventos.append("4 - Pesquisar Evento").append("\n");
        menu_criar_eventos.append("0 - Voltar").append("\n");
    }

    private void iniciarMenuGerenciarConvidadosEvento() {
        menu_gerenciar_convidados_evento = new StringBuilder();
        menu_gerenciar_convidados_evento.append("1 - Adicionar Convidado Individualmente").append("\n");
        menu_gerenciar_convidados_evento.append("2 - Remover Convidado").append("\n");
        menu_gerenciar_convidados_evento.append("3 - Mostrar lista de Convidados de um evento").append("\n");
        menu_gerenciar_convidados_evento.append("4 - Verificar se um Contatos está em uma lista de um evento").append("\n");
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
                    criarContato();
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    excluirContato();
                    break;
                case 4:
                    listaConta();
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
                    ;
                    break;
                case 3:
                    excluirEvento();
                    break;
                case 4:
                    listaEvent();
                    break;
            }
        }
    }

    void executarMenuGerenciarConvidadosEvento() {
        while (true) {
            switch (Integer.parseInt(mostrarMenuGerenciarConvidadosEvento())) {
                case 0:
                    executar();
                    break;
                case 1:
                    ;
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    ;
                    break;
                case 4:
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

    private String mostrarMenuCriarEventos() {
        return JOptionPane.showInputDialog(null, menu_criar_eventos);
    }

    private String mostrarMenuGerenciarConvidadosEvento() {
        return JOptionPane.showInputDialog(null, menu_gerenciar_convidados_evento);
    }





    // FUNÇÕES DE “GERENCIAR CONTATOS”
    private void criarContato() {
        Contatos contato = new Contatos();
        contato.setNome(JOptionPane.showInputDialog("Nome"));
        contato.setCelular(JOptionPane.showInputDialog("Celular"));
        gestorContatos.adicionaContato(contato);
    }

    private void excluirContato() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        gestorContatos.excluiContato(--indice);
    }

    private void listaConta() {
        JOptionPane.showMessageDialog(null, listarContato());
    }

    private String listarContato() {
        int cont = 0;
        StringBuilder contato = new StringBuilder();
        for (Contatos conta : gestorContatos.getContatos()) {
            contato.append(++cont).append(" - ").append(conta.getNome()).append(" ").append(conta.getCelular()).append("\n");

        }
        return contato.toString();
    }




    // FUNÇÕES DE “CRIAR EVENTOS”
    private void criarEvento() {
        Eventos evento = new Eventos();
        evento.setTitulo(JOptionPane.showInputDialog("Título do Evento"));
        evento.setData(JOptionPane.showInputDialog("Data"));
        evento.setLocal(JOptionPane.showInputDialog("Local"));
        gestorEventos.adicionaEvento(evento);
    }

    private void excluirEvento() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarEvento()));
        gestorEventos.excluiEvento(--indice);
    }

    private void listaEvent() {
        JOptionPane.showMessageDialog(null, listarEvento());
    }

    private String listarEvento() {
        int cont = 0;
        StringBuilder listaE = new StringBuilder();
        for (Eventos evento : gestorEventos.getEventos()) {
            listaE.append(++cont).append(" - ").append(evento.getTitulo()).append(" ").append(evento.getData()).append("\n");

        }
        return listaE.toString();
    }
}
