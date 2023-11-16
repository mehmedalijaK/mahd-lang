package org.mahdlang.compiler;

import org.mahdlang.compiler.lexer.Lexer;
import org.mahdlang.compiler.loader.FileLoader;

public class Main {
    public static void main(String[] args) {
        FileLoader fileLoader = FileLoader.getFileLoader();
        Lexer lexer = Lexer.getLexer();

        String code = fileLoader.load("C:\\Users\\mehmedalijak\\Desktop\\RAF\\MahdLang Compiler\\src\\main\\resources\\run.m");

        System.out.println(lexer.lex(code));



    }
}