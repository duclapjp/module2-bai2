import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố cần in");
        int numbers = scanner.nextInt();
        int n =2;
        for (int count = 0; count <numbers ; count++) {
            System.out.println(n);
            for (int i = 1; i <n; i++) {
                if (n%i==0){
                    n++;
                }
            }
        }

    }
}