/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
 * 
 * source for work: https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/
 * 
        1
       222
      33333
     4444444
    555555555 
    
*/
package main;

public class Main {

	public static void main(String[] args) {
		
		int n = 5;
		int lineNum;
		for (int i=0; i<n; i++) 
		{ 

			// inner loop to handle number spaces 
			// values changing acc. to requirement 
			for (int j=n-i; j>1; j--) 
			{ 
				// printing spaces 
				System.out.print(" "); 
			} 
			lineNum = i+1;
			System.out.print(lineNum);
			//  inner loop to handle number of columns 
			//  values changing acc. to outer loop 
			for (int j=1; j<=i; j++ ) 
			{ 
          	 // printing number 
				System.out.print(lineNum + "" + lineNum);
			} 

			// ending line after each row 
			System.out.println(); 
			
		} 		
	}
}
