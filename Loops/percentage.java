import java.util.Scanner;
public class percentage{
    public static void main(String []args){
        double cc,ai,wt,dsbda;
        double total,percen,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("1.enter the marks of cloud computing:");
        cc=sc.nextInt();
        System.out.println("2.enter the marks of artificial intelligent:");
        ai=sc.nextInt();
        System.out.println("3.enter the marks of web tech:");
        wt=sc.nextInt();
        System.out.println("4.enter the marks of big data:");
        dsbda=sc.nextInt();
        total=cc+ai+wt+dsbda;
        avg=(total/4.0);
        percen=(total/400)*100;
        System.out.println("Total marks:"+total);
        System.out.println("the average is:"+avg);
        System.out.println("The percentage is:"+percen);
        
        
    }
}
