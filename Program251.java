// Accept number and display even factors.
import java.util.*;

class Numbers
{
    public void EvenFactorsDisplay(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)        // condition for factor.
            {
                if((iCnt % 2) == 0)     // for chackeing counter is even or not.
                {
                    System.out.println("Even factor is : "+iCnt);
                }
            }
        }
    }
}

class Program251
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.EvenFactorsDisplay(iNo);
    }
}