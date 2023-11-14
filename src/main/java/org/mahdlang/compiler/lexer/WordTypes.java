package org.mahdlang.compiler.lexer;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordTypes {
    public static final Map<String, WordType> REGEXES = new LinkedHashMap<>();

    private static void putWordTypeToMap(WordType word) {
        REGEXES.put(word.getRegex(), word);
    }

    public static final WordType INT_TYPE_WORD
            = new WordType("int", ":number");

    public static final WordType DOUBLE_TYPE_WORD
            = new WordType("double", " :double");

    public static final WordType CHAR_TYPE_WORD
            = new WordType("char", " :char");

    public static final WordType STRING_TYPE_WORD
            = new WordType("string", " :string");

    public static final WordType STRING_ARRAY_WORD
            = new WordType("array string", " :string[]");

    public static final WordType STRING_MATRIX_WORD
            = new WordType("matrix string", " :string[][]");

    public static final WordType INT_ARRAY_WORD
            = new WordType("array number", " :number[]");

    public static final WordType INT_MATRIX_WORD
            = new WordType("matrix number", " :number[][]");

    public static final WordType DOUBLE_ARRAY_WORD
            = new WordType("array double", " :double[]");

    public static final WordType DOUBLE_MATRIX_WORD
            = new WordType("matrix double", " :double[][]");

    public static final WordType CHAR_ARRAY_WORD
            = new WordType("array char", " :char[]");

    public static final WordType CHAR_MATRIX_WORD
            = new WordType("matrix char", " :char[][]");

    public static final WordType MAIN_WORD
            = new WordType("main", "main");

    public static final WordType ASSIGN_WORD
            = new WordType("assign", "\\=");

    public static final WordType INPUT_WORD
            = new WordType("input", "input");

    public static final WordType PRINT_WORD
            = new WordType("print", "print");

    public static final WordType PLUS_WORD
            = new WordType("plus", "\\+");

    public static final WordType MINUS_WORD
            = new WordType("minus", "\\-");

    public static final WordType TIMES_WORD
            = new WordType("times", "\\*");

    public static final WordType DIV_WORD
            = new WordType("div", "/");

    public static final WordType MOD_WORD
            = new WordType("mod", "\\%");

    public static final WordType INCREMENT_WORD
            = new WordType("increment", "++");

    public static final WordType DECREMENT_WORD
            = new WordType("decrement", "--");

    public static final WordType EQUALS_SIGN
            = new WordType("equals", "\\=\\=");

    public static final WordType NOT_EQUALS_SIGN
            = new WordType("not equals", "\\!\\=");

    public static final WordType LESS_THAN_SIGN
            = new WordType("less", "\\<");

    public static final WordType LESS_OR_EQUALS_SIGN
            = new WordType("less or equals", "\\<\\=");

    public static final WordType GREATER_THAN_SIGN
            = new WordType("greater", "\\>");

    public static final WordType GREATER_OR_EQUALS_SIGN
            = new WordType("greater or equals", "\\>\\=");

    public static final WordType LOGICAL_AND_WORD
            = new WordType("logand", "&&");

    public static final WordType LOGICAL_OR_WORD
            = new WordType("logor", "\\|\\|");

    public static final WordType LOGICAL_NOT_WORD
            = new WordType("lognot", "\\!");


    static {

    }

    private WordTypes() {

    }
}
