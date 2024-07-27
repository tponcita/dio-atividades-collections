package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map <String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Emi", 2468);
        agendaContatos.adicionarContato("Emi", 1357);
        agendaContatos.adicionarContato("Emi Freitas", 1234);
        agendaContatos.adicionarContato("Emi Macedo", 5678);
        agendaContatos.adicionarContato("Polenta", 8642);
        agendaContatos.adicionarContato("Emi", 9753);


        agendaContatos.exibirContato();

        agendaContatos.removerContato("Polenta");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Emi Macedo"));
    }
}


