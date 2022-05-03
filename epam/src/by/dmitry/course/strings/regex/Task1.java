package by.dmitry.course.strings.regex;

public class Task1 {

    public static void main(String[] args) {
        String text =
                """
                        George is at the pet store, looking at what kind of pet he might want to get for his birthday. George asked if he could have a horse, but his parents said no because horses are too big.
                        First, he sees dogs and cats. Baby dogs are called puppies. Baby cats are called kittens. George likes them because they are easy to take care of and can play a lot, but they will get bigger. George wants a small pet.
                        Then George sees animals that have to live in a cage. He sees rabbits, guinea pigs, and mice. Mice are what you call more than one mouse. He likes these animals because they are small. Birds live in cages too. George sees a parrot and a canary. He likes them all, but he doesn’t want to clean the cage.
                        George sees the animals in tanks. The tanks full of water have fish and turtles in them. He thinks about a goldfish but decides he likes the turtles more. There are also tanks with rocks and sand that have snakes, spiders, and scorpions, but George is afraid of them. George likes the turtles best, but they won’t fit in the little fishbowls. Turtles need bigger tanks, so they can swim sometimes and hide sometimes.
                        George decides he wants to get a turtle for his birthday. He buys a book on how to take care of a turtle and a list of what types of turtles the store has.
                """;

        System.out.println(sortParagraphsBySentences(text));
        System.out.println(sortWordByLengthInSentences(text));
        System.out.println(sortWordBySymbol(text, 'a'));
    }

    public static String sortParagraphsBySentences(String text) {
        String[] sentences = text.split("\n");
        String out = "";
        for (int i = 0; i < sentences.length - 1; i++) {
            if (sentences[i].split("[!?.]").length > sentences[i + 1].split("[!?.]").length) {
                swapString(sentences, i, i + 1);
                i = -1;
            }
        }
        for (String sentence : sentences) {
            out = out.concat(sentence + "\n");
        }
        return out;
    }

    public static String sortWordByLengthInSentences(String text) {
        String out = "";
        String[] paragraphs = text.split("\\n");
        for (String paragraph : paragraphs) {
            String[] sentences = paragraph.split("[!?.]");
            for (String sentence : sentences) {
                String[] temp = sentence.split("\s+");
                sortStringByLength(temp);
                for (String s : temp) {
                    out = out.concat(s + " ");
                }
                out = out.concat(".");
            }
            out = out.concat("\n");
        }
        return out;
    }

    public static String sortWordBySymbol(String text, char symbol) {
        String out = "";
        String[] sentences = text.split("[!?.]");
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s");
            for (int j = words.length - 1; j > 0; j--) {
                for (int k = 0; k <= j; k++) {
                    int countF = getCountCharInWord(words[k], symbol);
                    int countS = getCountCharInWord(words[j], symbol);
                    if (countS == countF) {
                        if (words[k].compareToIgnoreCase(words[j]) > 0) {
                            swapString(words, j, k);
                        }
                    }
                    if (countS > countF) {
                        swapString(words, k, j);
                    }
                }
            }
            for (String word : words) {
                out = out.concat(word + "\s");
            }
            out = out.concat(".\n");
        }
        return out;
    }

    public static int getCountCharInWord(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public static void swapString(String[] text, int first, int second) {
        String temp = text[first];
        text[first] = text[second];
        text[second] = temp;
    }

    public static void sortStringByLength(String[] text) {
        for (int i = 0; i < text.length - 1; i++) {
            if (text[i].length() > text[i + 1].length()) {
                swapString(text, i, i + 1);
                i = -1;
            }
        }
    }
}
