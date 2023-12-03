package org.example;

import org.example.Entity.ExamHandler;
import org.example.Entity.MyException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws MyException
    {

	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Write your age");
		int age = scanner.nextInt();
		  if(age < 18){
			  throw new RuntimeException("You must be over eighteen years of age");*/

/*	Scanner scanner = new Scanner(System.in);
		 while (true) {

			try {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				System.out.println(a / b);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}catch (InputMismatchException e){
				System.out.println("Wrong input");*/

/*       Scanner scanner = new Scanner(System.in);
	  try{
	   int point = scanner.nextInt();
	   if(point <50) {
		   throw new MyException("Unfortunately you didn't pass the exam");
	    }else {
		   System.out.println("Welcome to PeakSoft");
	   }
	   }catch(MyException exception){
		  System.out.println(exception.getMessage());*/

        ExamHandler examHandler = new ExamHandler();
        examHandler.handleExam();
    }
}
