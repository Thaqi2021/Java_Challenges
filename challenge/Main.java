package challenge;

import java.util.*; 
import java.io.*;

class Main {//Medium string Challenge

  public static String StringChallenge(String str) {
    // code goes here  
          char c[]=str.toCharArray();
  int p=1;
  int m=0;
  String st="";
    for(int i=0;i<c.length;i++){
    	char t =c[i];
    	A:for(int j=i+1;j<c.length;j++){
          if(c[i]==c[j]) {
              ++p;
              i++;
          }
          else {
        	  break A;
          }
      
    	}
  	  st+=p+""+t;
  	  p=1;   	
    }
    return st;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StringChallenge(s.nextLine())); 
   
  }

}