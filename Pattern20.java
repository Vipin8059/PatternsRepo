import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i+1;j++){
                if(j==1 || j==2*i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=(n-2)/2;i>=0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i+1;j++){
                if(j==1 || j==2*i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            System.out.println();
        }

        sc.close();
       
        
    }
    
}
