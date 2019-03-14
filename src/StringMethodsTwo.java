public class StringMethodsTwo {
public static void main(String args[]){
    
    String s="this is java and java is powerful";
    
    int pos1=s.indexOf('i');
    System.out.println(pos1);
    
    int pos2=s.indexOf('i', 4);
    System.out.println(pos2);
    
    int pos3=s.indexOf("is powerful");
    System.out.println(pos3);
    
    int pos4=s.lastIndexOf('i');
    System.out.println(pos4);
}    
}
/*
    int indexOf(char)
    int indexOf(char,int)
    int indexOf(String)
    int indexOf(String, int)

    int lastIndexOf(char)
    int lastIndexOf(char,int)
    int lastIndexOf(String)
    int lastIndexOf(String,int)

*/