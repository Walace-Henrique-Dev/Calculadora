import kotlin.math.pow

fun main(args: Array<String>) {
   /*
   Exercício 1

1 - Criem um novo projeto que se chama Calculadora
2 - Implemente uma função para cada operação aritmética

- Adição
- Subtração
- Multiplicação
- Divisão

3 - Na função Main, chame todas as funções com valores diferentes (pelo menos uma vez)
4 - Se desafiem, adicionando, ainda, uma função para calcular a potência de um número, com qualquer expoente.
    */


    adicao(1,2)
    substracao(3,4)
    multiplacacao(5,6)
    divisao(7.0,8.0)
    potencia(9.0,10.0)




}

    fun adicao( num1: Int, num2: Int){
       var result = num1 + num2
        println("O resultado da adição é: $result ")
    }
    fun substracao( num1: Int, num2: Int){
        var result = num1 - num2
        println("O resultado da subtração é: $result ")

    }
    fun multiplacacao( num1: Int, num2: Int) {
        var result = num1 * num2
        println("O resultado da multiplação é: $result ")
    }
    fun divisao( num1: Double, num2: Double){
        var result = num1 / num2
        println("O resultado da divisão é: $result ")
    }
    fun potencia( num1: Double, num2: Double){
        var result = num1.pow(num2)
        println("O resultado da potencia é: $result ")
    }


