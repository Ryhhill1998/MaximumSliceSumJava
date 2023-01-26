public class Main {
    public static void main(String[] args) {
        int[] array = {3, -2, -1, 3, 2, 5, -1, 2};
        System.out.println(solution(array));
    }

    private static int solution(int[] A) {
        int maxSliceSum = A[0];
        int runningTotal = Math.max(maxSliceSum, 0);

        for (int i = 1; i < A.length; i++) {
            int current = A[i];

            if (current > current + runningTotal) {
                runningTotal = current;
            } else {
                runningTotal += current;
            }

            maxSliceSum = Math.max(maxSliceSum, runningTotal);
        }

        return maxSliceSum;
    }
}