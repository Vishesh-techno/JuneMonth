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
    }
}
