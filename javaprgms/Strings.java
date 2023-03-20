import java.io.*;
import java.lang.*;
class Strings
{
  public static void main(String args[])
  {
     String str1="Java Program";
     String str2=new String("CSE");
    System.out.println("length of str1 is :"+str1.length());
    System.out.println("IndexOf with string "+str1.indexOf("Pro"));
    System.out.println("IndexOf with Char "+str1.indexOf('g'));
    System.out.println("charAt method "+str1.charAt(7));
    System.out.println("replace method: "+str1.replace(str1,str2));
    str1="Java Program";
    System.out.println("Upper case method: "+str1.toUpperCase());
    System.out.println("Lower case method: "+str1.toLowerCase());
    System.out.println("Compare method "+str1.compareTo(str2));
    String str3="  Hello ";
    System.out.println("trim method:"+str3.trim());
    System.out.println("concat two strings: "+str1.concat(str2));
    String str4="CSE";
    System.out.println("Equals method: "+str2.equals(str4));
    if(str1==str2)
       System.out.println("both strings are same");
    else
       System.out.println("both strings are not same");
    String str5="This is \"java\" program";
    System.out.println(str5);
    System.out.println("string empty method: "+str1.isEmpty());   
    String str6=""; 
    System.out.println("string empty method: "+str6.isEmpty());   
    System.out.println("contains method with string "+str1.contains("Pro"));
    System.out.println("contains method with char "+str1.contains("M"));
    System.out.println("substrig method "+str1.substring(3));
    System.out.println("String Starts with "+str1.startsWith("J"));
    System.out.println("String Starts with "+str1.startsWith("A"));
    System.out.println("String ends with "+str1.endsWith("m"));
   System.out.println("String ends with "+str1.endsWith("a")); 

  
  // String reverse() method implementation
  String str = "This is AI&ML";
  StringBuilder sb = new StringBuilder(str);
  str = sb.reverse().toString();
  System.out.println("Reversed String : " + str);

  }
}
                                                                                           
    
    