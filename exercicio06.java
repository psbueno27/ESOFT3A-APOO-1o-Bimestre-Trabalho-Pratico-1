/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Componentes:
 25004652-2 - Alef Gustavo Antunes Luciano
 25181903-2 - Juan Pablo da Silva Siqueira
 25181992-2 - Pedro de Souza Bueno
Data: 05 de Março de 2026
Descritivo: Escreva um programa que leia 5 números do usuário e os armazene em um array, depois exiba todos os
números.
*******************************************************************************/
package main;

import java.util.Scanner; 

public class exercicio06 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i;
		int [] mat= new int[5];
		for(i=0;i<5;i++) {
			System.out.print("Digite os números desejados:");
			mat[i]=read.nextInt();
		}
		System.out.println("Os números do array são: ");
		for(i=0;i<5;i++) {
			System.out.print(" "+mat[i]);
		}
	}
}

/******************************************************************************
Esse código em Java cria um programa que recebe três números digitados, calcula e mostra sua média.

1-A classe exercicio06 é criada, ela contém o programa.
2-O método main é o início do processo.
3-Um Scanner (read) é criado para ler os valores digitados.
4-Cinco valores são solicitados ao usuário através de um laço for.
5-Estes valores são armazenados no array mat[];
6-Por último, o programa imprime os valores desse array na tela.
*******************************************************************************/
			
			
		
