//Tables
import java.util.Scanner;
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=1;i<=10;i++){
      int c=a*i;
      System.out.println(a+" X "+i+" = "+c);
    }
  }
//calculator
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    char c=sc.next().charAt(0);
    int b=sc.nextInt();
    
    int d=0;
    switch(c){
      case '+':
         d=a+b;
        System.out.printf("%d %c %d = %d",a,c,b,d);
        break;
      case '-':
        d=a-b;
        System.out.printf("%d %c %d = %d",a,c,b,d);
        break;
      case '*':
         d=a*b;
        System.out.printf("%d %c %d = %d",a,c,b,d);
        break;
      case '/':
         d=a/b;
        System.out.printf("%d %c %d = %d",a,c,b,d);
        break;
      default:
        System.out.println("Invalid operator");
    }
    
  }
  }
//reverse
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int rev=0;
    while(a>0){
      int rem=a%10;
      rev=rev*10+rem;
      a=a/10;
    }
    System.out.print(rev);
    }
}
