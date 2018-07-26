import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the highestValuePalindrome function below.
    static String highestValuePalindrome(String s, int n, int k) {

        n=n-1;
        int start=0;
        int end=n;
        int count=k;
        int ct=0;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                ct++;
            }
            start++;
            end=n-start;
        }
        if(n%2==0&&k!=0)
            ct++;
        start=0;
        end=n;
        
        if(k>=ct){
            
            while(count!=0&&start<=end){
                if(start==end){
                    s=s.substring(0,start)+9+s.substring(end+1,n+1);
                }
                else if(count>ct&&s.charAt(start)!='9'&&s.charAt(end)!='9'){
                    s=s.substring(0,start)+9+s.substring(start+1,end)+9+s.substring(end+1, n+1);
                    count=count-2;
                    ct-- ;
                }
                else if(s.charAt(start)!=s.charAt(end)){
                    int fstart=Character.getNumericValue(s.charAt(start));
                    int fend=Character.getNumericValue(s.charAt(end));
                    
                    if(fstart>fend)
                        s=s.substring(0,end)+s.charAt(start)+s.substring(end+1,n+1);
                    else
                       s=s.substring(0,start)+s.charAt(n-start)+s.substring(start+1,n+1);
                    
                    count--;
                    ct--;
                    }
                start++;
                end=n-start;
            }
            }
        else{
            s="-1";
        }
        return s;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String s = scanner.nextLine();

        String result = highestValuePalindrome(s, n, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
