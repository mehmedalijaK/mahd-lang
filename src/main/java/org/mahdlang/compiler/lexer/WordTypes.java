package org.mahdlang.compiler.lexer;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordTypes {
    public static final Map<String, WordType> REGEXES = new LinkedHashMap<>();

    private static void putWordTypeToMap(WordType word) {
        REGEXES.put(word.getRegex(), word);
    }

    public static final WordType MAIN_WORD
            = new WordType("main", "main"); //added
    public static final WordType NAME_WORD
            = new WordType("name", "[a-zA-Z_][a-zA-Z0-9_]*"); //added
    public static final WordType ASSIGN_WORD
            = new WordType("assign", "\\="); //added
    public static final WordType COMMAND_END
            = new WordType("endcommand", ";"); //added
    public static final WordType COMMAND_ARG
            = new WordType("commandarg", ","); //added
    public static final WordType DEFINE_TYPE
            = new WordType("definetype", "\\:"); //added
    public static final WordType INT_TYPE_WORD
            = new WordType("int", "number"); //added
    public static final  WordType INT_WORD
            = new WordType("intword", "[+-]?(0[xX][0-9a-fA-F]+|0[0-7]*|[1-9][0-9]*)"); // hex(0x0f), oct (0123) and decimal 123 added
    public static final WordType INT_ARRAY_TYPE_WORD
            = new WordType("arraynumber", "number\\[\\]"); //added
    public static final WordType INT_ARRAY_WORD
            = new WordType("arraynumberword", "\\[(" + INT_WORD.getRegex() + "\\,)*(" + INT_WORD.getRegex() + ")\\]"); //added
    public static final WordType EMPTY_ARRAY_WORD
            = new WordType("emptyarrayword", "\\[\\]"); //added
    public static final WordType EMPTY_WORD
            = new WordType("empty", "empty"); //added
    public static final WordType INT_MATRIX_TYPE_WORD
            = new WordType("matrixnumber", "number\\[\\]\\[\\]"); //added
    public static final WordType INT_MATRIX_WORD
            = new WordType("matrixnumberword", "(\\{("+INT_ARRAY_WORD.getRegex()+",)*"+INT_ARRAY_WORD.getRegex()+"\\})"); //added
    public static final WordType EMPTY_MATRIX_WORD
            = new WordType("emptymatrixword", "\\{\\[\\]\\}"); //added
    public static final WordType DOUBLE_TYPE_WORD
            = new WordType("double", "double"); //added
    public static final WordType DOUBLE_WORD
            = new WordType("doubleword", "[+-]?([0-9]+(\\.[0-9]*)?|\\.[0-9]+)"); //added
    public static final WordType DOUBLE_ARRAY_TYPE_WORD
            = new WordType("arraydouble", "double\\[\\]"); //added
    public static final WordType DOUBLE_ARRAY_WORD
            = new WordType("arraydoubleword", "\\[((" + DOUBLE_WORD.getRegex() + ",)*(" + DOUBLE_WORD.getRegex() + "))\\]"); //added
    public static final WordType DOUBLE_MATRIX_TYPE_WORD
            = new WordType("matrixdouble", "double\\[\\]\\[\\]"); //added
    public static final WordType DOUBLE_MATRIX_WORD
            = new WordType("matrix double word", "(\\{("+DOUBLE_ARRAY_WORD.getRegex()+",)*"+DOUBLE_ARRAY_WORD.getRegex()+"\\})"); //added
    public static final WordType CHAR_TYPE_WORD
            = new WordType("char", "char"); //added
    public static final WordType CHAR_WORD
            = new WordType("character", "\\'.\\'"); // \\ -> escape from regex   \ -> escape from java //added
    public static final WordType CHAR_ARRAY_TYPE_WORD
            = new WordType("arraychar", "char\\[\\]"); //added
    public static final WordType CHAR_ARRAY_WORD
            = new WordType("arraycharword","\\[((\\'.\\',)*(\\'.\\'))\\]"); //added
    public static final WordType CHAR_MATRIX_TYPE_WORD
            = new WordType("matrixchar", "char\\[\\]\\[\\]"); //added
    public static final WordType CHAR_MATRIX_WORD
            = new WordType("matrixcharword", "(\\{("+CHAR_ARRAY_WORD.getRegex()+",)*"+CHAR_ARRAY_WORD.getRegex()+"\\})"); //added
    public static final WordType STRING_TYPE_WORD
            = new WordType("string", "string"); //added
    public static final WordType STRING_WORD
            = new WordType("stringword", "\\\".*\\\""); //added
    public static final WordType STRING_ARRAY_TYPE_WORD
            = new WordType("arraystring", "string\\[\\]"); //added
    public static final WordType STRING_ARRAY_WORD
            = new WordType("arraystringword", "\\[((\\\".*\\\",)*(\\\".*\\\"))\\]"); //added
    public static final WordType STRING_MATRIX_TYPE_WORD
            = new WordType("matrixstring", "string\\[\\]\\[\\]"); //added
    public static final WordType STRING_MATRIX_WORD
            = new WordType("matrixstringword", "(\\{("+STRING_ARRAY_WORD.getRegex()+",)*"+STRING_ARRAY_WORD.getRegex()+"\\})"); //added
    public static final WordType STRING_LEN_WORD
            = new WordType("lenstringword", "([a-zA-Z_][a-zA-Z0-9_]*).len"); //added
    public static final WordType ARRAY_SIZE_WORD
            = new WordType("sizearrayword", "([a-zA-Z_][a-zA-Z0-9_]*).size"); //added
    public static final WordType INPUT_WORD
            = new WordType("input", "input"); //added
    public static final WordType PRINT_WORD
            = new WordType("print", "print"); //added
    public static final WordType PLUS_WORD
            = new WordType("plus", "\\+"); //added
    public static final WordType MINUS_WORD
            = new WordType("minus", "\\-"); //added
    public static final WordType TIMES_WORD
            = new WordType("times", "\\*"); //added
    public static final WordType DIV_WORD
            = new WordType("div", "/"); //added
    public static final WordType MOD_WORD
            = new WordType("mod", "\\%"); //added
    public static final WordType INCREMENT_WORD
            = new WordType("increment", "\\+\\+"); //added
    public static final WordType DECREMENT_WORD
            = new WordType("decrement", "--"); //added
    public static final WordType EQUALS_SIGN
            = new WordType("equals", "\\=\\="); //added
    public static final WordType NOT_EQUALS_SIGN
            = new WordType("notequals", "\\!\\="); //added
    public static final WordType LESS_THAN_SIGN
            = new WordType("less", "\\<"); //added
    public static final WordType LESS_OR_EQUALS_SIGN
            = new WordType("lessorequals", "\\<\\="); //added
    public static final WordType GREATER_THAN_SIGN
            = new WordType("greater", "\\>"); //added
    public static final WordType GREATER_OR_EQUALS_SIGN
            = new WordType("greaterorequals", "\\>\\="); //added
    public static final WordType LOGICAL_AND_WORD
            = new WordType("logand", "&&"); //added
    public static final WordType LOGICAL_OR_WORD
            = new WordType("logor", "\\|\\|"); //added
    public static final WordType LOGICAL_NOT_WORD
            = new WordType("lognot", "\\!"); //checked
    public static final WordType BITWISE_AND_WORD
            = new WordType("bitwiseand", "&"); //added
    public static final WordType BITWISE_OR_WORD
            = new WordType("bitwiseor", "\\|"); //added
    public static final WordType SHIFT_RIGHT_WORD
            = new WordType("shiftright", "\\>\\>"); //added
    public static final WordType SHIFT_LEFT_WORD
            = new WordType("shiftleft", "\\<\\<"); //added
    public static final WordType BITWISE_UNARY_NOT_WORD
            = new WordType("bitwisenot", "~"); //added
    public static final WordType TERNARY_IF_WORD
            = new WordType("ternaryif", "\\?"); //added
    public static final WordType TERNARY_IF_ELSE_WORD
            = new WordType("ternaryifelse", "then"); //added
    public static final WordType IF_WORD
            = new WordType("if", "if"); //added
    public static final WordType ELIF_WORD
            = new WordType("elseif", "elif"); //added
    public static final WordType ELSE_WORD
            = new WordType("else", "else"); //added
    public static final WordType FOR_WORD
            = new WordType("for", "for"); //added
    public static final WordType WHILE_WORD
            = new WordType("while", "while"); //added
    public static final WordType DO_WHILE_WORD
            = new WordType("dowhile", "do"); //added
    public static final WordType LOAD_ARRAY_WORD
            = new WordType("loadarray", "loadArray"); //added
    public static final WordType PRINT_ARRAY_WORD
            = new WordType("printarray", "printArray"); //added
    public static final WordType LOAD_MATRIX_WORD
            = new WordType("loadmatrix", "loadMatrix"); //added
    public static final WordType PRINT_MATRIX_WORD
            = new WordType("printmatrix", "printMatrix"); //added
    public static final WordType FUNCTION_WORD
            = new WordType("function", "function"); //added
    public static final WordType OPEN_CURLY_BRACKET_WORD
            = new WordType("opencurlybracket", "\\{"); //added
    public static final WordType CLOSED_CURLY_BRACKET_WORD
            = new WordType("closedcurlybracket", "\\}"); //added
    public static final WordType OPEN_BRACKET_WORD
            = new WordType("openbracket", "\\("); //added
    public static final WordType CLOSED_BRACKET_WORD
            = new WordType("closedbracket", "\\)"); //added
    public static final WordType OPEN_SQUARE_BRACKET_WORD
            = new WordType("open square bracket", "\\["); //added
    public static final WordType CLOSED_SQUARE_BRACKET_WORD
            = new WordType("closed square bracket", "\\]"); //added
    public static final WordType RETURN_WORD
            = new WordType("return", "return"); //added
    public static final WordType CLASS_WORD
            = new WordType("class", "Class"); //added
    public static final WordType EXTENDS_CLASS_WORD
            = new WordType("extends", "extends"); //added


    static {
        putWordTypeToMap(EMPTY_ARRAY_WORD);
        putWordTypeToMap(OPEN_SQUARE_BRACKET_WORD);
        putWordTypeToMap(CLOSED_SQUARE_BRACKET_WORD);
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
        putWordTypeToMap(STRING_LEN_WORD);
        putWordTypeToMap(ARRAY_SIZE_WORD);
        putWordTypeToMap(MAIN_WORD);
        putWordTypeToMap(ASSIGN_WORD);
        putWordTypeToMap(INPUT_WORD);
        putWordTypeToMap(PRINT_WORD);
        putWordTypeToMap(PLUS_WORD);
        putWordTypeToMap(COMMAND_ARG);
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
        putWordTypeToMap(EMPTY_WORD);
        putWordTypeToMap(TERNARY_IF_ELSE_WORD);
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
        putWordTypeToMap(NAME_WORD);
        putWordTypeToMap(COMMAND_END);
        putWordTypeToMap(DEFINE_TYPE);
    }

    private WordTypes() {

    }
}
