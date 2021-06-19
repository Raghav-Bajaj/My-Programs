import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       char[] arr = str.toCharArray();
       HashMap<Character , Integer> map = new HashMap<>();
       int i = 0 ;
       while(i < arr.length)
       {
           if(map.containsKey(arr[i])){
             map.put(arr[i] ,             map.get(arr[i]) + 1 );
           }else{
               map.put(arr[i] , 1);
           }
           i++;
       }
       
       Set<Character> set =  map.keySet();
       int max = 0 ;
       for(Character ch : set)
       {
           if(map.get(ch) > max)
           {
               max = map.get(ch) ;
           }
       }
       
       Character cha = 'a';
    for(Character ch : set)
       {
          if(map.get(ch) == max){
              cha = ch ;
          }
       }
       System.out.println(cha);
    }

}
