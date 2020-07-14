import java.util.*;
import java.io.*;


public class XOR {
	static boolean prime(int k)
    {
        if(k==2)
        {
            return true;
        }
        else{
        for(int i=3;i<=(int)Math.sqrt(k);i=i+2)
        {
            if(k%i==0)
            {
                return false;
            }
        }
        }
        return true;
    }
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=in.nextInt();
	int val=0;
	for(int i=2;i<=n;i++)
	{
	    if(prime(i))
	       {
 	          val=val^i;
	       }
	}
	System.out.println(val);
}

}
