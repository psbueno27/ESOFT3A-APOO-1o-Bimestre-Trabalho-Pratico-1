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
 Descritivo: Escreva um programa que encontre o maior número em um array de inteiros.
 ***************************/

public class exercicio07 {
    public static void main(String[] args) {
        int[] number = {18, 68, 2, 31, 17};
        int aux = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > aux) {
                aux =  number[i];
            }
        }
        System.out.println("Maior numero = " + aux);
    }
}
/*
1. Declara a classe chamada Exercicio07, que contém o programa.
2. Declara o método principal main, que é o ponto de início da execução do programa.
3. Cria um array de inteiros chamado "number" contendo os valores 18, 68, 2, 31 e 17.
4. Cria a variável inteira "aux" e inicializa com o primeiro valor do array (posição 0), assumindo inicialmente que ele é o maior número.
5. Inicia um laço for que percorre todas as posições do array "number".
6. Verifica se o valor atual do array (number[i]) é maior que o valor armazenado em "aux".
7. Se o número atual for maior, atualiza a variável "aux" com esse novo valor.
8. Exibe na tela o maior número encontrado no array após o término do laço.
9. Fecha o método main.
10. Fecha a classe Exercicio7.
*/
