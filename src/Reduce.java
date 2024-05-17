public class Reduce {

    public int reduce(int n) {
        boolean stop = false;
        int step = 0;

        while (!stop) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n -= 1;
            }

            if (n == 0){
                stop = true;
            }
            step++;
        }

        System.out.printf("Congrats! you made it to zero!\nThe step(s) took us to zero: %d", step);
        return 0;
    }

}
