package by.dmitry.course.strings.array;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
       char[] text = "textWorld".toCharArray();
       text = replaceWordInCharArray(text,4,"Golllllll".toCharArray());
       Task1.printCharArray(text);
    }

    public static char[] replaceWordInCharArray(char[] chars, int lastIndex, char[] word) {
        char[] out = Arrays.copyOf(Arrays.copyOfRange(chars,0,lastIndex), lastIndex + word.length);
        for (int i = lastIndex, y = 0; y < word.length; i++, y++) {
            out[i] = word[y];
        }
        return out;
    }

    public static void replaceAllWordInCharArray(char[] chars,char[] oldWord, char[] newWord) {

    }
}
