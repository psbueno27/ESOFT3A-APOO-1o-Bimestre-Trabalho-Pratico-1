/******************************************************************************
 Curso: Engenharia de Software
 Disciplina: Análise e Projeto Orienta a Objetos
 Professor: José Carlos Flores
 Turma: ESOFT3A
 Componentes:
 25004652-2 - Alef Gustavo Antunes Luciano
 25181903-2 - Juan Pablo da Silva Siqueira
 25181992-2 - Pedro de Souza Bueno
 Data: 05 de Março de 2026
 Descritivo: Escreva um programa que defina uma interface Veiculo com métodos acelerar() e frear(), e implemente
 essa interface em uma classe Carro.
 *******************************************************************************/

// Interface Veiculo
interface Veiculo {
    void acelerar();
    void frear();
}

// Classe Carro que implementa a interface
class Carro implements Veiculo {

    private int velocidade;

    public Carro() {
        this.velocidade = 0;
    }

    @Override
    public void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        velocidade -= 10;
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
    }
}

// Classe principal para testar
public class exercicio13 {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.acelerar();
        carro.acelerar();
        carro.frear();
    }
}

/********************************************************************
 Esse código em Java define uma interface Veiculo com ações básicas de
 um veículo e implementa essas ações em uma classe Carro.

 1- A interface Veiculo é criada com dois métodos: acelerar() e frear().
 2- A classe Carro implementa a interface Veiculo, sendo obrigada a
 definir os métodos acelerar() e frear().
 3- A variável velocidade é criada para controlar a velocidade do carro.
 4- O construtor Carro inicializa a velocidade com valor 0.
 5- O método acelerar() aumenta a velocidade em 10 e exibe o valor atual.
 6- O método frear() diminui a velocidade em 10.
 7- Caso a velocidade fique menor que 0, ela é ajustada para 0.
 8- A classe exercicio13 contém o método main, que inicia o programa.
 9- Um objeto carro é criado a partir da classe Carro.
 10- O método acelerar() é chamado duas vezes, aumentando a velocidade.
 11- O método frear() é chamado uma vez, diminuindo a velocidade.
 12- As mensagens com a velocidade atual são exibidas no console.
 ********************************************************************/