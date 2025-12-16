package gr.aueb.cf.cf9.ch6;

public class Mapping {
    public static void main(String[] args) {
        int salaries[] = {1000, 1200, 900, 1700};
        double BONUS = 0.25;
        double wages[] = getWagesWithBonus(salaries, BONUS);
        for (double wage : wages){
            System.out.printf("%.2f ", wage);
        }
    }

    public static double[] getWagesWithBonus(int wages[], double bonus){
        if (wages == null) return null;
        double passedOut[] = new double[wages.length];

        for (int i = 0; i < wages.length; i++){
            passedOut[i] = wages[i] + wages[i] * bonus;
        }
        return passedOut;
    }
}
