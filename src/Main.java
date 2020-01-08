public class Main {
    public static void main(String[] args) {
        int n = 15;
        fizzBuzz(n);
    }

    private static String[] fizzBuzz(int n) {
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            if (i % 15 == 0) {
                arr[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i] = "Buzz";
            } else {
                arr[i] = String.valueOf(i);
            }
            System.out.println(arr[i]+",");
        }

        return arr;

    }
}
