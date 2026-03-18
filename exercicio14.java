/******************************************************************************
 Curso: Engenharia de Software
 Disciplina: Análise e Projeto Orienta a Objetos
 Professor: José Carlos Flores
 Turma: ESOFT3A
 Componentes:
 25004652-2 - Alef Gustavo Antunes Luciano
 25181903-2 - Juan Pablo da Silva Siqueira
 25181992-2 - Pedro de Souza Bueno
 Data: 18 de Março de 2026
 Descritivo: Escreva um programa que solicite um número inteiro e exiba sua tabuada de 1 a 10.
 *******************************************************************************/

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = read.nextInt();

        System.out.println("Tabuada do " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        read.close();
    }
}

/********************************************************************
 Esse código em Java cria um programa que solicita um número inteiro
 e exibe a sua tabuada de 1 a 10.

 1- A classe exercicioTabuada é definida como a estrutura principal.
 2- O método main inicia a execução do programa.
 3- Um objeto Scanner (read) é criado para ler dados do teclado.
 4- O usuário digita um número inteiro, armazenado na variável num.
 5- Uma mensagem é exibida indicando a tabuada do número digitado.
 6- Um laço for é utilizado para repetir de 1 até 10.
 7- Em cada repetição, é feita a multiplicação do número por i.
 8- O resultado de cada multiplicação é exibido no console.
 9- O Scanner é fechado ao final do programa.
 ********************************************************************/
