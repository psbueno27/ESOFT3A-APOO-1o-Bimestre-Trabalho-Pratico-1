/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Componentes:
 25004652-2 - Alef Gustavo Antunes Luciano
 25181903-2 - Juan Pablo da Silva Siqueira
 25181992-2 - Pedro de Souza Bueno
Data: 12 de Março de 2026
Descritivo: Escreva um programa que exiba apenas os números pares de 1 a 20.
*******************************************************************************/
package main;

public class exercicio5 {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=20; i++) {
			if(i%2==0) {
				System.out.println("O número " +i +" é par!");
			}
		}
	}
}

/******************************************************************************
Esse código em Java cria um programa que exibe somente os números pares de 1 a 20.

1-A classe exercicio5 é criada, ela contém o programa.
2-O método main é o início do processo.
3-A váriavel i é definida como inteira.
4-O for começa com i sendo 1 e continua o ciclo enquanto i for menor ou igual a 20.
5-Dentro do for, é feito um teste if, onde se o resto da divisão de i por 2 for 0, ele imprime este número como par.
6-Por último, ocorre a execução do for, com cada par sendo imprimido na tela.
*******************************************************************************/