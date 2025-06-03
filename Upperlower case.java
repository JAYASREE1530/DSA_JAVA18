

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
public class upperlower{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b="";
        for(int i=0;i<a.length();i++){
            
                char ch=a.charAt(i);
                if(Character.isLowerCase(ch)){
                    char c=Character.toUpperCase(ch);
                    b=b+c;
                }
                else{
                    char c=Character.toLowerCase(ch);
                    b=b+c;
                }
                
            }
            System.out.println(b);
        }
    }

