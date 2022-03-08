package com.swedbank.itacademy.cleancode.singleresponsibility;

public record Book(String name, String author, String text) {

    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        if (word == null) {
            throwException();
        }
        return text.contains(word);
    }

    private void throwException() {
        throw new RuntimeException();
    }

    public void printToConsole() {
        System.out.println(text);
    }
}
