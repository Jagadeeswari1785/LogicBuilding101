//sum
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int rev=0;
    int ans=0;
    while(a>0){
      int rem=a%10;
      ans=ans+rem;
      a=a/10;
    }
    System.out.print(ans);
    }
}
//vowel
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    char b=sc.next().charAt(0);
    char a=Character.toLowerCase(b);
    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
      System.out.println("It is vowel");
    }
    else{
      System.out.println("It is consonant");
    }
    }
}
//ASCII
import java.util.Scanner;
class Hello{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    char a=sc.next().charAt(0);
    int b=(int)a;
    System.out.print(b);
    
    }
}
