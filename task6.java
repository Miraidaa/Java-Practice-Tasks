public class task6 {
    /*Create a program which inputs two integer numbers, and for each integer number in the range defined by these two integers, 
it outputs the half of those numbers. 
To convert a string (provided as input) into an integer number, you can use the following conversion function: */
  
public static void main(String args[])   
{   
int firstNum = Integer.parseInt (args[0]);
int secondNum = Integer.parseInt (args[1]);

for (int i = firstNum; i<= secondNum; i++) {
    System.out.println(i/2);}

}   
}  

