import java.util.*;

class PalindromeIndex{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String s = sc.next();
int end=s.length()-1;
boolean flag=true;
int c=-1;
int slen =s.length();
char st,ed;
for(int i=0;i<slen/2;i++){
	st=s.charAt(i);
	ed=s.charAt(end);
	if(st!=ed){
		flag=!flag;
		if(st==s.charAt(end-1)){
		c=end;
		end--;
		slen--;
		}
		else if(ed==s.charAt(i+1)){
		c=i;
		i++;
		slen--;
		}
		if(flag==true){
		c=-1;
		break;
		}
System.out.println(c+" "+flag);
	}
	end--;
}
System.out.println(c);
}
}
