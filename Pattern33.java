import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 10;
        for(int i=0;i<n;i++){
            number = n-i;
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<2*i+1;j++){
                if(number==n){
                    System.out.print("0 ");
                }
                else{
                    System.out.print(number+" ");
                }
                if(j<(2*i+1)/2){
                    number++;
                }
                else{
                    number--;
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
