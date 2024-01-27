package com.javaProject;

public class ExceptionHandling {

	private static String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		                             
		// 1. Arithmetic Exception
	   
		try 
		{
		int dividebyzero = 15/0;
		System.out.println(dividebyzero);
		}catch (ArithmeticException e) 
		{
		System.out.println("Error Message is "+ e);
		System.out.println(" Trying to divide by 0 ");
		}
		
		// 2. Null Pointer Exception
		
		try 
		{
			city = null;
			System.out.println(city.length());
			
		}catch (NullPointerException e)
		{
		System.out.println("Error Message is "+ e);
		System.out.println("code after exception");
		}
		
		// 3. Array Index Out Of Bound Exception
		
		try
		{
		int arr[] = new int[10];
		arr[30] = 75;
		System.out.println(arr[30]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Error Message is "+ e);
		System.out.println("code after exception");
		}
		// 4. NumberFormat Exception
		
		try 
		{
		String num = "Java";
		int a = Integer.parseInt(num);
		System.out.println(a);
		}
		catch(NumberFormatException e) 
		{
		System.out.println("Error Message is "+ e);
		System.out.println("code after exception");
		}
		
		// try and multiple catch
		
		try 
		{
		int x = 25;
		int y = 0;
		int dividebyzero = x/y;
		System.out.println(dividebyzero);
		}catch (ArithmeticException e)
		{
		System.out.println("Error Message is "+ e);
		System.out.println("Trying to divide by 0 ");
		}
		catch (NullPointerException e) 
		{
		System.out.println("Error Message is "+ e);
		System.out.println("code after exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Error Message is "+ e);
		System.out.println("code after exception");
		}
		catch(NumberFormatException e)
		{
		System.out.println("Error Message is "+ e);
		System.out.println("code after exception!");
		}
		
		try
		{
		
		}
		catch(Exception e) {
		System.out.println(e);
		}
		finally {
		
		System.out.println("This block will be executed as mandatory");
		}
		System.out.println("Program is completed");
		}
}


