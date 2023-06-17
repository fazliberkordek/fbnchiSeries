import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int steps, T1 = 1, T2 = 1, T3;
        System.out.print("Number of the steps : ");
        steps = input.nextInt();
        System.out.print("\n\t" + T1 + "\t" + T2);
        for (int i = 1; i <= steps - 2; i++) {
            T3 = T2 + T1;
            System.out.print("\t" + T3);
            T1 = T2;
            T2 = T3;

        }
    }
}