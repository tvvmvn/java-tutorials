package dive.d80stream.eg04map;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    int[] nums = {10, 20, 30, 40};
    
    // No stream
    for (int num : nums) {
      System.out.println(num * 10);
    }
    
    // Stream
    Arrays.stream(nums)
      .map(num -> num * 10)
      .forEach(num -> System.out.println(num));
  }
}