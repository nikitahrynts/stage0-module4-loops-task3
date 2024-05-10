package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String num = "" + t;
        int length = num.length();
        int mod = 10;
        int div = 1;
        int digitsSum = 0;
        if (t < 0) t *= -1;
        if (t < 10) System.out.println(t);
        else {
            for (int i = 0; i < length; i++) {
                digitsSum += t % mod / div;
                mod *= 10;
                div *= 10;
            }
            System.out.println(digitsSum);
        }
    }
}
