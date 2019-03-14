public class StringMethodsThree {
public static void main(String args[]){
    
    String s="ABCDEFG";
    char ch=s.charAt(2);
    System.out.println(ch);
    System.out.println("__________________________");
    char c[]=s.toCharArray();
    for(char tmp:c){
        System.out.println(tmp);
    }
    System.out.println("__________________________");
    byte b[]=s.getBytes();
    
    for(byte tmp:b){
        System.out.println(tmp);
    }
    System.out.println("__________________________");
    
}    
}
/*
    char charAt(int)
    char[] toCharArray()
    byte[] getBytes()

*/
