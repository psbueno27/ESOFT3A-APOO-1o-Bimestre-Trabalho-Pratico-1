/**************************
 Curso: Engenharia de Software
 Disciplina: Análise e Projeto Orienta a Objetos
 Professor: José Carlos Flores
 Turma: ESOFT3A
 Componentes:
 25004652-2 - Alef Gustavo Antunes Luciano
 25181903-2 - Juan Pablo da Silva Siqueira
 25181992-2 - Pedro de Souza Bueno
 Data: 16 de Março de 2026
 Descritivo: Criar uma calculadora simples de quatro operações (+ - * /).
 ***************************/

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite outro número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Digite a operação: ");
        int operacao = entrada.nextInt();

        double resultado = 0;

        switch (operacao) {

            case 1:
                resultado = num1 + num2;
                break;

            case 2:
                resultado = num1 - num2;
                break;

            case 3:
                resultado = num1 * num2;
                break;

            case 4:
                resultado = num1 / num2;
                break;

            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
/* 
1. Importa a classe Scanner da biblioteca java.util, permitindo que o programa leia dados digitados pelo usuário.
2. Declara a classe chamada Exercicio09, que contém o programa da calculadora.
3. Declara o método principal main, que é o ponto onde o programa começa a ser executado.
4. Cria um objeto Scanner chamado "entrada" para ler dados do teclado.
5. Exibe uma mensagem pedindo para o usuário digitar o primeiro número.
6. Lê o primeiro número digitado e armazena na variável num1.
7. Exibe uma mensagem pedindo para o usuário digitar o segundo número.
8. Lê o segundo número digitado e armazena na variável num2.
9. Mostra uma mensagem informando que o usuário deve escolher uma operação matemática.
10. Mostra a opção 1 que representa a operação de soma.
11. Mostra a opção 2 que representa a operação de subtração.
12. Mostra a opção 3 que representa a operação de multiplicação.
13. Mostra a opção 4 que representa a operação de divisão.
14. Exibe uma mensagem pedindo para o usuário digitar o número da operação desejada.
15. Lê a operação escolhida pelo usuário e armazena na variável operacao.
16. Declara a variável resultado que armazenará o resultado da operação matemática.
17. Inicia a estrutura switch que verifica qual operação o usuário escolheu.
18. Caso o usuário escolha a opção 1, realiza a soma entre num1 e num2.
19. Armazena o resultado da soma na variável resultado.
20. break encerra esse caso do switch para não executar os outros.
21. Caso o usuário escolha a opção 2, realiza a subtração entre num1 e num2.
22. Armazena o resultado da subtração na variável resultado.
23. break encerra esse caso do switch.
24. Caso o usuário escolha a opção 3, realiza a multiplicação entre num1 e num2.
25. Armazena o resultado da multiplicação na variável resultado.
26. break encerra esse caso do switch.
27. Caso o usuário escolha a opção 4, realiza a divisão entre num1 e num2.
28. Armazena o resultado da divisão na variável resultado.
29. break encerra esse caso do switch.
30. Caso o usuário digite uma opção inválida, executa o bloco default.
31. Mostra uma mensagem informando que a operação é inválida.
32. return encerra o programa imediatamente.
33. Mostra na tela o resultado da operação escolhida pelo usuário.
34. Fecha o método main.
35. Fecha a classe Exercicio9.
*/
