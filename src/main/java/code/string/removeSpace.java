package code.string;

public class removeSpace {
  public static void main(String[] args) {
    String s=" W el c om e";
    String s1="";
    for(int i=0;i<s.length();i++){
      char s2=s.charAt(i);
      if(s2!=' '){
        s1=s1+s.charAt(i);
      }
    }
    System.out.println(s1);
  }
}
