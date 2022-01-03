package com.shooping.shoppingapp.product.domain;

public enum MoneyType {
    USD( "Dolar", "$"),
    EUR("Euro", "€"),
    TL("Turk Lirasi", "₺");

    private String label; // Dollar
    private String symbol; // $

    MoneyType(String label, String symbol) {
        this.label = label;
        this.symbol = symbol;
    }
}
