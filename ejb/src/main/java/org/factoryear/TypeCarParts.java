package org.factoryear;


public enum TypeCarParts {
    ENGIN("Двигатель"),
    TRANSMISSION("Трансмиссия"),
    CARBODY("Кузов");

    private String text;

    TypeCarParts(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
