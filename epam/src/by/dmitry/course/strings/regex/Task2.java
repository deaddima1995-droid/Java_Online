package by.dmitry.course.strings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    static String xml = """
            <notes>
            <note id = "1">
            <to>Вася</to>
            <from>Света</from>
            <heading>Напоминание</heading>
            <body>Позвони мне завтра!</body>
            </note>
            <note id = "2">
            <to>Петя</to>
            <from>Маша</from>
            <heading>Важное напоминание</heading>
            <body/>
            </note>
            </notes>""";

    public static void main(String[] args) {
        System.out.println(parseXML(xml));
    }

    public static String parseXML(String xml) {
        Pattern tag = Pattern.compile("<([^/<>]+)([^<>]*)>(.*?)<(/\\1)>|<([^/<>]+)([^<>]*)/>");
        Matcher tagMatcher = tag.matcher(xml);
        StringBuilder result = new StringBuilder();

        while (tagMatcher.find()) {
            if (tagMatcher.group(3) != null) {
                result.append("Tag:\n\t")
                        .append(tagMatcher.group(0))
                        .append("\n\tOpening tag: <")
                        .append(tagMatcher.group(1))
                        .append(tagMatcher.group(2))
                        .append(">\n\tInner text: ")
                        .append(tagMatcher.group(3))
                        .append("\n\tClosing tag: <")
                        .append(tagMatcher.group(4))
                        .append(">\n")
                        .append(parseXML(tagMatcher.group(3)));
            } else {
                result.append("Tag:\n\t")
                        .append(tagMatcher.group(0))
                        .append("\n\tTag without body.");

            }
        }
        return result.toString();
    }
}
