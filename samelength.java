None selected

Skip to content
Using Gmail with screen readers
Enable desktop notifications for Gmail.
   OK  No thanks
Conversations
55% of 15 GB used
Terms · Privacy · Program Policies
Last account activity: in 1 minute
Open in 1 other location · Details
import java.util.*;
public class samelength{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
         String b=sc.nextLine();
         if(a.length()!=b.length())
         {
             System.out.println(false);
             System.exit(0);
         }
         for(int i=0;i<a.length();i++)
         {
             if(a.charAt(i)!=b.charAt(i))
             {
                 System.out.println(false);
                 System.exit(0);
             }
         }
         System.out.println(true);
    }
}
    