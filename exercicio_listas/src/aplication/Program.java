package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
			//<Generic>
		List<String> list = new ArrayList<>();
			
		list.add("Fritz");
		list.add("Frida");
		list.add("Hermann");
		list.add("Schüller");
		list.add("Silva");
		list.add("Ciclano");
		list.add("Cornélios");
		list.add("Beltrano");
		list.add("Baldo");
		list.add(2, "Fulano");
		System.out.println(list.size());
		for (String obj : list) {
			System.out.println(obj);
		}
		System.out.println("---------------------------");
		//list.remove("Hermann");
		//list.remove(0);
		list.removeIf(x -> x.charAt(0) == 'F'); //Função lâmbida por predicado
		for (String obj : list) {
			System.out.println(obj);
		}
		System.out.println(list.size());
		System.out.println("---------------------------");
		System.out.println("Index of Hermann: " + list.indexOf("Hermann"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); //Elemento que não existe na lista retornara -1
		System.out.println("---------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");		
		String nomeC = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
		System.out.println(nomeC);
		
		System.out.println("---------------------------");		
		String nomeJ = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nomeJ);
	}

}
