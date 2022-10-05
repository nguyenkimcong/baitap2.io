import java.util.Arrays;

public class _283 {
    public static void moveZeroes(int[] nums) {
        int pos=0, i=0;
        while(i<nums.length) {
            if(nums[i]!=0) {
                nums[pos] = nums[i];
                pos++;
            }
            i++;
        }
        for(int j=pos;j<nums.length;j++) {
            nums[j]=0;
        }

    }
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

}

