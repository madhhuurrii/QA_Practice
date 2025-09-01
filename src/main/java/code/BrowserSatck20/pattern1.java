package code.BrowserSatck20;

// 1
// 122
// 122333
// 1223334444

public class pattern1 {
  public static void main(String[] args) {
    int n = 4;
    
    for(int i=0;i<n;i++){
      for(int j=1;j<=i+1;j++){
        for(int k=1;k<=j;k++){
          System.out.print(j);
        }
      }
      System.out.println();
    }
  }
}
