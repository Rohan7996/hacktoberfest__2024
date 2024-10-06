
public class Main
{
    static int power(int r,int pow){
        if(pow==0){
            return 1;
        }
        if(pow==1){
            return r;
        }
        if(pow%2==0){
            return power(r*r,pow/2);
        }else{
            return r*power(r*r,pow/2);
        }
    }
    static int order(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    static boolean isArmstrong(int x)
    {
        // Calling order function
        int n = order(x);
        int temp = x, sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, n);
            temp = temp / 10;
        }
 
        // If satisfies Armstrong condition
        return (sum == x);
    }
	public static void main(String[] args)
    {
       
        int x = 153;
        System.out.println(isArmstrong(x));
        x = 1253;
        System.out.println(isArmstrong(x));
    }
}
