 public class ar1{

    public static int findLargerNumber(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int largerNumber = findLargerNumber(a, b);

        System.out.println("The larger number is: " + largerNumber);
    }
}