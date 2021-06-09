package Prog1;

public class JavaBreakStatementwithLabeledForLoop {

	public static void main(String[] args) {
		// We can use break statement with a label. This feature is introduced 
		//since JDK 1.5. So, we can break any loop in Java now whether it is outer loop or inner.
		
		 aa:  
	            for(int i=1;i<=3;i++){    
	                    bb:  
	                    for(int j=1;j<=3;j++){    
	                        if(i==2&&j==2){    
	                            //using break statement with label  
	                            break aa;    
	                        }    
	                        System.out.println(i+" "+j);    
	                    }    

	}

}
}