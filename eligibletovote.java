import java.util.*;
public class vote 
{
    public static void main (String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float h=sc.nextFloat();
        float w=sc.nextFloat();
        if(a>18)
        {
            if(h>5)
            {
                if(w<80){
                    System.out.println("passed");
                }
            }
        }
    }  
    }
