package gr.aueb.cf.cf9.ch19;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Recognize but not capture
 */
public class NonCapturing {

    public static void main(String[] args) {
        String str = "HelloWorld HelloWorld";

        Pattern pattern = Pattern.compile("(Hello)(?:World)");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.print(matcher.group(i)+ " ");
            }
            System.out.println();
        }
    }
}
