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
14. Importa a classe Scanner da biblioteca java.util, permitindo que o programa leia dados digitados pelo usuário.
16. Declara a classe chamada Exercicio9, que contém o programa da calculadora.
17. Declara o método principal main, que é o ponto onde o programa começa a ser executado.
19. Cria um objeto Scanner chamado "entrada" para ler dados do teclado.
21. Exibe uma mensagem pedindo para o usuário digitar o primeiro número.
22. Lê o primeiro número digitado e armazena na variável num1.
24. Exibe uma mensagem pedindo para o usuário digitar o segundo número.
25. Lê o segundo número digitado e armazena na variável num2.
27. Mostra uma mensagem informando que o usuário deve escolher uma operação matemática.
28. Mostra a opção 1 que representa a operação de soma.
29. Mostra a opção 2 que representa a operação de subtração.
30. Mostra a opção 3 que representa a operação de multiplicação.
31. Mostra a opção 4 que representa a operação de divisão.
33. Exibe uma mensagem pedindo para o usuário digitar o número da operação desejada.
34. Lê a operação escolhida pelo usuário e armazena na variável operacao.
36. Declara a variável resultado que armazenará o resultado da operação matemática.
38. Inicia a estrutura switch que verifica qual operação o usuário escolheu.
40. Caso o usuário escolha a opção 1, realiza a soma entre num1 e num2.
41. Armazena o resultado da soma na variável resultado.
42. break encerra esse caso do switch para não executar os outros.
44. Caso o usuário escolha a opção 2, realiza a subtração entre num1 e num2.
45. Armazena o resultado da subtração na variável resultado.
46. break encerra esse caso do switch.
48. Caso o usuário escolha a opção 3, realiza a multiplicação entre num1 e num2.
49. Armazena o resultado da multiplicação na variável resultado.
50. break encerra esse caso do switch.
52. Caso o usuário escolha a opção 4, realiza a divisão entre num1 e num2.
53. Armazena o resultado da divisão na variável resultado.
54. break encerra esse caso do switch.
56. Caso o usuário digite uma opção inválida, executa o bloco default.
57. Mostra uma mensagem informando que a operação é inválida.
58. return encerra o programa imediatamente.
61. Mostra na tela o resultado da operação escolhida pelo usuário.
62. Fecha o método main.
63. Fecha a classe Exercicio9.
*/
