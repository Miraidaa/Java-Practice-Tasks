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
 }   
 }  


