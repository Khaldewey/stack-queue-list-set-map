package one.digitalinnovation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();
        Queue<Carro> queueCarros = new LinkedList<>();
        List<Carro> listCarros = new ArrayList<>();
        Set<Carro> hashSetCarros = new HashSet<>();
        Set<Carro> treeSetCarros = new TreeSet<>();
        Map<String, String> aluno = new HashMap<>();
        Map<String, String> aluno2 = new HashMap<>();

        aluno.put("Nome","João");
        aluno.put("Idade","17");
        aluno.put("Media","8.5");
        aluno.put("Turma","3a");

        aluno2.put("Nome","Maria");
        aluno2.put("Idade","18");
        aluno2.put("Media","8.9");
        aluno2.put("Turma","3b");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String,String>> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno);
        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);
        System.out.println(aluno.containsKey("Nome"));
        /*treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hashSetCarros);
        System.out.println(treeSetCarros);*/

        /*listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        System.out.println(listCarros.contains(new Carro("Ford")));
        System.out.println(listCarros.get(2));
        System.out.println(listCarros.indexOf(new Carro("Fiat")));
        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);*/

        /*queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Hyundai")));
        System.out.println(queueCarros);
        System.out.println(queueCarros.offer(new Carro("Renault")));

        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros.size());


        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Fiat"));
        stackCarros.push(new Carro("Chevrolet"));*/

        /*System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);*/


    }
}
