package dive.d80stream.eg02sum;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    
    int[] nums = {10, 20, 30, 40};

    // No Stream
    // int sum = 0;
    // for (int num : nums) {
    //   sum += num;
    // }
    // System.out.println(sum);

    // Stream
    int sum = Arrays.stream(nums)
      .sum();
    
    System.out.println(sum);
  }
}
