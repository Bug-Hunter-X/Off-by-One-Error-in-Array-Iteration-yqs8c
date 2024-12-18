public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // Corrected condition
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
    }
}