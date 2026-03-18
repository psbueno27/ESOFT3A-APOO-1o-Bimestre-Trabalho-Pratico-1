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
 Descritivo: Escreva um programa que valide uma senha de acordo com os seguintes critérios:
 -Pelo menos 8 caracteres
 -Pelo menos uma letra maiúscula
 -Pelo menos uma letra minúscula
 -Pelo menos um número
 *******************************************************************************/

import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = read.nextLine();

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        if (senha.length() >= 8) {

            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);

                if (Character.isUpperCase(c)) {
                    temMaiuscula = true;
                } else if (Character.isLowerCase(c)) {
                    temMinuscula = true;
                } else if (Character.isDigit(c)) {
                    temNumero = true;
                }
            }

            if (temMaiuscula && temMinuscula && temNumero) {
                System.out.println("Senha válida!");
            } else {
                System.out.println("Senha inválida!");
            }

        } else {
            System.out.println("Senha inválida! Deve ter pelo menos 8 caracteres.");
        }

        read.close();
    }
}

/********************************************************************
 Esse código em Java cria um programa que valida uma senha com base
 em critérios de segurança.

 1- A classe ValidadorSenha é definida como estrutura principal.
 2- O método main inicia a execução do programa.
 3- Um objeto Scanner é criado para ler a senha digitada.
 4- O usuário digita uma senha, armazenada na variável senha.
 5- Variáveis booleanas são criadas para verificar critérios da senha.
 6- O programa verifica se a senha possui pelo menos 8 caracteres.
 7- Um laço percorre cada caractere da senha.
 8- É verificado se há letra maiúscula, minúscula e número.
 9- Se todos os critérios forem atendidos, a senha é considerada válida.
 10- Caso contrário, a senha é considerada inválida.
 11- O Scanner é fechado ao final do programa.
 ********************************************************************/
