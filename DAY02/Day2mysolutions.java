//Program to Check Whether the Number is Odd or Even:
import java.util.Scanner;
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    
    if(a%2==0){
      System.out.print(a+" is even");
    }
    else{
      System.out.print(a+" is odd");
    }
  }
//Program to Check Whether the Number is Divisible by 5:
import java.util.Scanner;
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    
    if(a%5==0){
      System.out.print(a+" is divisible by 5");
    }
    else{
      System.out.print(a+" is not divisible by 5");
    }
  }
//Program to Check Whether the Number is a Multiple of 7:
import java.util.Scanner;
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    
    if(a%7==0){
      System.out.print(a+" is multiple of 7");
    }
    else{
      System.out.print(a+" is not multiple of 7");
    }
  }
