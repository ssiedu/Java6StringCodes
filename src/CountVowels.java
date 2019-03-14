public class CountVowels {
public static void main(String args[]){
    String s="this is java and we are counting vowels using string methods";
    int vowels=0;
    
    for(int i=0; i<s.length();i++){
        char tmp=s.charAt(i);
        if(tmp=='a' || tmp=='e' || tmp=='i' || tmp=='o' || tmp=='u'){
        vowels++;    
        }
    }
    
    
    /*
    char ch[]=s.toCharArray();
    
    for(char tmp:ch){
        
        if(tmp=='a' || tmp=='e' || tmp=='i' || tmp=='o' || tmp=='u'){
        vowels++;    
        }
        
    }
    */
    System.out.println("Total Vowels : "+vowels);
    
    
}    
}
/*
    int length()
    counts the no of characters  (strlen)
*/