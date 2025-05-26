package code.string;

public class removeChar {
  public static void main(String[] args) {
    String s="madhuri@sies.c.in";
    String s1="";
    for(int i=0;i<s.length();i++){
      if(Character.isAlphabetic(s.charAt(i))){
         s1=s1+s.charAt(i);
      }
    } 
    System.out.println(s1);
   }
}
