package Pattern;
import java.util.Scanner;

public class RightHalfPyramid {
    public static void main(String[] args){

    int n;
    try (Scanner s = new Scanner(System.in)) {
        System.out.print("Enter the Value of n: ");
        n = s.nextInt();
    }
    for(int i=1; i<=n; i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }
    
}
}
