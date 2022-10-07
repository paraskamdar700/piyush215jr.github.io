import java.util.*;
public class pattern1{
    public static void main (String[] args){
        int line; 
        int n=5; 
        int stars;
        for(line = 0; line <= n ; line ++)
        {
            for (stars=0;stars<line;stars++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}