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
Descritivo: Escreva um programa que calcule a média de três notas fornecidas pelo usuário.
*******************************************************************************/
package main;

import java.util.Scanner;
import java.util.Locale;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Digite o primeiro número: ");
		float num1= read.nextFloat();
		System.out.print("Digite o segundo número: ");
		float num2= read.nextFloat();
		System.out.print("Digite o terceiro número: ");
		float num3= read.nextFloat();
		float media=(num1+num2+num3)/3;
		System.out.printf("O resultado da média é %.1f ", media);
		read.close();
	}
}

/******************************************************************************
Esse código em Java cria um programa que recebe três números digitados, calcula e mostra sua média.

1-A classe exercicio3 é criada, ela contém o programa.
2-O método main é o início do processo.
3-Um Scanner (read) é criado para ler os valores digitados, sendo seu Locale configurado para US, para reconhecer o . como separador decimal.
4-Três valores são solicitados ao usuário.
5-Estes valores são armazenados nas variáveis num1, num2 e num3.
6-O programa soma estes valores e divide por três, armazenando este resultado na variável média.
7-Por último, o programa exibe a média na tela usando printf, para exibir só uma casa decimal.
*******************************************************************************/