package br.com.geofusion.cart;

import java.math.BigDecimal;

/**
 * Classe que representa um item no carrinho de compras.
 */
public class Item {
    private final Product product;
    private final BigDecimal unitPrice;
    private final int quantity;

    /**
     * Construtor da classe Item.
     *
     * @param product O produto associado ao item.
     * @param unitPrice O preço unitário do produto.
     * @param quantity A quantidade de unidades do produto.
     * @throws IllegalArgumentException se os parâmetros forem inválidos.
     */
    public Item(Product product, BigDecimal unitPrice, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }
        if (unitPrice == null || unitPrice.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O preço unitário deve ser maior que zero.");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    /**
     * Retorna o produto associado ao item.
     *
     * @return Produto.
     */
    public Product getProduct() {
        return this.product;
    }

    /**
     * Retorna o valor unitário do item.
     *
     * @return BigDecimal.
     */
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    /**
     * Retorna a quantidade do produto no item.
     *
     * @return int.
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Retorna o valor total do item, calculado como preço unitário multiplicado pela quantidade.
     *
     * @return BigDecimal.
     */
    public BigDecimal getAmount() {
        return this.unitPrice.multiply(BigDecimal.valueOf(this.quantity));
    }
}
