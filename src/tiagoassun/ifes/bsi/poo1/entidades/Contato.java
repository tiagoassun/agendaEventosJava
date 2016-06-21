package tiagoassun.ifes.bsi.poo1.entidades;

import tiagoassun.ifes.bsi.poo1.interfaces.Autenticar;
import tiagoassun.ifes.bsi.poo1.estruturas.Relacao;

import java.util.ArrayList;


public class Contato implements Autenticar {

    private String nome;
    private String celular;
    private String email;
    private String nascimento;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String genero;
    private String proximidade;

    public Relacao relacoes = new Relacao();
    public ArrayList<String> gostos = new ArrayList<String>();




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProximidade() {
        return proximidade;
    }

    public void setProximidade(String proximidade) {
        this.proximidade = proximidade;
    }

    public boolean heAmigo(Contato conta) {
        if (conta instanceof Amigo){
            return true;
        }
        return false;
    }

    public boolean heFamiliar(Contato conta) {
        if (conta instanceof Colega){
            return true;
        }
        return false;
    }

    public boolean heColega(Contato conta) {
        if (conta instanceof Familiar){
            return true;
        }
        return false;
    }

    @Override
    public boolean autentica(Evento event) {
        for (String grupo_event : event.getGrupo_evento().keySet()) {
            if (!(grupo_event == "Evento Social" && this instanceof Amigo)) {
                return false;
            }
            else if (!(grupo_event == "Evento Profissional" && (this instanceof Amigo || this instanceof Colega))) {
                return false;
            }
            else if (!(grupo_event == "Evento Familiar" && (this instanceof Familiar || (this instanceof Amigo && proximidade == "Muito próximo")))) {
                return false;
            }
        }

        if (!(event.getExclusividade() == "Evento Fechado" && proximidade == "Muito próximo")){
            return false;
        }
        else if (!(event.getExclusividade() == "Evento Reservado" && (proximidade == "Muito próximo" || proximidade == "Próximo"))){
            return false;
        }
        else if (!(event.getExclusividade() == "Evento Regular" && (proximidade == "Muito próximo" || proximidade == "Próximo" || proximidade == "Regular"))){
            return false;
        }
        else if (!(event.getExclusividade() == "Evento Aberto" && (proximidade == "Próximo" || proximidade == "Regular" || proximidade == "Distante"))){
            return false;
        }
        return true;
    }
}
