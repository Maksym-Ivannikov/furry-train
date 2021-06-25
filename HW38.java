/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [][] Masiv = new int[5][8];
        for(int i =0;i<Masiv.length;i++){
            for(int h=0;h<Masiv[i].length;h++){
                Masiv[i][h]=(int)((Math.random()*199)-99);
                System.out.print(Masiv[i][h]+" ");
            }
        }
        int max=Masiv[0][0];
        for(int i =0;i<Masiv.length;i++){
            for(int h=0;h<Masiv[i].length;h++){
                if(Masiv[i][h]>max)max=Masiv[i][h];
            }
        }
        System.out.println(" ");
        System.out.println("Значение максимального элемента массива = "+max);
	}
}