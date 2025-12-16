package gr.aueb.cf.cf9.ch1;

public class UnicodeApp {

    public static void main(String[] args) {
        int codePoint = 0x1F64F;
        System.out.print("Smiley: ");
        System.out.println(Character.toChars(codePoint));
    }
}
