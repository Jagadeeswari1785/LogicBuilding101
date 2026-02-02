//
import java.util.Scanner;
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int c=(int)Math.pow(a,2);
    int d=(int)Math.pow(a,3);
    System.out.println("Square: "+c);
    System.out.println("Cube: "+d);
  }
//Area
import java.util.Scanner;
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int Radius=sc.nextInt();
    int Base=sc.nextInt();
    int height=sc.nextInt();
    int tri=(int)((0.5)*(Base*height));
    int circle=(int)Math.pow(Radius,2);
    System.out.println("triangle: "+tri);
    System.out.println("circle: "+circle);
  }
