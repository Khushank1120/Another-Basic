package thirtyDaysOfCode;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Arrays {

	public static class Solution {

	public static void main(String[] args) {
	            // Get the input
	            Scanner sc = new Scanner(System.in);
	            int length = sc.nextInt();
	            int[] array = new int[length];
	        
	               for (int i = 0; i < length; i++) {
	                array[i] = sc.nextInt();
	            }
	        
	            // Var holding our new string
	            String result = "";
	        
	            for (int i = array.length - 1; i >= 0; i--) {
	                result = result + array[i] + " ";
	            }
	        
	            System.out.println(result);
	        }
	    }

}
