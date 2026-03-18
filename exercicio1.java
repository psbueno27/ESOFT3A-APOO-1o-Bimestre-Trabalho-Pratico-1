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
Descritivo: Escreva um programa que calcule a soma de dois números.
*******************************************************************************/
package main;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int num1= read.nextInt();
		System.out.print("Digite o segundo número: ");
		int num2= read.nextInt();
		int soma=num1+num2;
		System.out.println("O resultado da soma é " + soma);
		read.close();
	}
}

/******************************************************************************
Esse código em Java cria um programa que recebe dois números digitados, soma eles e mostra seu resultado.

1-A classe exercicio1 é criada, ela contém o programa.
2-O método main é o início do processo.
3-Um Scanner (read) é criado para ler os valores digitados.
4-Dois valores são solicitados ao usuário.
5-Estes valores são armazenados nas variáveis num1 e num2.
6-O programa soma estes valores e armazena o resultado na variável soma.
7-Por último, o programa exibe este resultado na tela.
*******************************************************************************/
