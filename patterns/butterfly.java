import java.util.*;
public class butterfly {
    public static void main (String args[])
    {
        int n = 4;
        for(int line =1 ; line <= n ; line ++)
        {
            for(int star = 1; star <= line ; star ++ ){
                System.out.print("*");
            }
            for(int space = line  ; space <= 2*n-line ; space ++ ){
                System.out.print(" ");
            }
            for(int star = 1  ; star <= line ; star ++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
