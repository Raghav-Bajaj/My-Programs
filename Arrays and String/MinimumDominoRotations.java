import java.util.*;

public class Main {

  //~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~
  public static int minDominoRotations(int[] top, int[] bottom) {
   int count1 = 0 ;
   int count2 = 0 ;
   int n = top.length , i = 1  ;
   int numb = top[0];
   while(i < n)
   {
       if(top[i] == numb)
       {
           i++;
       }else if(bottom[i] == numb)
       {
           count1++;
           i++;
       }else{
           count1 = Integer.MAX_VALUE ;
           break ;
       }
   }
   i = 1;
    while(i < n)
   {
       if(top[i] == numb)
       {
           count2++ ;
           i++;
       }else if(bottom[i] == numb)
       {
           
           i++;
       }else{
           count2 = Integer.MAX_VALUE ;
           break ;
       }
   }
   int count3 = 0 ;
   int count4 = 0 ;
   i = 1  ;
   numb = bottom[0];
   while(i < n)
   {
       if(bottom[i] == numb)
       {
           i++;
       }else if(top[i] == numb)
       {
           count3++;
           i++;
       }else{
           count3 = Integer.MAX_VALUE ;
           break ;
       }
   }
   i = 1;
    while(i < n)
   {
       if(bottom[i] == numb)
       {
           count4++ ;
           i++;
       }else if(top[i] == numb)
       {
           
           i++;
       }else{
           count4 = Integer.MAX_VALUE ;
           break ;
       }
   }
   int res = Math.min(Math.min(count1,count2) , Math.min(count3,count4));
   if(res == Integer.MAX_VALUE)
   {
       return -1 ;
   }
   return res ;
   
  }

  //~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] top = new int[n];
    int[] bottom = new int[n];

    // read top
    for (int i = 0; i < top.length; i++) {
      top[i] = scn.nextInt();
    }
    // read bottom
    for (int i = 0; i < bottom.length; i++) {
      bottom[i] = scn.nextInt();
    }

    int rotation = minDominoRotations(top, bottom);
    System.out.println(rotation);
  }
}
