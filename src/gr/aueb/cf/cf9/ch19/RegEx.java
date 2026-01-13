package gr.aueb.cf.cf9.ch19;

public class RegEx {

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(reverse(s));

//        String s1 = ".4";
//        System.out.println(dotAndDigit(s1));
//
//        String s2 = "12/24/2009";
//        System.out.println(date(s2));
    }

    public static boolean isHello(String s) {
        return s.matches("Hello");
    }

    public static boolean isHelloOrHi(String s) {
        return s.matches("Hello|Hi");
    }

    public static boolean isHhello(String s) {
        return s.matches("[Hh]ello");
    }


    /**
     * Starts with uppercase and follows by word coding
     * @param s input string
     * @return  true or false
     */
    public static boolean startsWithUpperCase(String s) {
        return s.matches("[A-Z]coding");
    }


    public static boolean startsWithUpperOrLowerCase(String s){
        return s.matches("[A-Za-z]coding");
    }

    public static boolean startsWithLetter(String s) {
        return s.matches("[a-zA-Z0-9_]coding");
    }

    // Metacharacters

    public static boolean anyCharAndDigit(String s) {
        return s.matches(".\\d");       // .[0-9]
    }

    public static boolean dotAndDigit(String s) {
        return s.matches("\\.\\d");
    }

    // dd/mm/yyyy

    public static boolean date(String s){
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static boolean twoWords(String s ) {
        return s.matches(".*\\s+.*");
    }

    public static String reverse(String s) {
        return s.replaceAll("(.+)\\s(.+)","$2 $1"); // backreference - groups
    }
}
