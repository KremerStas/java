package ya.kremer.miltiplication;

public class Multiplication {

    public static void table() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int row : nums) {
            for (int cow : nums) {
                System.out.printf("%4d", (row * cow));
            }
            System.out.println();
        }
    }
}
