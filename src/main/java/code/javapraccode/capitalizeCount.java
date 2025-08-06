package code.javapraccode;

public class capitalizeCount {
  public static void main(String[] args) {
    String s = "Hello Good morning Madhuri m";
    int count=0;
    
    for(int i=0;i<s.length()-1;i++){
      if(i==0 & Character.isUpperCase(s.charAt(i))){
        count++;
      }
      else if(s.charAt(i)==' ' & Character.isUpperCase(s.charAt(i+1)) ){
        count++;
      }
      else{
        continue;
      }
    }
    System.out.println(count);
  }
}
