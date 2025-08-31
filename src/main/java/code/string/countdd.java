package code.string;

public class countdd {
  public static void main(String[] args) {
    String s="madhuri  19@sies.gst.ac.in ";
    int vowels=0,consonants=0,digit=0,spaces=0;
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      if(Character.isAlphabetic(c)){
        if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u' ){
          vowels=vowels+1;
        }
        else{
          consonants=consonants+1;
        }

      }
      else if(Character.isDigit(c)){
        digit=digit+1;
      }
      else if(c==' '){
        spaces=spaces+1;
      }
      else{
        continue;
      }
    }
    System.out.println("Vowels: "+vowels+" Consonants: "+ consonants+" Digit: "+digit+" Spaces: "+spaces);
  }
}
