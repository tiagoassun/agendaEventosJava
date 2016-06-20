package tiagoassun.ifes.bsi.poo1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class TelaEvento {

    private StringBuilder menu_agenda;

    private StringBuilder menu_gerenciar_contatos;
    private StringBuilder subMenu_criar_contatos;

    private StringBuilder subMenu_gerenciar_relacoes;
    private StringBuilder subMenu_criar_relacao;
    private StringBuilder subMenu_excluir_relacao;
    private StringBuilder subMenu_listar_relacao;

    private StringBuilder subMenu_gerenciar_gostos;

    private StringBuilder menu_criar_eventos;
    private StringBuilder subMenu_criar_gerenciar_grupos_eventos;
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

        iniciarSubMenuGerenciarRelacoes();
        iniciarSubMenuCriarRelacao();
        iniciarSubMenuExcluirRelacao();
        iniciarSubMenuListarRelacao();

        iniciarSubMenuGerenciarGostos();

        iniciarMenuCriarEventos();
        iniciarSubMenuGerenciarGruposEvento();
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
        menu_gerenciar_contatos.append("6 - Gerenciar Relações").append("\n");
        menu_gerenciar_contatos.append("7 - Gerenciar Gostos").append("\n");
        menu_gerenciar_contatos.append("8 - Adicionar Gosto a Contato").append("\n");
        menu_gerenciar_contatos.append("0 - Voltar").append("\n");
    }

    private void iniciarSubMenuCriarContato() {
        subMenu_criar_contatos = new StringBuilder();
        subMenu_criar_contatos.append("1 - Adicionar Amigo").append("\n");
        subMenu_criar_contatos.append("2 - Adicionar Colega").append("\n");
        subMenu_criar_contatos.append("3 - Adicionar Familiar").append("\n");
        subMenu_criar_contatos.append("0 - Voltar").append("\n");
    }


    private void iniciarSubMenuGerenciarRelacoes() {
        subMenu_gerenciar_relacoes = new StringBuilder();
        subMenu_gerenciar_relacoes.append("1 - Criar Relação").append("\n");
        subMenu_gerenciar_relacoes.append("2 - Excluir Relação").append("\n");
        subMenu_gerenciar_relacoes.append("3 - Listar Relação").append("\n");
        subMenu_gerenciar_relacoes.append("0 - Voltar").append("\n");
    }

    private void iniciarSubMenuCriarRelacao() {
        subMenu_criar_relacao = new StringBuilder();
        subMenu_criar_relacao.append("1 - Criar Relação Amigo").append("\n");
        subMenu_criar_relacao.append("2 - Criar Relação Colega").append("\n");
        subMenu_criar_relacao.append("3 - Criar Relação Familiar").append("\n");
        subMenu_criar_relacao.append("0 - Voltar").append("\n");
    }

    private void iniciarSubMenuExcluirRelacao() {
        subMenu_excluir_relacao = new StringBuilder();
        subMenu_excluir_relacao.append("1 - Excluir Relação Amigo").append("\n");
        subMenu_excluir_relacao.append("2 - Excluir Relação Colega").append("\n");
        subMenu_excluir_relacao.append("3 - Excluir Relação Familiar").append("\n");
        subMenu_excluir_relacao.append("0 - Voltar").append("\n");
    }

    private void iniciarSubMenuListarRelacao() {
        subMenu_listar_relacao = new StringBuilder();
        subMenu_listar_relacao.append("1 - Listar Relação Amigo").append("\n");
        subMenu_listar_relacao.append("2 - Listar Relação Colega").append("\n");
        subMenu_listar_relacao.append("3 - Listar Relação Familiar").append("\n");
        subMenu_listar_relacao.append("0 - Voltar").append("\n");
    }


    private void iniciarSubMenuGerenciarGostos(){
        subMenu_gerenciar_gostos = new StringBuilder();
        subMenu_gerenciar_gostos.append("1 - Adicionar Gosto").append("\n");
        subMenu_gerenciar_gostos.append("2 - Adicionar Tipo de Evento do Gostos").append("\n");
        subMenu_gerenciar_gostos.append("3 - Excluir Gosto").append("\n");
        subMenu_gerenciar_gostos.append("4 - Excluir Tipo de Evento do Gostos").append("\n");
        subMenu_gerenciar_gostos.append("5 - Listar Gosto e Tipos de Eventos").append("\n");
        subMenu_gerenciar_gostos.append("0 - Voltar").append("\n");
    }


    private void iniciarMenuCriarEventos() {
        menu_criar_eventos = new StringBuilder();
        menu_criar_eventos.append("1 - Criar Evento").append("\n");
        menu_criar_eventos.append("2 - Editar Evento").append("\n");
        menu_criar_eventos.append("3 - Excluir Evento").append("\n");
        menu_criar_eventos.append("4 - Pesquisar Evento").append("\n");
        menu_criar_eventos.append("5 - Listar Evento").append("\n");
        menu_criar_eventos.append("6 - Gerenciar Grupos de Evento").append("\n");
        menu_criar_eventos.append("0 - Voltar").append("\n");
    }

    private void iniciarSubMenuGerenciarGruposEvento() {
        subMenu_criar_gerenciar_grupos_eventos = new StringBuilder();
        subMenu_criar_gerenciar_grupos_eventos.append("1 - Adicionar Tipo Evento Social").append("\n");
        subMenu_criar_gerenciar_grupos_eventos.append("2 - Adicionar Tipo Evento Profissional").append("\n");
        subMenu_criar_gerenciar_grupos_eventos.append("3 - Adicionar Tipo Evento Familiar").append("\n");
        subMenu_criar_gerenciar_grupos_eventos.append("4 - Excluir Tipo Evento Social").append("\n");
        subMenu_criar_gerenciar_grupos_eventos.append("5 - Excluir Tipo Evento Profissional").append("\n");
        subMenu_criar_gerenciar_grupos_eventos.append("6 - Excluir Tipo Evento Familiar").append("\n");
        subMenu_criar_gerenciar_grupos_eventos.append("7 - Listar Tipo Evento ").append("\n");
        subMenu_criar_gerenciar_grupos_eventos.append("0 - Voltar").append("\n");
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
                    executarSubMenuGerenciarRelacoes();
                    break;
                case 7:
                    executarSubMenuGerenciarGostos();
                    break;
                case  8:
                    adicionarGostoAContato();
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


    void executarSubMenuGerenciarRelacoes() {
        while (true){
            switch (Integer.parseInt(mostrarSubMenuGerenciarRelacoes())) {
                case 0:
                    executarMenuGerenciarContatos();
                    break;
                case 1:
                    executarSubMenuCriarRelacao();
                    break;
                case 2:
                    executarSubMenuExcluirRelacao();
                    break;
                case 3:
                    executarSubMenuListarRelacao();
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
                    adicionarRelacaoAmigo();
                    break;
                case 2:
                    adicionarRelacaoColega();
                    break;
                case 3:
                    adicionarRelacaoFamiliar();
                    break;
            }
        }
    }

    void executarSubMenuExcluirRelacao() {
        while (true){
            switch (Integer.parseInt(mostrarSubMenuExcluirRelacao())) {
                case 0:
                    executarMenuGerenciarContatos();
                    break;
                case 1:
                    excluirRelacaoAmigo();
                    break;
                case 2:
                    excluirRelacaoColega();
                    break;
                case 3:
                    excluirRelacaoFamiliar();
                    break;
            }
        }
    }

    void executarSubMenuListarRelacao() {
        while (true){
            switch (Integer.parseInt(mostrarSubMenuListarRelacao())) {
                case 0:
                    executarMenuGerenciarContatos();
                    break;
                case 1:
                    listarRelacoesAmigos();
                    break;
                case 2:
                    listarRelacoesColegas();
                    break;
                case 3:
                    listarRelacoesFamiliares();
                    break;
            }
        }
    }


    void executarSubMenuGerenciarGostos() {
        while (true){
            switch (Integer.parseInt(mostrarSubMenuGerenciarGostos())) {
                case 0:
                    executarMenuGerenciarContatos();
                    break;
                case 1:
                    adicionarGosto();
                    break;
                case 2:
                    adicionarGostoTipoEvento();
                    break;
                case 3:
                    excluirGosto();
                    break;
                case 4:
                    excluirGostoTipoEvento();
                    break;
                case 5:
                    listarGostosETiposEvento();
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
                case 6:
                    executarSubMenuGerenciarGruposEvento();
                    break;
            }
        }
    }

    void executarSubMenuGerenciarGruposEvento() {
        while (true) {
            switch (Integer.parseInt((mostrarSubMenuGerenciarGruposEvento()))) {
                case 0:
                    executarMenuCriarEventos();
                    break;
                case 1:
                    adicionarTipoEventoSocial();
                    break;
                case 2:
                    adicionarTipoEventoProfissional();
                    break;
                case 3:
                    adicionarTipoEventoFamiliar();
                    break;
                case 4:
                    excluirTipoEventoSocial();
                    break;
                case 5:
                    excluirTipoEventoProfissional();
                    break;
                case 6:
                    excluirTipoEventoFamiliar();
                    break;
                case 7:
                    listarTipoEventos();
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


    private String mostrarSubMenuGerenciarRelacoes() {
        return JOptionPane.showInputDialog(null, subMenu_gerenciar_relacoes);
    }

    private String mostrarSubMenuCriarRelacao() {
        return JOptionPane.showInputDialog(null, subMenu_criar_relacao);
    }

    private String mostrarSubMenuExcluirRelacao() {
        return JOptionPane.showInputDialog(null, subMenu_excluir_relacao);
    }

    private String mostrarSubMenuListarRelacao() {
        return JOptionPane.showInputDialog(null, subMenu_listar_relacao);
    }


    private String mostrarSubMenuGerenciarGostos() {
        return JOptionPane.showInputDialog(null, subMenu_gerenciar_gostos);
    }


    private String mostrarMenuCriarEventos() {
        return JOptionPane.showInputDialog(null, menu_criar_eventos);
    }

    private String mostrarSubMenuGerenciarGruposEvento() {
        return JOptionPane.showInputDialog(null, subMenu_criar_gerenciar_grupos_eventos);
    }

    private String mostrarMenuGerenciarConvidadosEvento() {
        return JOptionPane.showInputDialog(null, menu_gerenciar_convidados_evento);
    }










    // FUNÇÕES DE “GERENCIAR CONTATOS”
    private void criarAmigo() {
        try {
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
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void criarColega() {
        try {
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
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void criarFamiliar() {
        try {
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
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
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

    public void adicionarGostoAContato() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta = gestorContatos.buscarIndice(--indice);
        JOptionPane.showInputDialog(gestorContatos.gotos.listarGostosETiposEvento());
        conta.gostos = gestorContatos.gotos.buscarGosto("");
    }


    public void adicionarRelacaoAmigo() {
        int indice1 = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta1 = gestorContatos.buscarIndice(--indice1);
        int indice2 = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta2 = gestorContatos.buscarIndice(--indice2);
        conta1.relacoes.adicionarAmigo(conta2);
        conta2.relacoes.adicionarAmigo(conta1);
    }

    public void adicionarRelacaoColega() {
        int indice1 = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta1 = gestorContatos.buscarIndice(--indice1);
        int indice2 = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta2 = gestorContatos.buscarIndice(--indice2);
        conta1.relacoes.adicionarColega(conta2);
        conta2.relacoes.adicionarColega(conta1);
    }

    public void adicionarRelacaoFamiliar() {
        int indice1 = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta1 = gestorContatos.buscarIndice(--indice1);
        int indice2 = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta2 = gestorContatos.buscarIndice(--indice2);
        conta1.relacoes.adicionarFamiliar(conta2);
        conta2.relacoes.adicionarFamiliar(conta1);
    }

    public void excluirRelacaoAmigo() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta = gestorContatos.buscarIndice(--indice);
        String nome = JOptionPane.showInputDialog(conta.relacoes.listarRelacoesAmigos());
        conta.relacoes.excluirAmigo(gestorContatos.buscarNome(nome));
    }

    public void excluirRelacaoColega() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta = gestorContatos.buscarIndice(--indice);
        String nome = JOptionPane.showInputDialog(conta.relacoes.listarRelacoesColegas());
        conta.relacoes.excluirColega(gestorContatos.buscarNome(nome));
    }

    public void excluirRelacaoFamiliar() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta = gestorContatos.buscarIndice(--indice);
        String nome = JOptionPane.showInputDialog(conta.relacoes.listarRelacoesFamiliares());
        conta.relacoes.excluirFamiliar(gestorContatos.buscarNome(nome));
    }

    public void listarRelacoesAmigos(){
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta = gestorContatos.buscarIndice(--indice);
        JOptionPane.showMessageDialog(null, conta.relacoes.listarRelacoesAmigos());
    }

    public void listarRelacoesColegas(){
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta = gestorContatos.buscarIndice(--indice);
        JOptionPane.showMessageDialog(null, conta.relacoes.listarRelacoesColegas());
    }

    public void listarRelacoesFamiliares(){
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        Contato conta = gestorContatos.buscarIndice(--indice);
        JOptionPane.showMessageDialog(null, conta.relacoes.listarRelacoesFamiliares());
    }


    public void adicionarGosto() {
        String nome_gosto;
        nome_gosto = JOptionPane.showInputDialog("Nome gosto");
        gestorContatos.gotos.adicionarGosto(nome_gosto);
    }

    public void adicionarGostoTipoEvento() {
        String nome_gosto_tipo_evento;
        String nome_gosto;
        nome_gosto = JOptionPane.showInputDialog("Nome gosto");
        nome_gosto_tipo_evento = JOptionPane.showInputDialog("Nome tipo evento");
        gestorContatos.gotos.adicionarGostoTipoEvento(nome_gosto, nome_gosto_tipo_evento);
    }

    public void excluirGosto() {
        String nome_gosto;
        nome_gosto = JOptionPane.showInputDialog("Nome gosto");
        gestorContatos.gotos.excluirGosto(nome_gosto);
    }

    public void excluirGostoTipoEvento() {
        String nome_gosto_tipo_evento;
        String nome_gosto;
        nome_gosto = JOptionPane.showInputDialog("Nome gosto");
        nome_gosto_tipo_evento = JOptionPane.showInputDialog("Nome tipo evento");
        gestorContatos.gotos.excluirGostoTipoEvento(nome_gosto, nome_gosto_tipo_evento);
    }

    public void listarGostosETiposEvento() {
        JOptionPane.showMessageDialog(null, gestorContatos.gotos.listarGostosETiposEvento());
    }










    // FUNÇÕES DE “CRIAR EVENTOS”
    private void criarEvento() {
        StringBuilder exclusividade = new StringBuilder();
        StringBuilder grupo_evento = new StringBuilder();
        Evento evento = new Evento();
        evento.setTitulo(JOptionPane.showInputDialog("Título do evento"));
        evento.setLocal(JOptionPane.showInputDialog("Local do evento"));
        //evento.setEndereco(JOptionPane.showInputDialog("Endereço do evento"));
        //evento.setData(JOptionPane.showInputDialog("Data do evento"));
        //evento.setHora(JOptionPane.showInputDialog("Hora do evento"));
        evento.setNumero_maximo(Integer.valueOf(JOptionPane.showInputDialog("Numero maximo de participantes")));
        //evento.setValorEntrada(Integer.valueOf(JOptionPane.showInputDialog("Valor da entreada")));
        exclusividade.append("Exclusividade do evento: ").append("\n");
        exclusividade.append("1 - ").append("Evento Fechado").append("\n");
        exclusividade.append("2 - ").append("Evento Reservado").append("\n");
        exclusividade.append("3 - ").append("Evento Regular").append("\n");
        exclusividade.append("4 - ").append("Evento Aberto").append("\n");
        switch (Integer.parseInt(JOptionPane.showInputDialog(exclusividade.toString()))) {
            case 1:
                evento.setExclusividade("Evento Fechado");;
                break;
            case 2:
                evento.setExclusividade("Evento Reservado");;
                break;
            case 3:
                evento.setExclusividade("Evento Regular");;
                break;
            case 4:
                evento.setExclusividade("Evento Aberto");;
                break;
        }
        grupo_evento.append("Grupo do evento: ").append("\n");
        grupo_evento.append("1 - ").append("Evento Social").append("\n");
        grupo_evento.append("2 - ").append("Evento Profissional").append("\n");
        grupo_evento.append("3 - ").append("Evento Familiar").append("\n");
        switch (Integer.parseInt(JOptionPane.showInputDialog(grupo_evento.toString()))) {
            case 1:
                evento.setGrupo_evento(gestorEventos.grupoEvento.getMap_evento_social());
                break;
            case 2:
                evento.setGrupo_evento(gestorEventos.grupoEvento.getMap_evento_profissional());
                break;
            case 3:
                evento.setGrupo_evento(gestorEventos.grupoEvento.getMap_evento_familiar());
                break;
        }
        gestorEventos.adicionaEvento(evento);
    }

    public void editarEvento() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(listarEvento()));
        Evento evento = gestorEventos.buscarIndice(--indice);
        gestorEventos.excluiEvento(--indice);
        criarEvento();
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


    private void adicionarTipoEventoSocial() {
        gestorEventos.grupoEvento.adicionarTipoEventoSocial(JOptionPane.showInputDialog(gestorEventos.grupoEvento.listarTipoEventosSocial()));
    }

    private void adicionarTipoEventoProfissional() {
        gestorEventos.grupoEvento.adicionarTipoEventoProfissional(JOptionPane.showInputDialog(gestorEventos.grupoEvento.listarTipoEventosProfissional()));
    }

    private void adicionarTipoEventoFamiliar() {
        gestorEventos.grupoEvento.adicionarTipoEventoFamiliar(JOptionPane.showInputDialog(gestorEventos.grupoEvento.listarTipoEventosFamiliar()));
    }

    private void excluirTipoEventoSocial() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(gestorEventos.grupoEvento.listarTipoEventosSocial()));
        gestorEventos.grupoEvento.excluirTipoEventoSocial(--indice);
    }

    private void excluirTipoEventoProfissional() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(gestorEventos.grupoEvento.listarTipoEventosProfissional()));
        gestorEventos.grupoEvento.excluirTipoEventoProfissional(--indice);
    }

    private void excluirTipoEventoFamiliar() {
        int indice = Integer.valueOf(JOptionPane.showInputDialog(gestorEventos.grupoEvento.listarTipoEventosFamiliar()));
        gestorEventos.grupoEvento.excluirTipoEventoFamiliar(--indice);
    }

    private void listarTipoEventos() {
        String list_event;
        list_event = gestorEventos.grupoEvento.listarTipoEventosSocial();
        list_event += gestorEventos.grupoEvento.listarTipoEventosProfissional();
        list_event += gestorEventos.grupoEvento.listarTipoEventosFamiliar();
        JOptionPane.showMessageDialog(null, list_event);
    }










    // FUNÇÕES DE “GERENCIAR CONVIDADOS EVENTO”
    public void addConvidadoIndividualmente() {
        int indiceEvento = Integer.valueOf(JOptionPane.showInputDialog(listarEvento()));
        int indiceContato = Integer.valueOf(JOptionPane.showInputDialog(listarContato()));
        gestorEventos.buscarIndice(--indiceEvento).adicionaParticipante(gestorContatos.buscarIndice(--indiceContato));
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
