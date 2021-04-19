import java.util.*;
import java.io.*;

public class A0Paper {
	public String canBuild(int[] a) {
        int i;
		for (i = a.length-1; i > 0; --i) 
            a[i-1] += a[i]/2;
        /*if(a[0]==1)
            return "Possible";
        else
            return "Impossible";*/
		return (a[0]==1) ? "Possible" : "Impossible";
	}
    /*public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
    	}
        canBuild(a);
	}*/
}
