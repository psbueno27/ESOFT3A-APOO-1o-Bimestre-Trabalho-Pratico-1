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

public class Exercicio12 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 36);
        Aluno pessoa2 = new Aluno("Gabriel", 19, 2025173);

        pessoa1.dados();
        System.out.println();
        pessoa2.dados();
    }
}
/*
14. Declara a classe Pessoa, que representa uma pessoa no programa.
15. Declara o atributo privado "nome", que armazenará o nome da pessoa.
16. Declara o atributo privado "idade", que armazenará a idade da pessoa.
18. Declara o construtor da classe Pessoa, que recebe nome e idade como parâmetros.
19. Usa a palavra-chave "this" para atribuir o valor recebido ao atributo nome da classe.
20. Usa a palavra-chave "this" para atribuir o valor recebido ao atributo idade da classe.
23. Declara o método dados(), responsável por exibir as informações da pessoa.
24. Mostra o nome armazenado no objeto.
25. Mostra a idade armazenada no objeto.
29. Declara a classe Aluno que herda da classe Pessoa utilizando "extends".
30. Declara o atributo privado "matricula", que armazenará a matrícula do aluno.
32. Declara o construtor da classe Aluno, que recebe nome, idade e matrícula como parâmetros.
33. Usa a palavra-chave "super" para chamar o construtor da classe pai (Pessoa).
34. Atribui o valor recebido ao atributo matricula da classe Aluno.
37. A anotação @Override indica que o método da classe pai está sendo sobrescrito.
38. Declara novamente o método dados(), agora na subclasse Aluno.
39. Chama o método dados() da classe pai usando "super".
40. Exibe a matrícula do aluno.
44. Declara a classe Execicio12 que contém o método principal do programa.
45. Declara o método main, que é o ponto de início da execução do programa.
46. Cria um objeto da classe Pessoa chamado pessoa1 com nome e idade.
47. Cria um objeto da classe Aluno chamado pessoa2 com nome, idade e matrícula.
49. Chama o método dados() do objeto pessoa1 para mostrar suas informações.
50. Imprime uma linha em branco para separar as saídas.
51. Chama o método dados() do objeto pessoa2, que mostrará nome, idade e matrícula devido à sobrescrita do método.
*/