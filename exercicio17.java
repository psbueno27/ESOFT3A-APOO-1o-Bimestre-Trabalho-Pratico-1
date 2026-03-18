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
 Descritivo: Desenvolva um jogo onde o computador sorteie um número entre 1 e 100, e o usuário tente adivinhá-lo.
 O programa deve dar dicas ("maior" ou "menor") até o acerto.
 *******************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class exercicio17 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100
        int palpite;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = read.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("Dica: maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Dica: menor!");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }

        } while (palpite != numeroSecreto);

        read.close();
    }
}

/********************************************************************
 Esse código em Java cria um jogo de adivinhação onde o usuário tenta
 descobrir um número secreto gerado pelo computador.

 1- A classe JogoAdivinhacao é definida como estrutura principal.
 2- O método main inicia a execução do programa.
 3- Um objeto Scanner é criado para ler os palpites do usuário.
 4- Um objeto Random é criado para gerar números aleatórios.
 5- O programa sorteia um número entre 1 e 100.
 6- O usuário é solicitado a digitar um palpite.
 7- Um laço do-while repete até o usuário acertar o número.
 8- Se o palpite for menor que o número, o programa indica "maior".
 9- Se o palpite for maior, o programa indica "menor".
 10- Quando o usuário acerta, o programa exibe mensagem de sucesso.
 11- O Scanner é fechado ao final do programa.
 ********************************************************************/