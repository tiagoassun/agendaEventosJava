package tiagoassun.ifes.bsi.poo1;

import javax.swing.*;


public class TelaEvento {
    private StringBuilder menu;
    private GestorEventos gestorEventos;

    public TelaEvento() {
        gestorEventos = new GestorEventos();
        iniciarMenu();
    }

    private String mostrarMenu() {
        return JOptionPane.showInputDialog(null, menu);
    }

    void executar() {
        while (true) {
            switch (Integer.parseInt(mostrarMenu())) {
                case 0:
                    System.exit(0);
                case 1:
                    incluirEvento();
                    incluirParticipante();
                    break;
                case 2:
                    lista();
                    break;
                case 3:
                    excluirEvento();
                    break;
            }
        }
    }

    private void iniciarMenu() {
        menu = new StringBuilder();
        menu.append("1 - Incluir Evento").append("\n");
        menu.append("2 - Listar Evento").append("\n");
        menu.append("3 - Excluir Evento").append("\n");
        menu.append("0 - Sair").append("\n");
    }

    private void incluirEvento() {
        Eventos evento = new Eventos();
        evento.setTitulo(JOptionPane.showInputDialog("Título do Evento"));
        evento.setData(JOptionPane.showInputDialog("Data"));
        evento.setLocal(JOptionPane.showInputDialog("Local"));
        gestorEventos.adicionaEvento(evento);
    }

    private void incluirParticipante() {
        Contato part = new Contato();
        part.setNome(JOptionPane.showInputDialog("Nome"));
        //gestorEventos.adicionaParticipante(part);
    }

    private String listarEvento() {
        int cont = 0;
        StringBuilder listaE = new StringBuilder();
        for (Eventos evento : gestorEventos.getEventos()) {
            listaE.append(++cont).append(" - ").append(evento.getData())
                    .append(" ").append(evento.getTitulo()).append("\n");

        }
        return listaE.toString();
    }

    private void lista() {
        JOptionPane.showMessageDialog(null, listarEvento());
    }

    private void excluirEvento() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarEvento()));
        gestorEventos.removeEvento(--indice);
    }
}
