package magic;
import java.util.ArrayList;
import java.util.Scanner;
public class magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> n=new ArrayList<>();
		Scanner s =new Scanner(System.in);
		String r=s.next();
		
		StringBuilder t=new StringBuilder();
		for(int i=0;i<r.length();i++)
		{
			if(r.charAt(i)!=',')
			{
				t.append(r.charAt(i));
			}
			if(r.charAt(i)==',')
			{
				n.add(t.toString());
				t=new StringBuilder("");
			}
			if(i==r.length()-1)
			{
				n.add(t.toString());
			}
		}
		for(String x:n)
		{
			
			validate(x);
		}
	}

	private static void validate(String x) {	
		String l = "(.*[a-z].*)";
		String u = "(.*[A-Z].*)";
		String special = "(.*[@,#,$,*,_,=].*)";
		String num = "(.*[0-9].*)";
		String m ="(.*[%,!,),(].*)";
		if(x.length()<6)
		{
			System.out.println(x+"  "+"Failure password must be at least 6 characters long.");
		}
		else if(x.length()>12)
		{
			System.out.println(x+"  "+"Failure password length must be be less than 13 characters.");
		}
		else if (!x.matches(l))
           {
                   System.out.println(x+"  "+"Failure Password should contain atleast one letter from a-z.");
                  
           }
		else if (!x.matches(u))
           {
                   System.out.println(x+"  "+"Failure Password should contain atleast one letter from A-Z.");
                  
           }
          
        else if(!x.matches(special))
		{
			 System.out.println(x+"  "+"Failure Password must contain at least one from *$_#=@.");
		}
		
		else if (!x.matches(num ))
           {
                   System.out.println(x+"  "+"Failure"+"Password should contain atleast one number.");
                   
           }
		
		else if(x.matches(m))
		{
			System.out.println(x+"  "+"Failure Password must not contain %!)(.");
		}
		else
			System.out.println(x+"  "+"Success");
	}
	
}
