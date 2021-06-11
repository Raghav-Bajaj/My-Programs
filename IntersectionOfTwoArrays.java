class Solution {
    public int[] intersect(int[] num1, int[] num2) {
         Arrays.sort(num1);
        Arrays.sort(num2);
        int  n1 = num1.length ;
        int n2 = num2.length ;
        ArrayList<Integer> arr = new ArrayList<>();
      
        int i = 0  , j = 0 ,k=0;
        while(i<n1 && j < n2){
            if(num1[i] == num2[j]){
               arr.add(num1[i]);
                i++;
                j++;
                k++;
            }else if(num1[i] > num2[j]){
                j++;
            }else{
                i++;
            }
        }
           int[] res = new int[arr.size()];
        for(i = 0 ; i < arr.size() ; i++){
            res[i] = arr.get(i);
        }
        return res ;
    }
    
}
