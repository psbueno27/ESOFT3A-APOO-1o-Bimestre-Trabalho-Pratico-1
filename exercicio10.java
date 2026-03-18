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

public class exercicio10 {
    public static void main(String[] args) {
        int[] number = {18, 68, 2, 31, 17};
        int aux = 0;

        for (int i = 0; i < number.length-1; i++) {
            for (int j = 0; j < number.length-1; j++) {
                if(number[j] > number[j+1]){
                    aux = number[j+1];
                    number[j+1] = number[j];
                    number[j] = aux;
                }
            }
        }
        for (int j = 0; j < number.length; j++) {
            System.out.print("| " + number[j] + " |");
        }
    }
}
/*
1. Declara a classe chamada Exercicio10, que contém o programa.
2. Declara o método principal main, que é o ponto onde o programa começa a executar.
3. Cria um array de inteiros chamado "number" contendo os valores 18, 68, 2, 31 e 17.
4. Cria a variável inteira "aux", que será usada como variável auxiliar para realizar a troca de valores durante a ordenação.
5. Inicia o primeiro laço for responsável por controlar quantas vezes o vetor será percorrido no processo de ordenação.
6. Inicia o segundo laço for que percorre o vetor comparando os elementos vizinhos.
7. Verifica se o elemento atual do vetor é maior que o próximo elemento.
8. Se a condição for verdadeira, armazena temporariamente o valor da posição seguinte na variável auxiliar "aux".
9. Copia o valor da posição atual para a próxima posição do vetor.
10. Coloca o valor armazenado em "aux" na posição atual, completando a troca dos valores.
11. Inicia um laço for para percorrer o vetor já ordenado.
12. Exibe cada número do vetor na mesma linha.
13. Fecha o método main.
14. Fecha a classe Exercicio10.
*/
