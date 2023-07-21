import java.util.*;

public class combinations{
    public static void main(String[] args){
        Get g=new Get();
        System.out.print(g.nCr(5,2));
    }
}
class Get
{
    public static int nCr(int n,int r)
    {
        // your code here
        if(r==0 || r==n)
        return 1;
        return nCr(n-1,r-1)+nCr(n-1,r);
    }
}
