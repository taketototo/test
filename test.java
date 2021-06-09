public class Collatz {
    public static void main(String[] args) {
        int m = 0;
        int maxlen = 0;
        
        for (int i = 2; i <= 100; i++) {
            if (maxlen < myLength(i)) {
                m = i;
                maxlen = myLength(i);
            }
        }
        
        System.out.println("m = " + m + ", The length = " + maxlen);
        
        System.out.println();
    }
    
    public static int myLength (int n) {
        int len = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            len++;
        }
        len++;
        return len;
    }
}