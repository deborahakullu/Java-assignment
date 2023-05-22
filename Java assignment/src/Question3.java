
//3.	Write a Java program to find the factorial of a number.
class Question3{
public static void main(String args[]) {
    int i,fact=1;
    int number=6;//It is the number to calculate factorial
  for(i=1;i<=number;i++){
        fact=fact*i;
    }
  System.out.println("Factorial of "+number+" is: "+fact);
}
}

