/**************************
 Curso: Engenharia de Software
 Disciplina: Análise e Projeto Orienta a Objetos
 Professor: José Carlos Flores
 Turma: ESOFT3A
 Componentes:
 25004652-2 - Alef Gustavo Antunes Luciano
 25181903-2 - Juan Pablo da Silva Siqueira
 25181992-2 - Pedro de Souza Bueno
 Data:
 Descritivo: Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.
 ***************************/

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = entrada.nextLine();

        int cont = 0;

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                    letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' ||
                    letra == 'O' || letra == 'U') {

                cont++;
            }
        }

        System.out.println("Número de vogais: " + cont);
    }
}
/*
14. Importa a classe Scanner da biblioteca java.util para permitir a leitura de dados digitados pelo usuário.
16. Declara a classe chamada Exercicio8, que é a estrutura principal do programa.
17. Declara o método main, que é o ponto inicial de execução do programa.
19. Cria um objeto Scanner chamado "entrada" para ler dados do teclado usando System.in.
21. Exibe uma mensagem pedindo para o usuário digitar uma palavra ou frase.
22. Lê o texto digitado pelo usuário e armazena na variável chamada "texto".
24. Cria uma variável inteira chamada "contador" que começa com valor 0 e será usada para contar as vogais.
26. Inicia um laço for que percorre cada caractere da string digitada.
28. Usa o método charAt(i) para pegar o caractere da posição atual da string e armazenar na variável "letra".
30. Verifica se o caractere é uma vogal minúscula (a, e, i).
31. Continua a verificação para as vogais minúsculas (o, u).
32. Verifica se o caractere é uma vogal maiúscula (A, E, I).
33. Finaliza a verificação das vogais maiúsculas (O, U).
35. Se a condição do if for verdadeira, incrementa a variável contador somando 1.
36. Fecha o bloco do if.
37. Fecha o laço for que percorre os caracteres da string.
39. Exibe na tela o número total de vogais encontradas na string digitada pelo usuário.
*/
