package by.dmitry.course.strings.array;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
       char[] text = "helloNewWorld".toCharArray();
       text = replaceWordInCharArray(text,5,"new".toCharArray(),"carick".toCharArray());
       Task1.printCharArray(text);
    }

    public static char[] addWordToCharArray(char[] chars, int index, char[] word) {
        char[] out = Arrays.copyOf(Arrays.copyOfRange(chars,0,index), index + word.length);
        for (int i = index, y = 0; y < word.length; i++, y++) {
            out[i] = word[y];
        }
        return out;
    }

    public static char[] replaceWordInCharArray(char[] chars, int indexStart, char[] oldWord, char[] word) {
        char[] temp = new char[chars.length - oldWord.length + word.length];
        for (int i = 0; i < chars.length; i++) {
            if (i < indexStart) {
                temp[i] = chars[i];
            } else if (i > indexStart + word.length){
                temp[i + word.length] = chars[i];
            }
        }
        for (int i = 0; i < word.length; i++) {
            temp[i + indexStart] = word[i];
        }
        return temp;
    }

    public static char[] replaceAllWordInCharArray(char[] chars,char[] oldWord, char[] newWord) {
        char[] out = new char[0];
        for (int i = 0; i < chars.length; i++) {
            if (isArrayHasThisWord(chars,oldWord,i)) {
                System.out.println("Have word in index " + i);
                out = addWordToCharArray(chars,i,newWord);
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
