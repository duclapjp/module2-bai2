import java.util.Scanner;

public class TimUocChungMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao a:");
        int a = scanner.nextInt();
        System.out.println("nhap vao b:");
        int b = scanner.nextInt();
        if (a==0||b==0){
            System.out.println("khong co uoc chung lon nhat");
        }else {
            while(a!=b){
                if (a>b){
                    a=a-b;
                }else {
                    b =b-a;
                }
            }
            System.out.println("uoc chung lon nhat la" +a);
        }
    }
}
