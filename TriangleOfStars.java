import java.util.Scanner;

public class TriangleOfStars {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        n = inp.nextInt();
        //for line
        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <= (n - i) ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2*i) - 1 ; k++ )
                System.out.println("*");
        }
    }
}
