package lamda.com;

import java.util.HashMap;
import java.util.Map;

public class CoreJava {
	public static void main (String[] args){
	// first repaeteda element
		//ArrayindexOutOfBoundsException if you give i<=
		String st1="FGTNVVVVVVVVVGFHHHHHHHHHHHHHH";
		char[] dtr2=st1.toCharArray();
	     Map<String,Integer> abc=new HashMap<String,Integer>();
		for(int i=0 ;i<st1.toCharArray().length;i++){
                if(abc.containsKey(String.valueOf(dtr2[i]))){
                	System.out.println("element is " +dtr2[i]) ;
                    break;    	
                }else{
                	abc.put(String.valueOf(dtr2[i]), new Integer(1));
                }
		}
	}

}


