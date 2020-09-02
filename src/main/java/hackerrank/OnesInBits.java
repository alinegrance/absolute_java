package hackerrank;

public class OnesInBits {

    public static boolean endsWithOne(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        int n = 1;
        int counter = 0;
        int maxCount = 0;

        while (n >= 1) {
            if (endsWithOne(n)) {
                counter++;
            } else {
                counter = 0;
            }

            if (counter > maxCount){
                maxCount = counter;
            }

            n = n >> 1;
        }

        System.out.println(maxCount);
    }
}
