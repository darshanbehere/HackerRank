/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highestvaluepalindrome;

/**
 *
 * @author ANKUSH
 */
import java.util.*;
public class HighestValuePalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k=sc.nextInt();
        int n=s.length();
        n=n-1;
        System.out.println(n);
        int oddcnt=(k/2)+1;
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
        if(n%2!=0){
            System.out.println("ggg"+n);
            ct++;
        }
            //ct++;
        System.out.println(ct);
        start=0;
        end=n;
        if(k>=ct){
            
            while(count!=0&&start<=end){
                if(start==end){
                    s=s.substring(0,start)+9+s.substring(end+1,n+1);
                    count--;
                    ct--;
                }
                else if(count>ct&&s.charAt(start)!='9'&&s.charAt(end)!='9'){
                    s=s.substring(0,start)+9+s.substring(start+1,end)+9+s.substring(end+1, n+1);
                    count=count-2;
                    ct--;
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
                System.out.println(count);
//                else
//                    count--;
//                count++;
                start++;
                end=n-start;
            }
            }
        else{
            s="-1";
        }
//        else{
//            while(count!=oddcnt&&start<end){
//                
//                if(s.charAt(start)!=s.charAt(end)){
//                    int fstart=Character.getNumericValue(s.charAt(start));
//                    int fend=Character.getNumericValue(s.charAt(end));
//                    
//                    if(fstart>fend)
//                        s=s.substring(0,end)+s.charAt(start)+s.substring(end+1,n+1);
//                    else
//                       s=s.substring(0,start)+s.charAt(n-start)+s.substring(start+1,n+1);
//                    }
//                else
//                    count--;
//                    count++;
//                    start++;
//                    end=n-start;
//                }
//        }
        System.out.println(s);
        }
        
    }
    
