package Prog1;

public class LabeledForExample {

	public static void main(String[] args) {
		
		
		aa: //first for loop label 
	        for(int i=1;i<=3;i++){  
	            bb:  //second for loop label
	                for(int j=1;j<=3;j++){  
	                    if(i==2&&j==2){  
	                        break aa;  
	                    }  
	                    System.out.println(i+" "+j);  

	}

}
	}
}

