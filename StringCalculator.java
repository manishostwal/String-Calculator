package String_Calculator;

import java.util.Iterator;
import java.util.Scanner;

public class StringCalculator {

	public static int add(String number) {
		
//	String[] numbers = number.split(",");
	int temp=0;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			temp += Integer.parseInt(numbers[i]);
//		}
	String num="";
		for (int i = 0; i < number.length(); i++) {
			
			if(number.charAt(i)<48||number.charAt(i)>58) {
				
				if(num!="") {
					int val=Integer.parseInt(num); 
					if(val<1000)temp+=val;
					num="";
				}
				continue;
			}
			
			if(number.charAt(i)>47&&number.charAt(i)<58) {
				num+=number.charAt(i);
			}
		
			
		}
		int val=Integer.parseInt(num); 
		if(val<1000)temp+=val;
			
		 
		return temp ;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter input string with comma");
		String input = in.nextLine();
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)=='-') {
				System.out.println("negative not allowed");
				System.exit(0);
			}
		}
		if(input!=null&&input!="") System.out.print(add(input));
		else System.out.println("0");
		
	}

}
