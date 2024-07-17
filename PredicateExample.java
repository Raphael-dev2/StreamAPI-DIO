package StreamApiExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* Predicate<T>: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.*/
	
public class PredicateExample {
	
	public static void main(String[] args) {
	    // Criar uma lista de números inteiros
	    List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

	    // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
	    Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() < 5;

	    // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
	    // Imprimir cada palavra que passou no filtro 
	    	palavras.stream()
	        .filter(p -> p.length() > 5)
	        .forEach(System.out::println);
	  }
	}

