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
Descritivo: Faça um programa que converta uma temperatura em graus Celsius para Fahrenheit, utilizando a fórmula:
F = (C × 9/5) + 32
*******************************************************************************/
package main;

import java.util.Scanner;
import java.util.Locale;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Digite a temperatura em celsius: ");
		float celsius= read.nextFloat();
		float fahrenheit= (celsius*9/5) + 32;
		System.out.println("A temperatura em fahrenheit é " + fahrenheit);
		read.close();
	}
}

/******************************************************************************
Esse código em Java cria um programa que recebe uma temperatura em Celsius e a converte para Fahrenheit.

1-A classe exercicio04 é criada, ela contém o programa.
2-O método main é o início do processo.
3-Um Scanner (read) é criado para ler os valores digitados, sendo seu Locale configurado para US, para reconhecer o . como separador decimal.
4-Um valor é solicitado para o usuário.
5-Este valor é armazenado na variável celsius.
6-O programa utiliza a fórmula (C x 9/5) + 32 para a conversão.
7-Por último, o programa exibe a temperatura em Fahrenheit na tela.
*******************************************************************************/
