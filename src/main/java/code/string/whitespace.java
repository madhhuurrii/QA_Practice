package code.string;

public class whitespace {
  public static void main(String[] args) {
    String s="  hello  GoodM  orning  ";
    s=s.trim();
    String s1="";
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)!=' '){
        s1=s1+s.charAt(i);
      }
    }
    System.out.println(s1);

  }
}
