package dive.d80stream.eg01createintstream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {

    int[] nums = {10, 20, 30, 40};

    IntStream numsStream = Arrays.stream(nums);

    System.out.println(numsStream);
  }
}
