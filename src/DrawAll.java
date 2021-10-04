import java.util.Scanner;

public class DrawAll {
    public static void main(String[] args) {
        int choice =-1;
        Scanner scanner =new Scanner(System.in);
        while (choice!=0){
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle ");
            System.out.println("3.Print isosceles triangle");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:
                    for (int i = 1; i <=5; i++) {
                        for (int j = 1; j <i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    for (int i = 7; i >=1 ; i--) {
                        for (int j = 1; j <i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choice");
            }

        }
    }
}
