
import java.util.StringTokenizer;




public class STDemo {
public static void main(String args[]){
    
    //String s="java oracle php python";
    //StringTokenizer st=new StringTokenizer(s);
    
    String s="java,oracle,python,linux,php";
    StringTokenizer st=new StringTokenizer(s,",");
    
    
    int n=st.countTokens();
    
    System.out.println("Tokens : "+n);
    
    
    while(st.hasMoreTokens()){
        
    System.out.println(st.nextToken());
        
    }
}    
}
/*
    StringTokenizer(String)
    StringTokenizer(String,String)
    String nextToken()
    boolean hasMoreTokens()
    int countTokens()




*/