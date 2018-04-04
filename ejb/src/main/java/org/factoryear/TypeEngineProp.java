package org.factoryear;


public enum TypeEngineProp {
    TYPE("Тип"),
    VOLUME("Объём"),
    SERIAL("Серийный номер");

    private String text;

    TypeEngineProp(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
