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
 Descritivo: Escreva um programa que defina uma classe Pessoa com atributos nome e idade, e métodos para exibir esses atributos.
 ***************************/

import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void Dados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

public class Exercicio11 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome =entrada.nextLine();

        System.out.println("Escreva sua idade: ");
        int idade =entrada.nextInt();

        Pessoa pessoa1 = new Pessoa(nome, idade);
        pessoa1.Dados();
    }
}
/*
14. Importa a classe Scanner da biblioteca java.util para permitir a leitura de dados digitados pelo usuário.
16. Declara a classe Pessoa, que representa uma pessoa no programa.
17. Declara o atributo privado "nome", que armazenará o nome da pessoa.
18. Declara o atributo privado "idade", que armazenará a idade da pessoa.
20. Declara o construtor da classe Pessoa, que recebe nome e idade como parâmetros quando o objeto é criado.
21. Usa a palavra-chave "this" para atribuir o valor recebido ao atributo nome da classe.
22. Usa a palavra-chave "this" para atribuir o valor recebido ao atributo idade da classe.
25. Declara o método chamado Dados(), responsável por mostrar as informações da pessoa.
26. Exibe o nome armazenado no objeto.
27. Exibe a idade armazenada no objeto.
31. Declara a classe Exercicio11 que contém o método principal do programa.
32. Declara o método main, que é o ponto de início da execução do programa.
34. Cria um objeto Scanner chamado "entrada" para ler dados do teclado.
36. Mostra uma mensagem pedindo para o usuário digitar seu nome.
37. Lê o nome digitado e armazena na variável nome.
39. Mostra uma mensagem pedindo para o usuário digitar sua idade.
40. Lê a idade digitada e armazena na variável idade.
42. Cria um objeto da classe Pessoa chamado pessoa1, passando o nome e a idade para o construtor.
43. Chama o método Dados() do objeto pessoa1 para exibir as informações armazenadas.
44. Fecha o método main.
45. Fecha a classe Exercicio11.
*/