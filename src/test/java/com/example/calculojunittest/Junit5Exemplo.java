package com.example.calculojunittest;


// metodos estaticos da classe Assert do JUnit sao parte importante do teste
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit5Exemplo {
    @Test // anotacao indica metodo e um teste
    public void meuPrimeiroTest() {
        assertEquals(2,1 + 1);
    }
}
