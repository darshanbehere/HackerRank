import java.util.*;

class PalindromeIndex{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	//StringBuffer s = StringBuffer(s1);
	int end=s.length()-1;
	boolean flag=true;
	int c=-1;
	int slen =s.length();
	char st,ed;
	for(int i=0;i<slen/2;i++){
		st=s.charAt(i);
		ed=s.charAt(end);
		if(st!=ed){
			String s1 = s.substring(i++,(slen/2)+1);
			StringBuffer s2 = new StringBuffer(s.substring(slen/2,end++);
			s2.reverse();				   
		if(s1.equals(s2))		   
		count=i;
			s1 = s.substring(i,(slen/2)+1);
			StringBuffer s2 = new StringBuffer(s.substring(slen/2,end++);
		System.out.println(c+" "+flag);
		}
		end--;
	}
	System.out.println(c);
}
}
