package code.array;

import java.util.Scanner; 
public class search_ele
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int x= sc.nextInt();
	   int a[]=new int[x];
	   for(int i=0;i<x;i++){
	       a[i]=sc.nextInt();
	   }
	   int e= sc.nextInt();
	   for(int i=0;i<x;i++){
	       if(a[i]==e){
	           System.out.println("Element Found!");
	       }
	       
	   }
	}
}
