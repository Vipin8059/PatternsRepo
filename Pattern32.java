import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*i+1;j++){
                if(j%2==0){
                    System.out.print(number+" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            for(int j=0;j<2*n-2*i-2;j++){
                System.out.print("  ");
            }
            number++;
            System.out.println();
        }
        number=n-1;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<2*i-1;j++){
                if(j%2==0){
                    System.out.print(number+" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            for(int j=0;j<2*n-2*i-2;j++){
                System.out.print("  ");
            }
            number--;
            System.out.println();
        }
        sc.close();
    }
}
