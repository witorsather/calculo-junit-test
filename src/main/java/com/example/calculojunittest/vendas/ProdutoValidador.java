package com.example.calculojunittest.vendas;

import com.example.calculojunittest.entity.Produto;
import com.example.calculojunittest.enums.EnumProdutoStatus;
import com.example.calculojunittest.exception.ProdutoAtivadoSemPrecoException;

public class ProdutoValidador {
    public void validar(Produto produto) throws Exception {
        if (produto.getPreco() <= 0 && (produto.getStatus() == null || produto.getStatus() == EnumProdutoStatus.ATIVO)) {
            throw new ProdutoAtivadoSemPrecoException("Produto ativado sem preço");
        }
    }
}
