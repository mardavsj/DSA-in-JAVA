package JavaBasics;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[]array = {1,2,3,4,5};
        change(array);
        System.out.println(Arrays.toString(array));
    }

    static void change(int[] nums) {
        nums[0]=13;
    }
}
