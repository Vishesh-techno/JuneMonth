import java.util.Arrays;
import java.util.Scanner;

public class SixJune {
    public static int highest_altitude(int[] track) {
        int n = track.length;
        int cs = 0;
        int ms = 0;
        for (int j : track) {
            cs += j;
            if (cs > ms) {
                ms = cs;
            }
        }
        return ms;
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (m + 1) / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][m - 1 - j] ^ 1;
                image[i][m - 1 - j] = temp;
            }
        }

        return image;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        if(highest_altitude(nums)<=0){
            System.out.println("No highest altitude");
        }else {
        System.out.println("Highest altitude is " + highest_altitude(nums));
        }
        int[][] img = {{1,0,0,0}, {1,1,0,0},{1,0,1,0},{1,0,0,1}};
        System.out.println("Original image: "+Arrays.deepToString(img));
        System.out.println("the inverted of given: "  + Arrays.deepToString(flipAndInvertImage(img)));
    }
}
