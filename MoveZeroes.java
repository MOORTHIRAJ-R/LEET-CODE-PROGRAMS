public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Pointer for the position of non-zero elements

       // First pass: Move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

       // Second pass: Fill the remaining positions with zeroes
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

       // Print the modified array
        System.out.print("Result: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
