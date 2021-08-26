import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
    static int mask = Integer.MIN_VALUE ;
    public static boolean isValidBST(TreeNode root) {
        return Checker(root);
    }
    public static boolean Checker(TreeNode root)
    {
        if(root == null)
        {
            return true ;
        }
        boolean p1 = Checker(root.left);
        if(p1 == false) return false ;
        else{
        if(root.val < mask) return false ;
        mask = root.val ;
        }
       
        boolean p2 = Checker(root.right);
        if(p2 == false) return false ;
        else return true ;
    }

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1){
            IDX[0]++;
            return null;
        }

        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);
        System.out.println(isValidBST(root));
    }

    public static void main(String[] args) {
        solve();
    }
}
