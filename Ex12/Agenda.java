package ExercíciosPOO.Ex12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
    List<Pessoa> agenda = new ArrayList<>(10);

    public void armazenarPessoa(String nome, int idade, float altura) {
        Pessoa p = new Pessoa(nome, idade, altura);
        if (!agenda.contains(p)) {
            agenda.add(p);
        } 
    }

    public void removerPessoa(String nome) {
        agenda.removeIf(Pessoa -> Pessoa.getNome() == nome);
    }

    public int buscarPessoa(String nome) {
        Iterator busca = agenda.iterator();
        int achou = 0;
        int resultado = -1;
        while (busca.hasNext() && achou == 0) {
            Pessoa agendaBusca = (Pessoa) busca.next();
            if (agendaBusca.getNome().equals(nome)) {
                resultado = agenda.indexOf(agendaBusca);
                achou = 1;
            }
        }
        return resultado;
    }

    public void imprimirAgenda() {
        for (Pessoa pessoa : agenda) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Altura: " + pessoa.getAltura());
            System.out.println("");
        }
    }

    public void imprimirPessoa(int index) {

        System.out.println("Nome: " + agenda.get(index).getNome());
        System.out.println("Idade: " + agenda.get(index).getIdade());
        System.out.println("Altura: " + agenda.get(index).getAltura());
    }
}
