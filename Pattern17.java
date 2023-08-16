import java.util.Scanner;

public class Pattern17 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n/2+1;i++){
            for(int j=0;j<=n/2-i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=n/2-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n/2;i>=1;i--){
            for(int j=0;j<=n/2-i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=n/2-i;j++){
                System.out.print("* ");
            }
            System.out.println();
            sc.close();
        }
    }   
}
