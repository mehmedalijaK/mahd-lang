package org.mahdlang.compiler.exceptions;

public class LexerException extends RuntimeException {
    public LexerException(String word) {
        super("The word '" + word + "' doesn't belong to any type!");
    }
}
