import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
       
        for(int i=0;i<n;i++){
             int number = 1;
             number+=i;
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print(number+" ");
                if(j<(2*i+2)/2){
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
