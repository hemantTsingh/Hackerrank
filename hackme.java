package hackerrank;
import java.util.*;
import java.lang.Math;
import java.io.*;

public class hackme {
	
	public static void main(String[] args) {
		Scanner hemu=new Scanner(System.in);
		int k=hemu.nextInt();
		for(int i=0;i<k;i++) {
			try {
			long x=hemu.nextLong();
			System.out.println(x+"can be fitted in:");
			if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("It is valid for byte");
			if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("It is valid for Integer");
			if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("It is valid for Long");
			if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("It is valid for Short");
			
	}
			catch(Exception e) {
				System.out.println(hemu.next()+"Can't be fitted in");
			}
		}

}
}