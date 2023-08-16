import java.util.Scanner;

public class Pattern29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number  = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=0;j++){
                System.out.print(number+" ");
                for(int k=0;k<2*i-3;k++){
                    System.out.print("0 ");
                }
                if(number!=1) System.out.print(number+" ");
                
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            number++;
            System.out.println();

        }
        sc.close();
    }
}
