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
 Descritivo: Implemente uma calculadora de Índice de Massa Corporal (IMC) que receba peso (kg) e altura (m) e
 exiba o resultado com a classificação correspondente (ex: abaixo do peso, normal, etc.).
 *******************************************************************************/

import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = read.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = read.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III");
        }

        read.close();
    }
}

/********************************************************************
 Esse código em Java cria um programa que calcula o Índice de Massa
 Corporal (IMC) com base no peso e altura informados pelo usuário e
 exibe a classificação correspondente.

 1- A classe CalculadoraIMC é definida como estrutura principal.
 2- O método main inicia a execução do programa.
 3- Um objeto Scanner é criado para ler dados do teclado.
 4- O usuário informa seu peso em quilogramas.
 5- O usuário informa sua altura em metros.
 6- O IMC é calculado usando a fórmula: peso / (altura * altura).
 7- O valor do IMC é exibido com duas casas decimais.
 8- Estruturas condicionais (if/else) determinam a classificação.
 9- A classificação é exibida conforme o valor do IMC.
 10- O Scanner é fechado ao final do programa.
 ********************************************************************/
