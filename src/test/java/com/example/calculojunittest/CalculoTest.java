package com.example.calculojunittest;

import com.example.calculojunittest.processos.Calculo;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Por que usar JUNIT?
//1 ele faz teste de unidade (verificar se o metodo java esta fazendo o que era esperado)
//2 facilita criacao, execucao e apresentacao por console ou interface grafica de teste de unidade
//3 e orientado a objeto (tem classes, objetos, metodos de classe, metodos do objeto)
//4 e free nao precisa pagar licenca
public class CalculoTest {
    public void testExecutaCalculo() {
        // define os valores a serem calculados e testados
        float passaValor1 = 10;
        float passaValor2 = 5;
        float retornoEsperado = 15;

        // invoca o metodo static 'executaCalculo' da class 'Calculo' e armazena o resultado nele numa variavel
        float retornoFeito = Calculo.executaCalculo(passaValor1, passaValor2);

        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
