
import java.util.StringJoiner;

public class SJDemo {
public static void main(String args[]){
    
    String s1="indore";
    String s2="bhopal";
    String s3="delhi";
    
    //StringJoiner sj=new StringJoiner(";");
    StringJoiner sj=new StringJoiner(",","[","]");
    sj.add(s1); sj.add(s2); sj.add(s3);
    System.out.println(sj);
    
}    
}
/*
    StringJoiner(String)
    StringJoiner(String,String,String)
*/