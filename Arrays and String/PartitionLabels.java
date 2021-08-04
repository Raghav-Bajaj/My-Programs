import java.util.*;

public class Main {

  // ~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~
  public static List<Integer> partitionLabels(String s) {
HashMap<Character,Integer> map = new HashMap<>();
for(int i = 0 ; i  < s.length() ; i++)
{
    char ch = s.charAt(i);
    map.put(ch,i);
}
int max= 0 ;
int pre = -1 ;
List<Integer> res = new ArrayList<>();
for(int i = 0 ; i  < s.length() ; i++)
{
    max = Math.max(max , map.get(s.charAt(i)));
    if(max == i)
    {
        res.add(max - pre) ;
        pre = max ; 
    }
}
return res ;
  }

  // ~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    List<Integer> res = partitionLabels(str);
    for (int val : res) {
      System.out.print(val + " ");
    }
  }
}
