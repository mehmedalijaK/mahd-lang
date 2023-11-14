package org.mahdlang.compiler.lexer;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordTypes {
    public static final Map<String, WordType> REGEXES = new LinkedHashMap<>();

    private static void putWordTypeToMap(WordType word) {
        REGEXES.put(word.getRegex(), word);
    }

    public static final WordType NAME_WORD
            = new WordType("name", "[a-zA-Z_][a-zA-Z0-9_]*"); //checked

    public static final WordType INT_TYPE_WORD
            = new WordType("int", ":number"); //checked
    public static final  WordType INT_WORD
            = new WordType("int word", "[+-]?(0[xX][0-9a-fA-F]+|0[0-7]*|[1-9][0-9]*)"); // hex(0x0f), oct (0123) and decimal 123 checked
    public static final WordType INT_ARRAY_TYPE_WORD
            = new WordType("array number", ":number\\[\\]"); //checked
    public static final WordType INT_ARRAY_WORD
            = new WordType("array number word", "\\[(" + INT_WORD.getRegex() + "\\,)*(" + INT_WORD.getRegex() + ")\\]"); //checked
    public static final WordType EMPTY_ARRAY_WORD
            = new WordType("empty array word", "\\[\\]"); //checked
    public static final WordType INT_MATRIX_TYPE_WORD
            = new WordType("matrix number", ":number\\[\\]\\[\\]"); //checked
    public static final WordType INT_MATRIX_WORD
            = new WordType("matrix number word", "(\\{("+INT_ARRAY_WORD.getRegex()+",)*"+INT_ARRAY_WORD.getRegex()+"\\})"); //checked
    public static final WordType EMPTY_MATRIX_WORD
            = new WordType("empty matrix word", "\\{\\[\\]\\}"); //checked

    public static final WordType DOUBLE_TYPE_WORD
            = new WordType("double", ":double"); //checked
    public static final WordType DOUBLE_WORD
            = new WordType("double word", "[+-]?([0-9]+(\\.[0-9]*)?|\\.[0-9]+)"); //checked
    public static final WordType DOUBLE_ARRAY_TYPE_WORD
            = new WordType("array double", ":double\\[\\]"); //checked
    public static final WordType DOUBLE_ARRAY_WORD
            = new WordType("array double word", "\\[((" + DOUBLE_WORD.getRegex() + ",)*(" + DOUBLE_WORD.getRegex() + "))\\]"); //checked
    public static final WordType DOUBLE_MATRIX_TYPE_WORD
            = new WordType("matrix double", ":double\\[\\]\\[\\]"); //checked
    public static final WordType DOUBLE_MATRIX_WORD
            = new WordType("matrix double word", "(\\{("+DOUBLE_ARRAY_WORD.getRegex()+",)*"+DOUBLE_ARRAY_WORD.getRegex()+"\\})"); //checked

    public static final WordType CHAR_TYPE_WORD
            = new WordType("char", ":char"); //checked
    public static final WordType CHAR_WORD
            = new WordType("character", "\\'.\\'"); // \\ -> escape from regex   \ -> escape from java //checked
    public static final WordType CHAR_ARRAY_TYPE_WORD
            = new WordType("array char", ":char\\[\\]"); //checked
    public static final WordType CHAR_ARRAY_WORD
            = new WordType("array char word","\\[((\\'.\\',)*(\\'.\\'))\\]"); //checked
    public static final WordType CHAR_MATRIX_TYPE_WORD
            = new WordType("matrix char", ":char\\[\\]\\[\\]"); //checked
    public static final WordType CHAR_MATRIX_WORD
            = new WordType("matrix char word", "(\\{("+CHAR_ARRAY_WORD.getRegex()+",)*"+CHAR_ARRAY_WORD.getRegex()+"\\})"); //checked

    public static final WordType STRING_TYPE_WORD
            = new WordType("string", ":string"); //checked
    public static final WordType STRING_WORD
            = new WordType("string word", "\\\".*\\\""); //checked
    public static final WordType STRING_ARRAY_TYPE_WORD
            = new WordType("array string", ":string\\[\\]"); //checked
    public static final WordType STRING_ARRAY_WORD
            = new WordType("array string word", "\\[((\\\".*\\\",)*(\\\".*\\\"))\\]"); //checked
    public static final WordType STRING_MATRIX_TYPE_WORD
            = new WordType("matrix string", ":string\\[\\]\\[\\]"); //checked
    public static final WordType STRING_MATRIX_WORD
            = new WordType("matrix string word", "(\\{("+STRING_ARRAY_WORD.getRegex()+",)*"+STRING_ARRAY_WORD.getRegex()+"\\})"); //checked


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
            = new WordType("increment", "\\+\\+");
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
    public static final WordType BITWISE_AND_WORD
            = new WordType("bitwise and", "&");
    public static final WordType BITWISE_OR_WORD
            = new WordType("bitwise or", "\\|");
    public static final WordType SHIFT_RIGHT_WORD
            = new WordType("shift right", "\\>\\>");
    public static final WordType SHIFT_LEFT_WORD
            = new WordType("shift left", "\\<\\<");
    public static final WordType BITWISE_UNARY_NOT_WORD
            = new WordType("bitwise not", "~");
    public static final WordType TERNARY_IF_WORD
            = new WordType("ternary if", "\\?");

    public static final WordType IF_WORD
            = new WordType("if", "if");
    public static final WordType ELIF_WORD
            = new WordType("else if", "elif");
    public static final WordType ELSE_WORD
            = new WordType("else", "else");

    public static final WordType FOR_WORD
            = new WordType("for", "for");
    public static final WordType WHILE_WORD
            = new WordType("while", "while");
    public static final WordType DO_WHILE_WORD
            = new WordType("do while", "do");

    public static final WordType LOAD_ARRAY_WORD
            = new WordType("load array", "loadArray");
    public static final WordType PRINT_ARRAY_WORD
            = new WordType("print array", "printArray");

    public static final WordType LOAD_MATRIX_WORD
            = new WordType("load matrix", "loadMatrix");
    public static final WordType PRINT_MATRIX_WORD
            = new WordType("print matrix", "printMatrix");

    public static final WordType FUNCTION_WORD
            = new WordType("function", "function");

    public static final WordType OPEN_CURLY_BRACKET_WORD
            = new WordType("open curly bracket", "\\{");
    public static final WordType CLOSED_CURLY_BRACKET_WORD
            = new WordType("closed curly bracket", "\\}");

    public static final WordType OPEN_BRACKET_WORD
            = new WordType("open bracket", "\\(");
    public static final WordType CLOSED_BRACKET_WORD
            = new WordType("closed bracket", "\\)");

    public static final WordType OPEN_SQUARE_BRACKET_WORD
            = new WordType("open square bracket", "\\[");
    public static final WordType CLOSED_SQUARE_BRACKET_WORD
            = new WordType("closed square bracket", "\\]");

    public static final WordType RETURN_WORD
            = new WordType("return", "return");

    public static final WordType CLASS_WORD
            = new WordType("class", "Class");

    public static final WordType EXTENDS_CLASS_WORD
            = new WordType("extends", ":");


    static {
        putWordTypeToMap(EMPTY_ARRAY_WORD);
        putWordTypeToMap(OPEN_SQUARE_BRACKET_WORD);
        putWordTypeToMap(CLOSED_SQUARE_BRACKET_WORD);
        putWordTypeToMap(NAME_WORD);
        putWordTypeToMap(INT_TYPE_WORD);
        putWordTypeToMap(INT_WORD);
        putWordTypeToMap(INT_ARRAY_TYPE_WORD);
        putWordTypeToMap(INT_ARRAY_WORD);
        putWordTypeToMap(INT_MATRIX_TYPE_WORD);
        putWordTypeToMap(INT_MATRIX_WORD);
        putWordTypeToMap(EMPTY_MATRIX_WORD);

        putWordTypeToMap(DOUBLE_TYPE_WORD);
        putWordTypeToMap(DOUBLE_WORD);
        putWordTypeToMap(DOUBLE_ARRAY_TYPE_WORD);
        putWordTypeToMap(DOUBLE_ARRAY_WORD);
        putWordTypeToMap(DOUBLE_MATRIX_TYPE_WORD);
        putWordTypeToMap(DOUBLE_MATRIX_WORD);

        putWordTypeToMap(CHAR_TYPE_WORD);
        putWordTypeToMap(CHAR_WORD);
        putWordTypeToMap(CHAR_ARRAY_TYPE_WORD);
        putWordTypeToMap(CHAR_ARRAY_WORD);
        putWordTypeToMap(CHAR_MATRIX_TYPE_WORD);
        putWordTypeToMap(CHAR_MATRIX_WORD);

        putWordTypeToMap(STRING_TYPE_WORD);
        putWordTypeToMap(STRING_WORD);
        putWordTypeToMap(STRING_ARRAY_TYPE_WORD);
        putWordTypeToMap(STRING_ARRAY_WORD);
        putWordTypeToMap(STRING_MATRIX_TYPE_WORD);
        putWordTypeToMap(STRING_MATRIX_WORD);

        putWordTypeToMap(MAIN_WORD);
        putWordTypeToMap(ASSIGN_WORD);
        putWordTypeToMap(INPUT_WORD);
        putWordTypeToMap(PRINT_WORD);

        putWordTypeToMap(PLUS_WORD);
        putWordTypeToMap(MINUS_WORD);
        putWordTypeToMap(TIMES_WORD);
        putWordTypeToMap(DIV_WORD);
        putWordTypeToMap(MOD_WORD);

        putWordTypeToMap(INCREMENT_WORD);
        putWordTypeToMap(DECREMENT_WORD);

        putWordTypeToMap(EQUALS_SIGN);
        putWordTypeToMap(NOT_EQUALS_SIGN);
        putWordTypeToMap(LESS_THAN_SIGN);
        putWordTypeToMap(LESS_OR_EQUALS_SIGN);
        putWordTypeToMap(GREATER_THAN_SIGN);
        putWordTypeToMap(GREATER_OR_EQUALS_SIGN);

        putWordTypeToMap(LOGICAL_AND_WORD);
        putWordTypeToMap(LOGICAL_OR_WORD);
        putWordTypeToMap(LOGICAL_NOT_WORD);
        putWordTypeToMap(BITWISE_AND_WORD);
        putWordTypeToMap(BITWISE_OR_WORD);
        putWordTypeToMap(SHIFT_RIGHT_WORD);
        putWordTypeToMap(SHIFT_LEFT_WORD);
        putWordTypeToMap(BITWISE_UNARY_NOT_WORD);
        putWordTypeToMap(TERNARY_IF_WORD);

        putWordTypeToMap(IF_WORD);
        putWordTypeToMap(ELIF_WORD);
        putWordTypeToMap(ELSE_WORD);

        putWordTypeToMap(FOR_WORD);
        putWordTypeToMap(WHILE_WORD);
        putWordTypeToMap(DO_WHILE_WORD);

        putWordTypeToMap(LOAD_ARRAY_WORD);
        putWordTypeToMap(PRINT_ARRAY_WORD);

        putWordTypeToMap(LOAD_MATRIX_WORD);
        putWordTypeToMap(PRINT_MATRIX_WORD);

        putWordTypeToMap(FUNCTION_WORD);

        putWordTypeToMap(OPEN_CURLY_BRACKET_WORD);
        putWordTypeToMap(CLOSED_CURLY_BRACKET_WORD);

        putWordTypeToMap(OPEN_BRACKET_WORD);
        putWordTypeToMap(CLOSED_BRACKET_WORD);

        putWordTypeToMap(RETURN_WORD);

        putWordTypeToMap(CLASS_WORD);

        putWordTypeToMap(EXTENDS_CLASS_WORD);
    }

    private WordTypes() {

    }
}
