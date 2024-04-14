//2.Write a program user through input one number and then check. This no is
//Automorphic Number or not. Using Constructor.
import java.util.*;
 
class proess{

    Scanner sc = new Scanner(System.in);
    int no,sqr,s_r,temp,count=0;
    proess()
    {
        System.out.print("Enter Number : ");
        no = sc.nextInt();
    }

    void Perform()
    {
        temp = no;
        sqr = temp * temp;
        while(temp>0)
        {
            temp = temp/10;
            count++;
        }
        s_r = sqr%(int)Math.pow(10,count);
        if(s_r == no)
        {
            System.out.println("this Number is Automorphic : "+no);
            
        }
        else
        {
            System.out.println("this Number is not  Automorphic : "+no);

        }
    
    }
} 

class Automorphic{
    public static void main(String[] args)
	{
		proess s = new proess();
        s.Perform();
	}

}