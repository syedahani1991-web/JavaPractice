package Prog1;

public class JavaContinueStatementwithInnerLoop {

	public static void main(String[] args) {
		// It continues inner loop only if 
		//you use the continue statement inside the inner loop.
		
		for(int i=1;i<=3;i++){    
            //inner loop  
            for(int j=1;j<=3;j++){    
                if(i==2){    
                    //using continue statement inside inner loop 
                	//this will skip the loop which was supposed
                	//to run in the second iteration 
                    continue;    
                }    
                System.out.println(i+" "+j);    
            }    
    }    

	}

}
