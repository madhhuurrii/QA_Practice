package code.string;

public class StringComparison {
  public static void main(String[] args) {
    String s="hello good morning";
    String s1="hello good morning";

    if(s.length()!=s1.length()){
      System.out.print("Strings not equal");
    }
    else{
      int f=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=s1.charAt(i)){
          //System.out.print("Strings not equal");
          f=-1;
          break;
        }
      }
      if(f==0){
        System.out.print("Strings are equal");
      }
      else{
        System.out.print("Strings not equal");
      }
    }
  }
}
