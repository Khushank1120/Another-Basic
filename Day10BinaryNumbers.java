package thirtyDaysOfCode;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Day10BinaryNumbers {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        scan.close();
	        
	        // convert number->binary string->char array
	        char[] binary = Integer.toBinaryString(n).toCharArray();
	        int tmpCount = 0; // count consecutive ones
	        int maxCount = 0; // running maximum of consecutive ones
	        for(int i = 0; i < binary.length; i++){
	            tmpCount = (binary[i] == '0') ? 0 : tmpCount + 1; 
	            
	            // set max
	            if(tmpCount > maxCount){
	                maxCount = tmpCount;
	            }
	        }
	        System.out.println(maxCount);
	    }
	}


