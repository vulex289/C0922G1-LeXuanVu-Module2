package ss17regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoStringregex {
    public static final String REGEX_NAME="^[a-zA-z]{6,12}$";

    public static void main(String[] args) {
        Pattern pattern=Pattern.compile(REGEX_NAME);
        String input="abcdefavdeeeee";
        Matcher matcher= pattern.matcher(input);
        System.out.println(matcher.matches());
    }
}
