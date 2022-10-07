import java.util.*;

public class GreatestAmongAll {
    public static void main(String args[]){
        int a,b,c;
        System.out.println("enter all three val");
        Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a>b && a>c)
            {
                System.out.println(a +" is largest");
            }
            else if(b>c && b>a)
            {
                System.out.println(b + " is largest");
            }
            else if(c>a && c>b)
            {
                System.out.println(c + " is largest");
            }
        }
    }

