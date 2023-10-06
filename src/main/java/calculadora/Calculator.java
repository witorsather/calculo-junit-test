package calculadora;

// Importa uma classe chamada DoubleStream do pacote java.util.stream.
// DoubleStream e como um cano onde voce coloca numeros e pode fazer varias coisas com eles.
import java.util.stream.DoubleStream;

// Declara uma classe publica chamada Calculator.
public class Calculator {

    // Metodo estatico chamado "add" que aceita um numero indefinido de operandos do tipo double.
    // O "..." permite que voce insira quantos numeros quiser, como um balde onde voce pode colocar varios tijolos.
    static double add(double... operands) {
        // Usa o DoubleStream para criar um "cano" com todos os numeros e entao soma-los.
        // E como colocar cimento, areia e agua no misturador e obter concreto como resultado.
        return DoubleStream.of(operands)
                .sum();
    }

    // Metodo estatico chamado "multiply" que tambem aceita um numero indefinido de operandos do tipo double.
    static double multiply(double... operands) {
        // Usa o DoubleStream para criar outro "cano" com todos os numeros.
        // Em seguida, usa o metodo "reduce" para multiplicar todos os numeros.
        // Pense no metodo "reduce" como uma forma de empilhar tijolos, um em cima do outro, para construir uma parede.
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }
}

