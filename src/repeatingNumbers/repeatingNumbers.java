package repeatingNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class repeatingNumbers {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("array lenght:");
		int arrayLenght=scan.nextInt();
		int numbers[]=new int[arrayLenght];
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println("enter number:");
			numbers[i]=scan.nextInt();
			
		}
		
	System.out.println("array:"+Arrays.toString(numbers));
	Arrays.sort(numbers);
	 int counter=0;
     for(int i=0; i < numbers.length-1; i++){
         if(numbers[i] == numbers[i+1]){
             int evenNumber = numbers[i];
             if(evenNumber % 2 == 0){
                 counter++;
                 System.out.print(evenNumber + " ");
             }
         }
     }
     if(counter == 0){
         System.out.println("no repeating numbers");
     }
 }

	}

	
	
