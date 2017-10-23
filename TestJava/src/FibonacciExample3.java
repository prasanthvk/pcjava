
import sub.Parentsum1;
import org.Animal;
import org.Tiger;

public class FibonacciExample3 {

	public static void main(String args[])  
	{    
		int[] a1 = {1,1,1};
		
		
		int n1=0,n2=1,n3,i,count=10;    
		System.out.print(n1+" "+n2);//printing 0 and 1    

		for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		{    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;    
		}  
		
		Parentsum1 p1 = new Parentsum1();
		System.out.println("\nSum:"+p1.sum(2, 3));
		
		Parentsum1 p2 = new Parentsum1(2);
		System.out.println("offset p2 :"+p2.getOffset());
		System.out.println("\nSum:"+p2.sum(2, 3));
		p2.setOffset(3);
		System.out.println("after offset p2 :"+p2.getOffset());
		System.out.println("\nNew p2 Sum:"+p2.sum(2, 3));
		
		Animal tiger = new Tiger();
		

	}

	private void simple(String print){
		System.out.println("private method"+print);
	}



}
