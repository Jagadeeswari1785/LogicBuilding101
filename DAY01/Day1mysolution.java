//
import java.util.Scanner;
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.print("You entered :" +a);
  }
//print the size
import java.util.Scanner;
public static void main(String args[]){
    System.out.println("Size of int "+Integer.BYTES);
    System.out.println("Size of float "+Float.BYTES);
    System.out.println("Size of Double "+Double.BYTES);
    System.out.print("Size of char "+Character.BYTES);
  }
//Find the Larger Number Among Two Numbers
import java.util.Scanner;
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a>b){
      System.out.print(a+" is greater");
    }
    else{
      System.out.print(b+" is greater");
    }
  }
