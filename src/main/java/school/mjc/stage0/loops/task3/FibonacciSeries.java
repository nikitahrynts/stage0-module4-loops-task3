package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci == 0) System.out.println(0);
        else if (lastFibonacci == 1) System.out.println(1);
        else {
            System.out.println(0);
            System.out.println(1);
            int a = 0;
            int b = 1;
            for (int i = 2; i < lastFibonacci; i++) {
                int c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}
