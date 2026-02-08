//
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a=65;
  
  for(int i=1;i<=n;i++){
    int space=2*(n-i);
    for(int j=65;j<=a;j++){
      System.out.print((char)j);
    }
    a++;
    System.out.println();
  } 
    }
}
//
