package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) System.out.println(0);
        else {
            int sum = 0;
            int start = 9;
            for (int i = 0; i < lengthOfLastNumber; i++) {
                sum += start;
                start *= 10;
                start += 9;
            }
            System.out.println(sum);
        }
    }
}
