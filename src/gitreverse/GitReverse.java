package gitreverse;
import java.util.*;
public class GitReverse {

	public static void main(String[] args) {
		int rim,num,revnum=0,nod=0,num2,i=1;
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		num2=num;
		while(num2>0) {
			num2=num2/10;
			nod++;
		}
		System.out.println(nod);
		while(num>0) {
			rim=num%10;
			revnum=revnum+rim*(10000)/(i*10);
			i=i*10;
			num=num/10;
		}
		System.out.println(revnum);
	}

}
