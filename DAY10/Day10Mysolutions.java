//
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=0;i<n;i++){
    for(int j=0;j<=i;j++){
      System.out.print((char)('A'+i));
    }
    System.out.println();
  } 
    }
}
//
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int space=n-1;
  for(int i=0;i<n;i++){
    for(int k=0;k<space;k++){
      System.out.print(" ");
    }
    space=space-1;
    for(int j=0;j<=i;j++){
      System.out.print((char)('A'+j));
    }
    for(int l=i-1;l>=0;l--){
      System.out.print((char)('A'+l));
    }
    System.out.println();
  } 
    }
}
//
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  System.out.println("before swapping: "+a+" "+b);
  int temp=a;
  a=b;
  b=temp;
  System.out.print("after swapping: "+a+" "+b);
    }
}
