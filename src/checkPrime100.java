import java.util.Scanner;

public class checkPrime100 {
    public static void main(String[] args) {
        int n=2;
        boolean check =true;
      while (n<100){
            for (int j = 2; j < n; j++) {
                if (n%j==0){
                   check =false;
                }
            }
          if(check){
              System.out.println(n);
          }
          n++;
          check=true;
        }
    }
}
