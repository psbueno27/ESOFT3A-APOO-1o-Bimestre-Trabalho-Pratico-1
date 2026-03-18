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
 Descritivo: Escreva um programa que use herança para criar uma classe Aluno que herda de Pessoa e adiciona um atributo matricula.
 ***************************/

class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void dados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Matricula do Aluno: " + matricula);
    }
}

public class exercicio12 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 36);
        Aluno pessoa2 = new Aluno("Gabriel", 19, 2025173);

        pessoa1.dados();
        System.out.println();
        pessoa2.dados();
    }
}
/*
1. Declara a classe Pessoa, que representa uma pessoa no programa.
2. Declara o atributo privado "nome", que armazenará o nome da pessoa.
3. Declara o atributo privado "idade", que armazenará a idade da pessoa.
4. Declara o construtor da classe Pessoa, que recebe nome e idade como parâmetros.
5. Usa a palavra-chave "this" para atribuir o valor recebido ao atributo nome da classe.
6. Usa a palavra-chave "this" para atribuir o valor recebido ao atributo idade da classe.
7. Declara o método dados(), responsável por exibir as informações da pessoa.
8. Mostra o nome armazenado no objeto.
9. Mostra a idade armazenada no objeto.
10. Declara a classe Aluno que herda da classe Pessoa utilizando "extends".
11. Declara o atributo privado "matricula", que armazenará a matrícula do aluno.
12. Declara o construtor da classe Aluno, que recebe nome, idade e matrícula como parâmetros.
13. Usa a palavra-chave "super" para chamar o construtor da classe pai (Pessoa).
14. Atribui o valor recebido ao atributo matricula da classe Aluno.
15. A anotação @Override indica que o método da classe pai está sendo sobrescrito.
16. Declara novamente o método dados(), agora na subclasse Aluno.
17. Chama o método dados() da classe pai usando "super".
18. Exibe a matrícula do aluno.
19. Declara a classe Execicio12 que contém o método principal do programa.
20. Declara o método main, que é o ponto de início da execução do programa.
21. Cria um objeto da classe Pessoa chamado pessoa1 com nome e idade.
22. Cria um objeto da classe Aluno chamado pessoa2 com nome, idade e matrícula.
23. Chama o método dados() do objeto pessoa1 para mostrar suas informações.
24. Imprime uma linha em branco para separar as saídas.
25. Chama o método dados() do objeto pessoa2, que mostrará nome, idade e matrícula devido à sobrescrita do método.
*/
