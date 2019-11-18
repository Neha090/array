package achievers;

import java.util.Scanner;

public class frequency {
	
	void check_frequency(int ar[])
	{
		
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			if(ar[i]!=-1)
			{
			  for(int j=i+1;j<ar.length;j++)
			   {
				if(ar[i]==ar[j]) {
					count++;
					ar[j]=-1;
				}
			  }
			}
			if(ar[i]!=-1)
			System.out.println("Frequency of "+ar[i]+" is : "+count);
		}
	}
	
	public static void main(String[] args) 
	{
		frequency obj=new frequency();
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the number of elements");
		
		int n=sc.nextInt();
		int ar[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		obj.check_frequency(ar);
				
	}

}
