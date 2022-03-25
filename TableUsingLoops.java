import java.util.Scanner;

public class TableUsingLoops {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
        for (int i =1;i<=10;i++){
            b=a*i;
            System.out.println(b);
        }
    }
}
