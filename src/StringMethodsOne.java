public class StringMethodsOne {
public static void main(String args[]){
    
    String s1=new String("indore");
    String s2=new String("Indore");
    String s3=new String("bhopal");
    String s4=new String("india");
    
    boolean b1=s1.equals(s2);
    System.out.println(b1);

    boolean b2=s1.equalsIgnoreCase(s2);
    System.out.println(b2);
    
    boolean b3=s1.startsWith("in");
    System.out.println(b3);
    
    boolean b4=s1.endsWith("re");
    System.out.println(b4);
    
    int n=s2.compareTo(s1);
    System.out.println(n);
}    
}
/*
    boolean equals(String)
    boolean equalsIgnoreCase(String)
    boolean startsWith(String)
    boolean endsWith(String)
    int compareTo(String)


*/