//SQUARE
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  }
}
//RIGHT ANGLED TRIANGLE
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      if(j<=i){
       System.out.print("*");
      }
    }
    System.out.println();
  }
  }
}
//HOLLOW RECTANGLE
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      if(i==0||i==n-1||j==0||j==n-1){
       System.out.print("*");
      }
      else{
        System.out.print(" ");
      }
    }
    System.out.println();
  }
  }
}
