package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void acioconarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome =  new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //agendaContatos.exibirContato();

        agendaContatos.acioconarContato("Camila", 123456);
        agendaContatos.acioconarContato("Camila", 0);
        agendaContatos.acioconarContato("Camila Vicente", 111111);
        agendaContatos.acioconarContato("Fatima Maria", 8294971);
        agendaContatos.acioconarContato("Camila Ester", 111111);

        //agendaContatos.exibirContato();

        //System.out.println(agendaContatos.pesquisarPorNome("Fatima"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Camila Ester", 555555));
        agendaContatos.exibirContato();
    }
}
