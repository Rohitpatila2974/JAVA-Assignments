package chapter_String;
import java.util.*;

import javax.lang.model.element.NestingKind;
public class question07 
{

	public static void main(String args[])
	{
	  String string="welcome to java";
	  
	  StringBuffer sb=new StringBuffer();
	  String str[]=string.split(" ");
	  
	  for(int i=0; i<str.length; i++)
	  {
		  str[i]=(str[i].substring(0,1).toUpperCase())+(str[i].substring(1));
		  sb.append(str[i]+" ");
		  
	  }
        System.out.println(sb);
	   
		
	}
}
