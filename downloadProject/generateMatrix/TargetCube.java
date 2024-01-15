import java.security.SecureRandom;
import java.util.Scanner;

public class TargetCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the length & width:");
        String s = scanner.nextLine();
        String[] nums = s.split(" ");

        int high = Integer.parseInt(nums[0]);
        int width = Integer.parseInt(nums[1]);

        for (int i = 1; i <= high; i++) {
            if (i%2 == 0) {
                for (int j = 1; j <= width; j++) {
                    System.out.print(String.valueOf(i)+"-"+String.valueOf(j)+" \t");
                }
            }else{
                for (int j = width; j >= 1; j--) {
                    System.out.print(String.valueOf(i)+"-"+String.valueOf(j)+" \t");
                }
            }

            System.out.println();
        }


    }
}
