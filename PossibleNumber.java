import java.io.*;
class Fifty7Times
{
    BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
    
    // This function helps filter out the impossible values of n, by crosschecking the prime factors
    private int TenComplementFacs(int n)
    {
        int p = 1, i = 2;
        while(n % 2 == 0)
        {
            n = n / 2;
        }
        for(i = 3;i <= n;i++)
        {
            while(n % i == 0)
            {
                if(i != 5)
                {
                    p = p * i;
                }
                n = n/i;
            }
        }
        return p;
    }
        
    
    void HQ()throws IOException 
    {
        System.out.println("Suppose we express it as : ");
        System.out.println(" x + a * 10^k = Nx");
        System.out.println("");
        System.out.print("Then, Input the value of N : ");
        int N = Integer.parseInt(x.readLine());
        if(TenComplementFacs(N - 1) > 9)
        {
            System.out.println("Such a Case is Impossible and can be Logically proved to be so.");
        }
        else
        {
            long n = 1, i , j;
            String a , z;
            for(i = N;i >= 0;i ++)
            {
                a = Long.toString(i);
                z = a.substring(1);
                if(Long.parseLong(z)*N == i)
                {
                    n = i;
                    break;
                }
            }
            System.out.println("The First Such Number is : " + n);
        }
    }
}
