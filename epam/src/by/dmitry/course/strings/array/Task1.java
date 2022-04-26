package by.dmitry.course.strings.array;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        char[] text = {'C', 'a', 'm', 'e', 'l', 'C', 'a', 's', 'e'};
        char[][] charsArray = {"HelloWorld".toCharArray(), "GoGoMyFriend".toCharArray()};
        convertArraysOfCharToSnakeCase(charsArray);
        text = convertCharArrayCamelCaseToSnakeCase(text);
        printCharArray(charsArray);
        printCharArray(text);
    }

    public static char[] addSymbolToCharArray(char[] chars, char single) {
        char[] out = Arrays.copyOf(chars, chars.length + 1);
        out[out.length - 1] = single;
        return out;
    }

    public static void convertArraysOfCharToSnakeCase(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                chars[i] = convertCharArrayCamelCaseToSnakeCase(chars[i]);
            }
        }
    }

    public static char[] convertCharArrayCamelCaseToSnakeCase(char[] chars) {
        char[] out = addSymbolToCharArray(new char[0], Character.toLowerCase(chars[0]));
        for (int i = 1; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                out = addSymbolToCharArray(out, '_');
                out = addSymbolToCharArray(out, Character.toLowerCase(chars[i]));
            } else {
                out = addSymbolToCharArray(out, chars[i]);
            }
        }
        return out;
    }

    public static void printCharArray(char[][] chars) {
        for (char[] aChar : chars) {
            printCharArray(aChar);
        }
    }

    public static void printCharArray(char[] chars) {
        for (char aChar : chars) {
            System.out.print(aChar);
        }
        System.out.println();
    }
}
