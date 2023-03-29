import java.util.Scanner;
public class factorial_while {
    public static void main(String[]args){
        int num,fact;
        fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for finding the factorial:");
        // System.out.println("Enter number");
        num=sc.nextInt();
        
        for(int i=num; i>=1;i--){
            fact=fact*i;

        }
        System.out.println("the "+num+" is "+   fact);

    }
    
}
