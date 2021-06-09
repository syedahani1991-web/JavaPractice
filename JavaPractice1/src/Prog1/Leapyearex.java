//A year is a leap year if its divisible by 4 & 400 but not by 100

package Prog1;
public class Leapyearex {

	public static void main(String[] args) {
		
	
		 int year=2021;  
		 
		 
		 
		    if(((year % 4 == 0) && (year % 400 == 0)) || (year % 100 != 0)){  
		    	
		    	
		        System.out.println("LEAP YEAR");  
		    }  
		    
		    
		    else{  
		        System.out.println("COMMON YEAR");

}
	}
}
