package com.example.calculojunittest;

import com.example.calculojunittest.entity.Produto;
import com.example.calculojunittest.enums.EnumProdutoStatus;
import com.example.calculojunittest.exception.ProdutoAtivadoSemPrecoException;
import com.example.calculojunittest.vendas.ProdutoValidador;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProdutoValidadorTest {


    @Test
    @DisplayName("Verifica se um produto está ativo e possui um preço válido")
    public void verificaSeProdutoAtivoSemPrecoLancaExcecao() {
        Produto produto = new Produto("Barbeador", "Aparelho de Barbear", 0.0, EnumProdutoStatus.ATIVO);

        ProdutoValidador validador = new ProdutoValidador();
        assertThrows(ProdutoAtivadoSemPrecoException.class, () -> validador.validar(produto));
    }
}
