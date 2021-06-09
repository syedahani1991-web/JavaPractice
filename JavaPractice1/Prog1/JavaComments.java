package Prog1;

public class JavaComments {

	public static void main(String[] args) {
//		The Java comments are the statements that are not executed by the compiler and interpreter. The comments can be used to provide information or explanation about the variable, method, class or any statement. It can also be used to hide program code.
//
//		Types of Java Comments
//		There are three types of comments in Java.
//
//		Single Line Comment
//		Multi Line Comment
//		Documentation Comment
		
//		1) Java Single Line Comment
//	The single line comment is used to comment only one line.
//
//	Syntax:
//
//	//This is single line comment  
//	
	    int i=10;//Here, i is a variable  
	    System.out.println(i);  
	  
	
//	2) Java Multi Line Comment
//	The multi line comment is used to comment multiple lines of code.
//
//	Syntax:
//
//	/* 
//	This  
//	is  
//	multi line  
//	comment 
//	*/  
	
	
	/* Let's declare and 
	 print variable in java. */  
	    int i1=10;  
	   System.out.println(i1);
	   
	   
//	   3) Java Documentation Comment
//	   The documentation comment is used to create documentation API. To create documentation API, you need to use javadoc tool.
//
//	   Syntax:
//
//	   /** 
//	   This  
//	   is  
//	   documentation  
//	   comment 
//	   */  	   
//	   
//	   
	   
	   
//	   /** The Calculator class provides methods to get addition and subtraction of given 2 numbers.*/  
//	   public class Calculator {  
//	   /** The add() method returns addition of given numbers.*/  
//	   public static int add(int a, int b){return a+b;}  
//	   /** The sub() method returns subtraction of given numbers.*/  
//	   public static int sub(int a, int b){return a-b;}  
//	   }  
//	}
//	
	   
	   
//  Compile it by javac tool:
//
//		   javac Calculator.java
//		   Create Documentation API by javadoc tool:
//
//		   javadoc Calculator.java
//		   Now, there will be HTML files created for your Calculator class in the current directory. Open the HTML files 
//		   and see the explanation of Calculator class provided through documentation comment.
//
	   }
}

