//SwapCharFirstToLastUsingString 
class FirstToLastUsingString
{ 
public static void main(String args[])
 {
    String s="sahil";
	System.out.print(s+" = ");
    StringBuilder sb=new StringBuilder();
    
    for(int i=1;i<s.length();i++)
    sb.append(s.charAt(i));
    sb.append(s.charAt(0));
	System.out.print(sb);
 } 
	
} 