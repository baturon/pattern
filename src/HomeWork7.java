import java.util.Arrays;

public class HomeWork7 {

    public static void main(String[] args) {
        int[] nums = {8,1,9,2,82,7,3,6,9,1,6};
        System.out.println(GrassHopper.findAverage(nums));
        System.out.println(SumOfDifferences.sumOfDifferences(nums));
    }

    //1). Find the mean (average) of a list of numbers in an array.
    class GrassHopper {
        public static double findAverage(int[] nums) {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            return (double) sum / nums.length;
        }
    }
    /*
    2). Your task is to sum the differences between consecutive pairs in the array in descending order.
     If the array is empty or the array has only one element the result should be 0.
*/

    class SumOfDifferences {
        public static int sumOfDifferences(int[] nums) {
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            int sum = 0;
            if (nums.length == 1) {
                return 0;
            }
            for (int i = nums.length-1; i > 0; i--) {
                sum += nums[i] - nums[i - 1];
            }
            return sum;
        }
    }
}



