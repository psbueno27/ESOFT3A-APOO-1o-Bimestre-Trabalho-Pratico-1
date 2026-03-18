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
Descritivo: Escreva um programa que leia um número inteiro e informe se ele é par ou ímpar.
*******************************************************************************/
package main;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int num= read.nextInt();
		read.close();
		
		if(num %2 == 0) {
			System.out.println("O número é par!");
		}
		else{
			System.out.println("O número é ímpar!");
		}
	}
}

/******************************************************************************
Esse código em Java cria um programa que recebe um número digitado, divide ele por dois e a partir de seu resto, determina se é par ou ímpar.

1-A classe exercicio02 é criada, ela contém o programa.
2-O método main é o início do processo.
3-Um Scanner (read) é criado para ler o valor digitado.
4-Um valor é solicitado ao usuário.
5-Este valor é armazenado na variável num.
6-É feito um teste de se (if), no caso se o resto da divisão desse número por dois (num%2) for 0, ele é par.
7-Caso contrário, ele será ímpar.
8-Por último, o programa imprime se é par ou ímpar.
*******************************************************************************/
