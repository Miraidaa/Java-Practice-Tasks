 /*Create a program which reads the name of the user
  from the console, and then greets the user.  */

public class firstPractice 
{   

 /* 
 public static void main(String args[])   
{   
String getTheUser = System.console().readLine("Enter your name"); 
System.console().printf("Hello %s %n", getTheUser );
}   
*/

/*Create a program similar to the previous one,
 but this time the name of the user should be provided as the 
 first command-line
argument. Printing to the
 standard output is also possible using the following command, 
 which Java programmers usually prefer.*/

  
 public static void main(String args[])   
 {   
 if (args.length >0 ){
 String userName = args[0]; 
 System.out.println("Hello" + " " + userName);
 } else {
     System.out.println("Please write your name!");
 }
   
   


//The program below should print the half of the numbers 1, 2, 3 and 4. 
  
  //my solution
for (double i = 1; i <= 4; i++) {
    System.out.println (i / 2.0);
}


/*Implement a program which computes the factorial of a given natural number. */

String theNum = System.console().readLine("Enter desired number : "); 
int num = Integer.parseInt((theNum));

int factorial = 1; 
for (int i = 1; i <= num; i++) {
    factorial*=i;
}
 System.out.println("The factorial of" + " " + num + " " +  "is" +  " " + factorial);
}
 } 

 