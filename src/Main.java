//combination:nCr is n!/((n-r)! *r!)
//permutation:nPr is n!/(n-r)!
//n,r are inputs
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt(), r=input.nextInt();
        double x=1,y=1,z=1;
        for(int i=1;i<=n;i++)
            x*=i;
        for(int j=1;j<=r;j++)
            y*=j;
        for(int k=1;k<(n-r);k++)
            z*=k;
        double P= x/z, C=x/(z*y);
        System.out.println("combination: "+C);
        System.out.println("permutation: "+P);

    }
}