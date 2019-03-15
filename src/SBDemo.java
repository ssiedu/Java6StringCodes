public class SBDemo {
public static void main(String[] args) {

    StringBuffer sb=new StringBuffer("abcdefgh");
    System.out.println(sb);
    //sb.append("XYZ");
    //sb.insert(0, "XYZ");
    //sb.replace(1, 5, "PQRS");
    //System.out.println(sb.length());
    //sb.setLength(15);
    //System.out.println(sb.length());
    //sb.setCharAt(3, 'Z');
    //sb.deleteCharAt(3);
    //sb.delete(1,4);
    sb.reverse();
    System.out.println(sb);
    
    String s=sb.toString();
    
}
}
/*
    reverse, toString
    deleteCharAt, delete,
    append, insert, replace
    setLength, setCharAt, 




*/
