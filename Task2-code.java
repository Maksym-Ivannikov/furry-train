/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double n = 8.5;
		double m = 11.45;
		double k = 10;
		double check1 = k-n;
		double check2 = k-m;
		if(Math.abs(check1)>Math.abs(check2)){
    System.out.println(m);
}
else{
    System.out.println(n);
}
	}
}