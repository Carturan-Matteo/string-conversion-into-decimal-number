import java.util.Scanner;
public class exercise{
	public static void main (String[] args){

		System.out.print("Inserisci una numero in stringa: ");
		String sr = new Scanner(System.in).next();

		int cnt = 0;
    	double num = 0;
    	int valore = 1;
    	
    	for(int i = 0; i <sr.length();i++)
    	{	
    		
   			if(sr.charAt(i) == (',')||sr.charAt(i) == ('.') )
    		{
    			for(int y = i+1; y <sr.length();y++)
    			cnt++;
    		}else 
    		{
    			// *10 number completes the sequence maintaining the right position
    			num *= 10;  			
        		num += sr.charAt(i) - '0' ; //meno 0 and the program can read the Ascii number
    			
    		}    	
        
    	}
    	
   		if(cnt >=1)
   		{
   			num /= valore;
   	 		for(int y = 0; y<cnt;y++)
   	 		{
   	 			valore *=10;
   	 		}  	 	
   		
  		num /= valore;
   		System.out.print(num);   
		}else System.out.print(num); 		
	}
}