package com.dayFour;

public class OddEven {
	
	
	int numb=50;
	public static void main(String[] args) {
		
		OddEven n1=new OddEven();
		if(n1.numb>0)
		{
			if(n1.numb%2!=0)
			{
				System.out.println(n1.numb);
			}
			else if(n1.numb%10==0)
			{
				System.out.println(n1.numb);
			}
			else
			{
				System.out.println((n1.numb/10)*10+10);	
			}
		}
		else
		{
			System.out.println("Error");
		}
		
	}

}
