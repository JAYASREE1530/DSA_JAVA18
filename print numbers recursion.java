public class Main 
{
    public void fun(int n)
    {
        if(n==11)return;
        System.out.println(n);
        fun(n+1);
    }
    public static void main(String[] args)
    {
        Main m=new Main();
        m.fun(1);
    }
}