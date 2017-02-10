package array;

import java.util.Scanner;

public class arr1 {
	public static void main(String[] args)
	{
		int arr[]={5,6,1,8,2,3,4};
		Scanner scan=new Scanner(System.in);
		for(int temp :arr)
		{
			System.out.println(temp);
		}
		   sum(arr);
	   revsearch(arr);
	   System.out.println("enter the value to search\n");
	int	val=scan.nextInt();
	linersearch( arr,val);
	
	}
	
	public static void sum(int arr[])
	{
		int sum=0;
		for(int temp :arr)
		{
			sum+=temp;
			
		}
		System.out.println("sum="+sum);
		
	}
	public static void revsearch(int arr[])
	{ 
	
		for(int i=(arr.length-1);i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	public static void linersearch(int arr[],int val)
	{ boolean flag =true;
	   int i;
		for( i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				flag =true;
				
			}
			else
			{
				flag =false;
			}
		}
		if(flag)
		{
			System.out.println("the vale present at location"+i);
		}
		else
		{
			System.out.println("no present");
		}
			
		
		
	}
}
