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
 Descritivo: Desenvolva um programa que conte quantas palavras existem em uma string fornecida pelo usuário.
 *******************************************************************************/

import java.util.Scanner;

public class exercicio18 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = read.nextLine();

        frase = frase.trim(); // Remove espaços extras no início e fim

        if (frase.isEmpty()) {
            System.out.println("Quantidade de palavras: 0");
        } else {
            String[] palavras = frase.split("\\s+"); // Divide por espaços
            System.out.println("Quantidade de palavras: " + palavras.length);
        }

        read.close();
    }
}

/********************************************************************
 Esse código em Java cria um programa que conta a quantidade de palavras
 em uma frase digitada pelo usuário.

 1- A classe ContadorPalavras é definida como estrutura principal.
 2- O método main inicia a execução do programa.
 3- Um objeto Scanner é criado para ler a frase digitada.
 4- O usuário digita uma frase, armazenada na variável frase.
 5- O método trim() remove espaços extras no início e no final da frase.
 6- O programa verifica se a frase está vazia.
 7- Caso não esteja vazia, a frase é dividida em palavras usando split().
 8- O critério de separação são espaços (um ou mais).
 9- A quantidade de palavras é obtida pelo tamanho do vetor palavras.
 10- O resultado é exibido no console.
 11- O Scanner é fechado ao final do programa.
 ********************************************************************/