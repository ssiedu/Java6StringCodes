public class StringConstructorsDemo {
public static void main(String args[]){
    
    char ch[]={'a','b','c','d','e','f','g','h'};
    byte b[]={65,66,67,68,69,70,71,72,73,74};
    
    String s1=new String();
    String s2=new String("indore");
    String s3=new String(ch);
    String s4=new String(ch,2,3);
    String s5=new String(b);
    String s6=new String(b,0,5);
    
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);
}    
}
/*
String()
String(String)
String(char[])
String(char[],int offset,int totalChars)
String(byte[])
String(byte[],int,int)
*/