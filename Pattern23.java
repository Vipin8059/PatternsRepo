import java.util.Scanner;

public class Pattern23 {
    public static void  main(String [] args){
        Scanner sc  =  new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("1 ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
