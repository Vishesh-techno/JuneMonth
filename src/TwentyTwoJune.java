import java.util.Arrays;

public class TwentyTwoJune {
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return product - sum;
    }

    public static String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int groups = (n + k - 1) / k;
        String[] result = new String[groups];

        for (int i = 0; i < groups; i++) {
            StringBuilder group = new StringBuilder();
            for (int j = 0; j < k; j++) {
                int index = i * k + j;
                if (index < n) {
                    group.append(s.charAt(index));
                } else {
                    group.append(fill); // Padding
                }
            }
            result[i] = group.toString();
        }

        return result;
    }

    public static int mySqrt(int x) {
        int ans = (int) Math.sqrt(x);
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcdefghi";
        System.out.println(subtractProductAndSum(234));
        System.out.println(Arrays.toString(divideString(s, 3, 'x')));
        System.out.println(mySqrt(45));
    }
}
