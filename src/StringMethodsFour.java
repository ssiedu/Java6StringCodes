public class StringMethodsFour {
public static void main(String[] args) {

    String s1="this is java";
    String s2=s1.toUpperCase();
    System.out.println(s1);
    System.out.println(s2);
    System.out.println("__________________________________");
    String s3="INDORE";
    String s4=s3.toLowerCase();
    System.out.println(s3);
    System.out.println(s4);
    System.out.println("__________________________________");
    String s5="  this is java  ";
    String s6=s5.trim();
    System.out.println(s5.length());
    System.out.println(s6.length());
    System.out.println("__________________________________");
    String s7="java code for string methods";
    String s8=s7.substring(5);
    String s9=s7.substring(5, 15);
    System.out.println(s7);
    System.out.println(s8);
    System.out.println(s9);
    System.out.println("__________________________________");
    String s10="java-oracle-python-php-java";
    String s11=s10.replace('-', '#');
    String s12=s10.replace("java", "j2se");
    System.out.println(s10);
    System.out.println(s11);
    System.out.println(s12);
    System.out.println("__________________________________");
    String s13="Java"; 
    String s14="Examples";
    String s15=s13.concat(s14);
    System.out.println(s13);
    System.out.println(s14);
    System.out.println(s15);
    System.out.println("__________________________________");
    String s16="java examples are simple and easy to implement";
    boolean b=s16.contains("easy");
    System.out.println(b);
    String s17="indore,bhopal,delhi,mumbai,chennai";
    String ar[]=s17.split(",");
    for(String tmp:ar){
        System.out.println(tmp);
    }
    System.out.println("__________________________________");
    
    
    
    
}
}
/*
    String concat(String)
    String replace(String,String)
    String replace(char,char)
    String substring(int)
    String substring(int,int)
    String trim()
    String toUpperCase()
    String toLowerCase()
*/