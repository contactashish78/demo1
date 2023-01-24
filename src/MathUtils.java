public class MathUtils {

    int sum(int a, int b){
        return a+b;
    }

    int subtract(int a, int b)
        {
            return a-b;
        }

        int multiply(int a, int b)
        {
            return a*b;
        }

        int divide(int a, int b)
        {
            return a/b;
        }

        boolean isEven(int a)
        {
            if(a%2==0)
            {
                return true;
            }
            else
            {
                return false;
            }

        }

        boolean isOdd(int a)
        {
            if(a%2!=0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        boolean isPrime(int a)
        {
            if(a==1)
            {
                return false;
            }
            else if(a==2)
            {
                return true;
            }
            else
            {
                for(int i=2;i<a;i++)
                {
                    if(a%i==0)
                    {
                        return false;
                    }
                }
                return true;
            }
        }



}
