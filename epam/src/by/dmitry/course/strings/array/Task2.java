package by.dmitry.course.strings.array;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        char[] text = "OneWorldOne".toCharArray();
        text = replaceAllWordInCharArray(text, "One".toCharArray(), "Three".toCharArray());
        //text = replaceWordInCharArray(text, 5, "one".toCharArray(), "go".toCharArray());
        Task1.printCharArray(text);
    }

    public static char[] replaceWordInCharArray(char[] chars, int indexStart, char[] oldWord, char[] newWord) {
        char[] temp = new char[chars.length - oldWord.length + newWord.length];
        for (int i = 0; i < chars.length; i++) {
            if (i < indexStart) {
                temp[i] = chars[i];
            } else if (i >= indexStart + oldWord.length) {
                temp[i + newWord.length - oldWord.length] = chars[i];
            }
        }
        for (int i = 0; i < newWord.length; i++) {
            temp[i + indexStart] = newWord[i];
        }
        return temp;
    }

    public static char[] replaceAllWordInCharArray(char[] chars, char[] oldWord, char[] newWord) {
        char[] out = chars;
        for (int i = 0; i < chars.length; i++) {
            if (isArrayHasThisWord(out, oldWord, i)) {
                out = replaceWordInCharArray(out, i, oldWord, newWord);
                i += newWord.length - 1;
            }
        }
        return out;
    }

    public static boolean isArrayHasThisWord(char[] chars, char[] word, int index) {
        for (int i = 0; i < word.length; i++) {
            if (chars[index + i] != word[i]) {
                return false;
            }
        }
        return true;
    }
}
