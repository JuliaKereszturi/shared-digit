package ch1;

public class SharedDigit {

	public static void main(String[] args) {

		hasSharedDigit(123,431);
		System.out.println(hasSharedDigit(123,431));	
		}

	public static boolean hasSharedDigit(int firstNumber, int secondNumber)
	{
		int temp1;
		int temp2;
		int temp3;
		int temp4;
		
		if(firstNumber >= 10 && firstNumber <= 99 && secondNumber >= 10 && secondNumber<= 99)
		{
			do
			{
			   temp1 = firstNumber % 10;
			   temp2 = secondNumber % 10;
			   temp3 = firstNumber / 10;
			   temp4 = secondNumber / 10;
			   
			   
			   if(temp1 == temp2)
				   return true;
			   else if(temp2 == temp3)
				   return true;
			   else if(temp3 == temp4)
				   return true;
			   else if(temp4 == temp1)
				   return true;
			   else if(temp4 == temp1)
				   return true;
			   else if(temp4 == temp2)
				   return true;
			   else if(temp3 == temp1)
				   return true;
			   else
				   return false;
			   
			}while(firstNumber != 0 && secondNumber !=0);
			
		} else
			return false; 
		
		
		
	}
}
