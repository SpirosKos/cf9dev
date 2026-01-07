package gr.aueb.cf.cf9.review_challenges;

public class URLEncoding {


    public static void main(String[] args) {
        String s = "Ath Un of Econ and Business";

        System.out.println("New String: " + urlEncoding(s));
    }

    public static String urlEncoding(String s ) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()){
            if (ch == ' '){
                sb.append("%20");
            }else sb.append(ch);
        }

        return sb.toString();
    }

}
