public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) { // <= instead of < causes IndexOutOfBoundsException
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
    }
}