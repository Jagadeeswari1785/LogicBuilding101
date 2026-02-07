//Pattern 1: Inverted Right-angled triangle
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=n;
  for(int i=0;i<k;i++){
    for(int j=0;j<n;j++)
      {
        System.out.print("*");
      }
      n--;
      System.out.println();
    }
    
  }
  }
//Pyramid
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=0;i<=n;i++){
    int space=n-i;
    int star=2*i-1;
    for(int j=0;j<space;j++){
      System.out.print(" ");
    }
    for(int k=0;k<star;k++){
      System.out.print("*");
    }
    System.out.println();
    
  }   
    }
}
