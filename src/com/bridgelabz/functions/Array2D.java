<<<<<<< HEAD
/*************************************************************************************************************
 * 
 * purpose:Permutation of a string
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * *************************************************************************************************/
package com.bridgelabz.functions;
import java.util.Scanner;
import com.bridgelabz.util.*;
public class Array2D {
   public static void main(String[] args) {
=======
package com.bridgelabz.functions;

import java.util.Scanner;
import com.bridgelabz.util.*;

public class Array2D {

	public static void main(String[] args) {
>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num of rows");
		int m=sc.nextInt();
		System.out.println("enter num of cols");
		int n=sc.nextInt();
		int[][] a=Utility.arInt(m,n);
		double[][] b=Utility.arDouble(m,n);
		String[][] c=Utility.arStr(m,n);
         Utility.print(a,b,c,m,n);
	}
<<<<<<< HEAD
   }
=======

}
>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
