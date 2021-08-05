import java.util.*;

public class Main {

  //~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~
  public static int minDominoRotations(int[] top, int[] bottom) {
   int count1 = 0 ;
   int count2 = 0 ;
   int count3 = 0 ;
   int count4 = 0 ;
   int n = top.length , i = 0  ;
   int numb1 = top[0];
   int numb2 = bottom[0] ;
   while(i < n)
   {
      if( count1 != Integer.MAX_VALUE )
       {
            if(top[i] == numb1)
       {
         
       }else if(bottom[i] == numb1)
       {
           count1++;
 
       }else{
           count1 = Integer.MAX_VALUE ;
       }
       }
       if( count2 != Integer.MAX_VALUE )
       {
            if(bottom[i] == numb1)
       {
      
 
       }else if(top[i] == numb1)
       {     count2++ ;
       }else{
           count2 = Integer.MAX_VALUE ;
       }
       }
       if( count3 != Integer.MAX_VALUE )
       {
           if(bottom[i] == numb2)
       {

       }else if(top[i] == numb2)
       {
           count3++;

       }else{
           count3 = Integer.MAX_VALUE ;
  
       }
       }
       if(  count4 != Integer.MAX_VALUE )
       {
            if(top[i] == numb2)
       {
          

       }else if(bottom[i] == numb2)
       {
            count4++ ;
       }else{
           count4 = Integer.MAX_VALUE ;
       }
       }
       i++;
      
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
